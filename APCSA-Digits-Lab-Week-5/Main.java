/**
 * The Main class calls the methods from the utility Digits class. 
 * It tests the three methods of the class and prints the results.
 * @author Vishesh Prasad 
 * Collaborators: N/A
 * Teacher Name: Mrs. Ishman
 * Period: 4
 * Due Date: 04-23-2020
 */

/**
 * A class to test the Digits methods
 */
public class Main
{

	public static void main(String[] args)
	{
		System.out.println("Testing digitSum:");
		System.out.printf("%-15d%d%n",0,Digits.digitSum(0));
		System.out.printf("%-15d%d%n",123,Digits.digitSum(123));
		System.out.printf("%-15d%d%n",2460,Digits.digitSum(2460));
		System.out.printf("%-15d%d%n%n",Integer.MAX_VALUE,Digits.digitSum(Integer.MAX_VALUE));

		System.out.println("Testing highestSum:");
		System.out.printf("%-15d has the highest sum of [%d, %d, %d]%n",Digits.highestSum(2460, Integer.MAX_VALUE, 123),2460,Integer.MAX_VALUE, 123 );
		System.out.printf("%-15d has the highest sum of [%d, %d, %d]%n",Digits.highestSum(88,888,8888),88,888,8888);
		System.out.printf("%-15d has the highest sum of [%d, %d, %d]%n",Digits.highestSum(12345,1234,123),12345,1234,123);
		System.out.printf("%-15d has the highest sum of [%d, %d, %d]%n",Digits.highestSum(5111,1234,99),5111,1234,99);
		System.out.printf("%-15d has the highest sum of [%d, %d, %d]%n%n",Digits.highestSum(5111,1789,91),5111,1789,91);

		System.out.println("Testing countMatchingDigits:");
		System.out.printf("%5d and %n%5d have %d matching digit(s)%n%n",123,123,Digits.countMatchingDigits(123, 123));
		System.out.printf("%5d and %n%5d have %d matching digit(s)%n%n",123,321,Digits.countMatchingDigits(123, 321));
		System.out.printf("%5d and %n%5d have %d matching digit(s)%n%n",23,123,Digits.countMatchingDigits(23, 123));
		System.out.printf("%5d and %n%5d have %d matching digit(s)%n%n",999,90,Digits.countMatchingDigits(999, 90));
		System.out.printf("%5d and %n%5d have %d matching digit(s)%n%n",876,543,Digits.countMatchingDigits(876, 543));
		System.out.printf("%5d and %n%5d have %d matching digit(s)%n%n",0,10,Digits.countMatchingDigits(0,10));
		System.out.printf("%5d and %n%5d have %d matching digit(s)%n%n",0,0,Digits.countMatchingDigits(0,0));
	}
}