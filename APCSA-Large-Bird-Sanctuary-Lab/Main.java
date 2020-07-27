/**
 * The Main class gets the birds and their information from the Birds text 
 * file. It then feeds this information to the LargeBirdSanctuary class
 * in order to get back the birds in the sanctuary other information. It 
 * then prints all of the inforamtion.
 * @author Vishesh Prasad 
 * Collaboraters: N/A
 * Teacher Name: Mrs. Ishman
 * Period: 4
 * Due Date: 04-16-2020
 */

import java.util.*;
import java.io.*;

/**
 * A class to test the LargeBirdSanctuary class
 */
 public class Main
 {
 	public static void main(String[] args) throws IOException
 	{
 		Scanner input = new Scanner(new File("Birds.txt"));
 		List<Bird> birdies = new ArrayList<Bird>();
 		birdies.add(new Bird("Cardinal", 2, 10, true));
 		
 		/* Tests an empty sanctuary: makes a LargeBirdSanctuary with a maximum capacity of 10 from a list of 1 small bird, so it is empty. prints the count of healthy birds, removes and prints the sick birds, and prints the empty sanctuary */
 		System.out.println("Testing an empty sanctuary");
 		LargeBirdSanctuary sanctuary1 = new LargeBirdSanctuary(birdies, 10);
 		System.out.println("Healthy birds in sanctuary1: " + sanctuary1.getHealthyBirdCount());
 		System.out.println("Sick birds removed from sanctuary1: " + sanctuary1.removeSickBirds());
 		System.out.println("sanctuary1: \n" + sanctuary1 + "\n");

    /* Reads the bird data from the file to load into aviary */
 		while(input.hasNextLine())
 		{
 			String type = input.nextLine();
 			int eggs = input.nextInt();
 			double span = input.nextDouble();
 			boolean healthy = input.nextBoolean();
 			input.nextLine();
 			birdies.add(new Bird(type, eggs, span, healthy));
 		}

    /* Makes a sanctuary with a maximum capacity of 25 from the data file birds  and prints */
 		LargeBirdSanctuary aviary = new LargeBirdSanctuary(birdies, 25);
 		System.out.println("aviary: \n" + aviary);

    /* Tests removing sick birds with aviary */
 		List<Bird> removedBirds = aviary.removeSickBirds();
 		System.out.println(removedBirds.size() + " birds were removed from aviary:");
 		for(Bird birdie: removedBirds)
 		{
 			System.out.println(birdie);
 		}
 		System.out.println();

 		System.out.println("aviary: \n" + aviary);
 		
 		/* Tests removing sick birds after all of the sick birds have already been removed */
 		System.out.println("Sick birds in aviary: \n" + aviary.removeSickBirds());
 		System.out.println("\naviary: \n" + aviary);


 	}
 }