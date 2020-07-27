/**
 * The Main class runs the tests from the BallonTest class
 * and prints the outputs. It first runs the test 15 times with
 * 8 pumps and prints if each balloon popped or not. It then runs
 * thousands of tests with different number of pumps and prints
 * the proportion of the balloons that popped.
 * @author Vishesh Prasad 
 * Collaboraters: N/A
 * Teacher Name: Mrs. Ishman
 * Period: 4
 * Due Date: 04-02-2020
 */

class Main 
{
  public static void main(String[] args) 
  {
    
    BalloonTest one;
    
    /* runs a series of tests on a balloon with 8 pumps
       some should result in true/some in false (it's random)
    */
    System.out.println("15 tests on a balloon with 8 pumps:");
    for(int i = 1; i <= 15; i++)
    {
      one = new BalloonTest(8);
      System.out.println(one.testBalloon());
    }
    System.out.println();
    
    /* calls the runTests method to determine the proportion of tests in which a balloon with a minimum of 25 pumps pops in 1000 tests 
    */
    System.out.println("10000 tests with 18 pumps:");
    BalloonTest two = new BalloonTest(18);
    System.out.println(two.runTests(10000));
    
    System.out.println("\n5000 tests with 22 pumps:");
    BalloonTest three = new BalloonTest(22);
    System.out.println(three.runTests(5000));
  }
}