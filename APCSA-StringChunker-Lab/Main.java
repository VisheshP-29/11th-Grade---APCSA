/**
 * The Main class gives the StringChunker class a long string and 
 * a number. The long string will then be cut up into chunks that 
 * are the number length. It then prints the starting chunk,
 * number of chunks containing a certain string, and the all the chunks
 * that havn't been removed because they start with a vowel.
 * @author Vishesh Prasad 
 * Collaboraters: N/A
 * Teacher Name: Mrs. Ishman
 * Period: 4
 * Due Date: 04-09-2020
 */

/**
 * This is the tester file for StringChunker.
 */ 
public class Main 
{
  /**
   * Main method used to test StringChunker objects
   * 
   * @param args this parameter is not being used in this lab.
   */ 
  public static void main(String[] args) 
  {
    StringChunker firstChunk = new StringChunker("catdogratwhalenarwhalelephant", 3);
    System.out.println("Starting State of String Chunks:");
    System.out.println(firstChunk);
    
    System.out.println();
    int countAChunks = firstChunk.countChunks("a");
    System.out.println("There are " + countAChunks + " chunks with the letter \"a\" in it.");
    
    System.out.println();
    System.out.println("Removing chunks that start with vowels...");
    firstChunk.remStartVowelChunks( );
    System.out.println("New state of chunks after remove:");
    System.out.println(firstChunk);
    System.out.println();
    
    StringChunker secondChunk = new StringChunker("AndyWarholPabloPicassoVincentvanGoghMichelangeloHenriMatisseJacksonPollockEdvardMunchClaudeMonet", 5);
    System.out.println("Starting State of String Chunks:");
    System.out.println(secondChunk);
    
    System.out.println();
    countAChunks = secondChunk.countChunks("A");
    System.out.println("There are " + countAChunks + " chunks with the letter \"A\" in it.");
    
    countAChunks = secondChunk.countChunks("v");
    System.out.println("There are " + countAChunks + " chunks with the letter \"v\" in it.");
    
    System.out.println();
    System.out.println("Removing chunks that start with vowels...");
    secondChunk.remStartVowelChunks( );
    System.out.println("New state of chunks after remove:");
    System.out.println(secondChunk);
    System.out.println();
    
  }
}