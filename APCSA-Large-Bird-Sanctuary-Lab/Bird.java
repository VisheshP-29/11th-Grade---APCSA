/**
 * The Bird class creates a bird object that holds the bird's name, number 
 * of eggs, wingspan, and if it is healthy or not. This information is 
 * the used in the Main and LargeBirdSanctuary classes to accomplish 
 * certain tasks.
 * @author Vishesh Prasad 
 * Collaboraters: N/A
 * Teacher Name: Mrs. Ishman
 * Period: 4
 * Due Date: 04-16-2020
 */


/**
 * Represents a nesting bird
 */
public class Bird
{
 	private String type;
 	private int numEggs;
 	private double wingspan;
 	private boolean isHealthy;

  /** 
   * Constructs a bird with a specified type, number of numEggs,
   * wingspan in inches, and health status
   * @param type the bird type
   * @param eggs the number of numEggs
   * @param span the bird's wingspan
   * @param health true if the bird is healthy, false otherwise
   */
 	public Bird(String type, int eggs, double span, boolean health)
 	{
 		this.type = type;
 		numEggs = eggs;
 		wingspan = span;
 		isHealthy = health;
 	}

  /**
   * Returns the bird's type 
   * @return the type of the bird
   */
 	public String getType()
 	{
 		return type;
 	}

  /**
   * Returns the number of bird eggs 
   * @return the number of eggs 
   */
 	public int getNumEggs()
 	{
 		return numEggs;
 	}

  /**
   * Returns the bird wingspan 
   * @return the bird wingspan 
   */
 	public double getWingspan()
 	{
 		return wingspan;
 	}

 	/**
 	 * Returns true if the bird is healthy and false otherwise
 	 * @return true if the bird is healthy and false otherwise
 	 */
 	public boolean isHealthy()
 	{
 	  return isHealthy;
 	}

  /**
   * Returns a String version of the bird
   * @return a String version of the bird
   */
	public String toString()
	{
	  String health = isHealthy ? "healthy" : "sick";
		return String.format ("%-30s%-2d%7.2f  %s",type,numEggs,wingspan,health);
	}
}