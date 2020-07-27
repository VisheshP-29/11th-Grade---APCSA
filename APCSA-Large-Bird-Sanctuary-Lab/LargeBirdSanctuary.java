/**
 * The LargeBirdSanctuary class makes an array that contains birds with a
 * wingspan of at least 48(contsant). The amount of birds in the array is
 * limited by a maximum capacity determined by a given amount. The class 
 * then counts the number of healthy birds in the array. Finally, it 
 * gets rid of all the sick birds in the array.
 * @author Vishesh Prasad 
 * Collaboraters: N/A
 * Teacher Name: Mrs. Ishman
 * Period: 4
 * Due Date: 04-16-2020
 */


import java.util.*;

/**
 * Represents a collection of different birds in a bird sanctuary
 */
 public class LargeBirdSanctuary
 {
 	public static final int MIN_WINGSPAN = 48;

 	private Bird[] bigBirds;

 	/**
 	 * Constructs a LargeBirdSanctuary with a maximum capacity and fills the
 	 * sanctuary by accepting all birds from a list that have a specified minimum wingspan
 	 * until it reaches maxCapacity
 	 * If it does not reach maxCapacity, the sanctuary will not be full
 	 * @param allBirds the list of birds
 	 * @param maxCapacity the maximum capacity for large birds at the sanctuary
 	 */
 	public LargeBirdSanctuary(List<Bird> allBirds, int maxCapacity)
 	{
 		bigBirds = new Bird[maxCapacity];
 		int counter = 0;
 		for(int index = 0; index < allBirds.size() && counter < maxCapacity; index++)
 		{
 			Bird checkBird = allBirds.get(index);
 			if(checkBird.getWingspan() >= MIN_WINGSPAN)
 			{
 				bigBirds[counter] = checkBird;
 				counter++;
 			}
 		}
 	}


 	/**
 	 * Calculates and returns the number of healthy birds in the sanctuary
 	 * Precondition: the array is either full or all existing 
 	 * birds are positioned in the leftmost slots in the array
 	 * with null slots at the end
 	 * @return the number of healthy birds in the sanctuary
 	 */
 	public int getHealthyBirdCount()
 	{
 		int numHealthy = 0;
 		for(int index = 0; index < bigBirds.length; index++)
 		{
 			if(bigBirds[index] != null)
 			{
 				Bird checkBird = bigBirds[index];
 				if(checkBird.isHealthy())
 				{
 					numHealthy++;
 				}
 			}
 		}
 		return numHealthy;
 	}


	/**
	 * Removes all birds that are not healthy to the
	 * left while maintaining their relative order
	 * Generates and returns a list of removed birds
	 * Precondition: the array is either full or all existing birds are positioned in
 	 * the leftmost slots in the array with null slots at the end
	 * Postcondition: the array is still filled from the left with the remaining birds in the same
	 * relative position as before the removal
	 * @return a list of birds that are removed
	 */
	public List<Bird> removeSickBirds()
	{
		List<Bird> sickBirds = new ArrayList<Bird>();
		for(int index = 0; index < bigBirds.length && bigBirds[index] != null; index ++)
		{
			Bird checkSick = bigBirds[index];
			if(checkSick != null && checkSick.isHealthy() == false)
			{
				sickBirds.add(checkSick);
				int destroy = index;
				if(index != bigBirds.length - 1)
				{
					while(destroy + 1 < bigBirds.length)
					{
						bigBirds[destroy] = bigBirds[destroy + 1];
						destroy++;
					}
					index --;
				}
				bigBirds[destroy] = null;
			}
		}
		return sickBirds;
	}


	/**
	 * Returns a String version of the list of birds
	 * @return a String version of the list of birds
	 */
	@Override
	public String toString()
	{
		String ret = "Number of Healthy Birds: " + getHealthyBirdCount() + "\n";
		for(Bird bird : bigBirds)
			ret += bird + "\n";
		return ret;
	}
 }