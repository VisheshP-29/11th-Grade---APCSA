/**
 * The StringChunker class chunks the given string by into smaller
 * strings that contain a given number of characters. It then identifies
 * the nuber of chunks containing a given string. Finally, it removes
 * the chunks that have a vowel as its starting chracter.
 * @author Vishesh Prasad 
 * Collaboraters: N/A
 * Teacher Name: Mrs. Ishman
 * Period: 4
 * Due Date: 04-09-2020
 */

// Complete ALL javadocs and follow proper coding style!

import java.util.*;

public class StringChunker
{
  private ArrayList<String> chunkList;
  
  /**
   * Constructor instantiating the ArrayList chunkList with the chunks
   * of strings.
   * @param toBeChunked the string that has to be chunked
   * @param chunkLength the length od each chunk
   */ 
  public StringChunker(String toBeChunked, int chunkLength)
  {
    // Complete item 1 here...
    chunkList = new ArrayList<String>();
    for(int index = 0; index < toBeChunked.length(); index+=chunkLength)
    {
    	String cut = "";
    	if ((index + chunkLength) > toBeChunked.length())
    	{
    		cut = toBeChunked.substring(index,toBeChunked.length());
    	}
    	else
    	{
    		cut = toBeChunked.substring(index,(index + chunkLength));
    	}
     	chunkList.add(cut);
    }
  }
  
  
  /**
   * Counts the number of chunks containing a given String
   * @param find the string to be found in the chunks
   * @return the nuber of chunks containing the string
   */ 
  public int countChunks(String find)
  {
    int numHave = 0;
    for (String check : chunkList)
    {
    	if(check.contains(find))
    	{
    		numHave++;
    	}
    }
    return numHave;
  }
  
  
  /**
   * Removes the chunks that start with a vowel
   */ 
  public void remStartVowelChunks()
  {
    String vowel = "aeiouAIEOU";
    for(int index = 0; index < chunkList.size(); index++)
    {
    	String check = chunkList.get(index);
    	String vowelCheck = check.substring(0,1);
    	if(vowel.contains(vowelCheck))
    	{
    		chunkList.remove(index);
    		index--;
    	}
    }
  }
  
  
  /**
   * toString returns the state of the Chunk List.
   * 
   * @return the state of the Chunk List.
   */ 
  public String toString()
  {
    return chunkList.toString( );
  }
}