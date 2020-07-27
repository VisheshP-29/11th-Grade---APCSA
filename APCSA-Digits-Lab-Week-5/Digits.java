/**
 * The Digits class' methods get called by the test Main class.
 * It calculates and returns the sum of the digits in a given number, the 
 * number whose digits have the highest sum (given 3 numbers), and the
 * number of digits that are the same when given 2 numbers.
 * @author Vishesh Prasad 
 * Collaborators: N/A
 * Teacher Name: Mrs. Ishman
 * Period: 4
 * Due Date: 04-23-2020
 */

/**
 * A class providing methods to process digits in whole numbers
 */
public class Digits
{

	/**
	 * Returns the sum of the digits in a specified whole number
	 * @param number the number to digit sum
	 *    Precondition: number >= 0
	 * @return the sum of the digits
	 */
	public static int digitSum(int number)
	{
		int sum = 0;
		int hold = number;
		while (hold != 0)
		{
			sum += hold % 10;
			hold = hold / 10;
		}
		return sum;
	}

	/**
	 * Returns the number with the highest digit sum of three specified numbers
	 * @param num1 the first number
	 * @param num2 the second number
	 * @param num3 the third number
	 *    Precondition: num1 >= 0, num2 >= 0, num3 >= 0 
	 * @return the number with the highest digit sum
	 */
	public static int highestSum(int num1, int num2, int num3)
	{
		int sum1 = digitSum(num1);
		int sum2 = digitSum(num2);
		int sum3 = digitSum(num3);
		int highest = num1;
		if(sum2 > sum1)
		{
			if(sum3 > sum2)
			{
				highest = num3;
			}
			else
			{
				highest = num2;
			}
		}
		if(sum3 > sum1)
		{
			if(sum2 > sum3)
			{
				highest = num2;
			}
			else
			{
				highest = num3;
			}
		}
		return highest;
	}
	

	/**
	 * Returns the number of digits that occur in the same place in each of two specified numbers
	 * @parm num1 the first number
	 * @param num2 the second number
	 *    Precondition: num1 >= 0, num2 >= 0 
	 * @return the number of digits that occur in the same place in both numbers
	 */
	public static int countMatchingDigits(int num1, int num2)
	{
    int numSame = 0;
    int same1 = num1;
    int same2 = num2;
    if((same1 == 0) || (same2 == 0))
    {    	
    	int check1 = same1 % 10;
    	int check2 = same2 % 10;
    	if(check1 == check2)
    	{
    		numSame++;
    	}
    	return numSame;
    }
    while((same1 != 0) && (same2 != 0))
    {
    	int check1 = same1 % 10;
    	int check2 = same2 % 10;
    	if(check1 == check2)
    	{
    		numSame++;
    	}
    	same1 = same1 / 10;
    	same2 = same2 / 10;
    }
    return numSame;
	}
}