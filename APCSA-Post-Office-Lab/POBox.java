/**
 * The POBox class creates a PO Box object. The object contains
 * the PO Box owner's name and number of late payments which is 
 * called by the PostOffice class. This class is used to hold the names and
 * late payments of each PO Box in the Post Office.
 * @author Vishesh Prasad 
 * Collaborators: N/A
 * Teacher Name: Mrs. Ishman
 * Period: 4
 * Due Date: 04-30-2020
 */

/**
 * A POBox object contains 2 values:
 * 1. The name of the owner of the POBox
 * 2. How many times the owner has been late
 *    paying the rental fee for the POBox
 */ 
public class POBox
{
  private String name;
  private int latePayments;
  
  /**
   * Given a the owner's name and the number of times they made late payments,
   * construct a POBox object using the information.
   * 
   * @param name the owner's name
   * @param numLatePayments how many times the owner had to pay late fees
   */ 
  public POBox(String name, int numLatePayments)
  {
    this.name = name;
    latePayments = numLatePayments;
  }
  
  /** 
   * Returns the name of the owner of this PO Box
   * 
   * @return name of the owner of this PO Box
  */
  public String getName()
  {
    return name;
  }

  /** 
   * Returns how many times the owner had to pay a 
   * late fee for the rental of the PO BOx.
   * 
   * @return number of late fees paid by the owner
   */
  public int getNumLatePayments()
  {
    return latePayments;
  }
  
  /**
   * This method returns the PO Box information.
   * Format of:
   * Name NumberOfLatePayments
   * 
   * @return the PO Box information as a String
   */
  public String toString()
  {
    return name + " " + latePayments;
  }
}
