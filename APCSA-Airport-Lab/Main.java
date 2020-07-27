/* Main class used to test Airport and IntlAirport
 * @author J.Yee
 * Collaborators: R.Bailey, K. Harden
 * Teacher: PISD
 * Period:
 * Due Date: 04-06-20
 * */
import java.util.*;
import java.io.*;

/**
 * This is the tester class for the Week #2 Airport Lab
 */ 
public class Main
{
  /**
   * This is the main method used to test your code.
   * 
   * @param args this parameter is not being used in this lab.
   */ 
  public static void main(String[] args) throws IOException
  {
  	System.out.println("Displaying a sample international airport entry:");
    Airport a1 = new Airport("TXDFW",182,true);
    System.out.println(a1+"\n");
    System.out.println("Displaying a sample non-international airport entry:");
    Airport a2 = new Airport("CTBDL",23,false);
    System.out.println(a2 + "\n");
    
    Scanner reader = new Scanner(new File("AirportList.txt"));
    Airport[] allAirports = new Airport[44];
    int index = 0;
    
    while(reader.hasNextLine())
    {
      Scanner lineReader = new Scanner(reader.nextLine());
      String code = lineReader.next();
      int gates = Integer.parseInt(lineReader.next());
      String international = lineReader.next();
      allAirports[index] = new Airport(code, gates, international.equals("TRUE"));
      index++;
    }
    
    System.out.println("All Airports:");
    String result = Arrays.toString(allAirports);
    result = result.replaceAll(",","\n");
    System.out.println(" "+result.substring(1,result.length()-1) + "\n");
    
    IntlAirport iAirList = new IntlAirport(allAirports);
    System.out.println("International Airports Only:");
    result = Arrays.toString(iAirList.getInternationList());
    result = result.replaceAll(",","\n");
    System.out.println(" "+result.substring(1,result.length()-1) + "\n");

    System.out.println("Orginal DFW airport details:");
    System.out.println(a1);
    System.out.println("\nUpdating DFW gates because of human malware!");
    Airport a3 = iAirList.updateNumGates("TXDFW", 100);
    System.out.println(a3 + "\n");
    System.out.println("Testing update gates with a fake airport.");
    Airport a4 = iAirList.updateNumGates("ABCDE", 20);
    System.out.println(a4 + "\n");
    
    System.out.println("Getting list of all international airport IATA codes:");
    result = Arrays.toString(iAirList.getAirportIATAList());
    result = result.replaceAll(",","\n");
    System.out.println(" "+result.substring(1,result.length()-1) + "\n");
  }
}