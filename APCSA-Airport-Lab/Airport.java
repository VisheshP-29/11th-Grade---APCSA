/* Airport Class makes an Airport Object and all of it accessor and mutator methods
 * @author J.Yee
 * Collaborators: R. Bailey, K. Harden 
 * Teacher: PISD
 * Period:
 * Due Date: 04-06-20
 */
public class Airport
{
  private String airportCode;//combined state and airport identificaion
  private int numGates;// number of gates at airport
  private boolean isInternational;
 
 
  /** default constructor give all instance variables a default value */ 
  public Airport()
  {
    airportCode = "Unknown";
    numGates = 0;
    isInternational = false;
  }
  
  /** overloaded constructor assign all instance variable a value
    * @param airCode value to assign to airportCode
    * @param aGates the vaue to assign to the gate
    * @param international value to assign isIntl */
  public Airport(String aCode, int aGates, boolean international)
  {
    airportCode = aCode;
    numGates = aGates;
    isInternational = international;    
  }
  
  /** accessor method to get the airport aCode
   * @return the String value of the objects airportCode*/
  public String getAirportCode()
  {
    return airportCode;
  }
  
  /** accessor method to get the number of gates
   * @return the number of gates the object has*/
  public int getNumGates()
  {
    return numGates;
  }
  
  /** accessor method to determine if the airport is an international airport
   * @return ture if the airport is international fals if not*/
  public boolean isInternational()
  {
    return isInternational;
  }
  
  /** changes the number of gates
   * @param newGates the value to chage the number of gates to*/
  public void setNumGates(int newGates)
  {
    numGates = newGates;
  }
  
  /** this method will change the state of the object to a formated String
  * @return the objects data into a formated string
  */
  public String toString()
  {
    return String.format("%-8s%-5d%-5s", airportCode, numGates, ""+isInternational); 
  }
}