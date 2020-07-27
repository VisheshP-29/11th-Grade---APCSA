/**
 * The PostOffice class creates a 2D ArrayList that holds a collection 
 * of PO Boxes. It uses a 2D ArrayList to visually represent the 
 * PO Boxes. The class also removes PO Boxes that have more than 
 * a given amount of late payments and returns the names whose
 * Po Boxes have been removed. This class represents an actual Post Office
 * that hold the POBox objects.
 * @author Vishesh Prasad 
 * Collaborators: N/A
 * Teacher Name: Mrs. Ishman
 * Period: 4
 * Due Date: 04-30-2020
 */

import java.util.*;

// Remember to write javadocs for the class description and the 2 methods you are writing.

/**
 * This PostOffice class is used to hold PO Boxes, remove those
 * with a number of late payments, and return names of those removed.
 */ 
public class PostOffice
{
  /* 2D Array of POBox objects. */
  private POBox[][] boxes;
  
  /** 
   * Constructs 2D ArrayList of POBox named boxes with given rows and 
   * columns. Add from given list of owners to 2D ArrayList. The ArrayList 
   * is filled in row-major order in the order that they appear while
   * traversing through the provided list of PO Boxes. Any empty PO Boxes
   * are represented by null.
   * @param ownerList list of PO Boxes to be added to 2D ArrayList
   * @param rows number of rows of 2D ArrayList
   * @param cols number of columns of 2D ArrayList
   */
  public PostOffice(List<POBox> ownerList, int rows, int cols)
  {
    boxes = new POBox[rows][cols];
    int index = 0;
    for(int r = 0; r < boxes.length; r++)
    {
    	for(int c = 0; c < boxes[r].length; c++)
    	{
    		if(index < ownerList.size())
    		{
    			boxes[r][c] = ownerList.get(index);
    			index++;
    		}
    	}
    }
  }
  
  /**
   * Finds and removes owners who have more than a given amount
   * of late payments. Returns names of those removed. The PO Boxes
   * are removed in column-major order and the list of names is in the 
   * order that they were removed. The removed PO Boxes are replaced
   * with a null.
   * @param allowedLatePmts max number of late payments to not be removed
   * @return ArrayList with names of those whose PO Boxes were removed
  */
  public List<String> removeOwnersLatePmts(int allowedLatePmts)
  {
  	ArrayList<String> latePmts = new ArrayList<String>();
  	for(int col = 0; col < boxes[0].length; col++)
  	{
  		for(int row = 0; row < boxes.length; row++)
  		{
  			if(boxes[row][col] != null)
  			{
  				int numLatePmts = boxes[row][col].getNumLatePayments();
  				if(numLatePmts > allowedLatePmts)
  				{
  					latePmts.add(boxes[row][col].getName());
 						boxes[row][col] = null;
  				}
  			}
  		}
  	}
  	return latePmts;
  }

  /**
   * Returns a string version of the PO Boxes in the Post Office in
   * rows and columns.  PO Box information is separated by semi-colons.
   * 
   * @return the PO Boxes in the Post Office as a String
   */ 
  public String toString( )
  {
    String result = "";
    for(POBox[] box : boxes)
    {
      result += java.util.Arrays.toString(box);
    }
    result = result.replace("[", "");
    result = result.replace("]", "\n");
    result = result.replace(",", ";");
    return result;
  }
}