/**
 * The BallonTest class tests the balloon to determine if they
 * pop or not. It sets a random diameter for the balloon between
 * 40 and 300. It then simulates pumps the increase the diameter
 * by a random integer between 2 and 15 for a given number of 
 * pumps. If the diameter extends the set max diameter at the
 * beginning, then the balloon pops. It also calculates the proportion
 * of the ballons that popped from a given number of tests.
 * @author Vishesh Prasad 
 * Collaboraters: N/A
 * Teacher Name: Mrs. Ishman
 * Period: 4
 * Due Date: 04-02-2020
 */

/**
 * A class representing balloon inflation tests 
 */
public class BalloonTest
{
  /** Maximum diameter before balloon pops */
  private int maxDiameter;
  
  /** Maximum number of pumps allowed to reach the goal */
  private int maxPumps;
  
  /**
   *Constructs a BalloonTest where numPumps is the maximum number of pumps required in the balloon test 
   * @param numPumps the maximum number of pumps
   * Precondition: numPumps > 0 
   */
  public BalloonTest(int numPumps)
  {
    maxDiameter = (int) (Math.random()  * (301 - 40)) + 40;
    maxPumps = numPumps;
  }
  
  /**
   * Returns an int representing the number of centimeters the balloon diameter increases in a pump 
   * @return the number of centimeters the balloon diameter increases
   */
  private int pumpImpact()
  {
    int randDiameter = (int) (Math.random() * (16 - 2)) + 2;
    return randDiameter;
  }
  
  /**
   * Simulates a balloon inflating over a series of pumps.  
   * Determines whether or not the balloon popped at any point
   * during the series of pumps.
   * @return true if the balloon popped and false otherwise
   */
  public boolean testBalloon()
  {
    boolean pop = false;
    int checkDiameter = 0;
    for (int pumps = 0; pumps < maxPumps; pumps++)
    {
      checkDiameter += this.pumpImpact();
      if (checkDiameter > maxDiameter)
      {
        pop = true;
        return pop;
      }
    }
    return pop;
  }
  
  /**
   *Runs numTests tests and returns the proportion of tests in which the balloon pops 
   * @param numTests number of tests to be run
   * Precondition: numTests > 0
   * @return the proportion of test in which the balloon pops 
   */
  public double runTests(int numTests)
  {
    double proportion = 0.0;
    double numPop = 0.0;
    for (int times = 0; times < numTests; times++)
    {
      boolean check = this.testBalloon();
      if (check == true)
      {
        numPop++;
      }
    }
    proportion = numPop / numTests;
    return proportion;
  }
}