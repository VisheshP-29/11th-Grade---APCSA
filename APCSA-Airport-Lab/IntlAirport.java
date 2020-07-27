/**
 * The IntlAirport class creates a list of international airports from
 * the given list of all airports. It then finds specific airports
 * by their code and updates their number of gates. Lastly it gets
 * the IATA code of each international airport.
 * @author Vishesh Prasad 
 * Collaboraters: N/A
 * Teacher Name: Mrs. Ishman
 * Period: 4
 * Due Date: 04-06-2020
 */

/**
 * This class represents a list of airports that fly planes internationally.
 */
public class IntlAirport
{
  // this is your ONLY instance variable.  Do not add more!
  private Airport[] intlAirportList;
  
  /**
   * Given an array of all airports, this constructor will make an IntlAirport
   * object containing all of the aiports from the list that fly internationally.
   * 
   * @param allAirports an array of Airports used to create the list of international Airports
   */ 
   public IntlAirport(Airport[] allAirports)
   {
   	int numIntl = 0;
   	for(Airport checkIntl : allAirports)
   	{
   		if(checkIntl.isInternational())
   		{
   			numIntl++;
   		}
   	}
   	intlAirportList = new Airport[numIntl];
   	int index = 0;
   	for(Airport checkIntl : allAirports)
   	{
   		if(checkIntl.isInternational())
   		{
   			intlAirportList[index] = checkIntl;
				index++;
   		}
   	}
   }


  
  /**
   * updateNumGates searches the list of international airports for a ceratin one
   * and updates the number of active gates for that airport.  This method will return
   * the airport that was found and changed OR null if that airport was not found.
   * 
   * @param aCode the code for an airport to updateNumGates
   * @param adjustedGates the new number of gates used at that Airport
   * @return the Airport object that was mutated OR null of not found
   */ 
   public Airport updateNumGates(String aCode, int adjustedGates)
   {
  		for (Airport find : intlAirportList)
   		{
   			String codeCheck = find.getAirportCode();
   			if(codeCheck.equals(aCode))
   			{
   				find.setNumGates(adjustedGates);
   				return find;
   			}
   		}
   		return null;
   }



  
  /**
   * This methood returns a list of IATA codes based on the airport code
   * of all international airports on the list.
   * 
   * An airport code is made up of 2 parts:
   * 1. The state abbreviation where it is located.
   * 2. The unique IATA code for that airport.
   * 
   * Example:
   * TXDFW is the airport code for DFW Airport.  The IATA code is DFW.
   * TXLOV is the airport code for Love Field Airport.  The IATA code is LOV.
   * 
   * NOTE: Not all IATA codes have to be 3 letters long.
   * 
   * @return an array of Strings containing all the IATA codes in the list of international Airports
   */ 
   public String[] getAirportIATAList()
   {
   		String IATAList[] = new String[intlAirportList.length];
   		for (int index = 0; index < intlAirportList.length; index ++)
   		{
   			Airport check = intlAirportList[index];
   			String getIATA = check.getAirportCode();
   			getIATA = getIATA.substring(2);
   			IATAList[index] = getIATA; 
   		}
   		return IATAList;
   }

  
  
  
  /**
   * getInternationList is an accessor method for the array
   * of international airports in an IntAirport object.
   * This method is used by the tester.
   * 
   * @return the array of international airport of an IntAirport object
   */ 
  public Airport[] getInternationList()
  {
    return intlAirportList;
  }
  
}