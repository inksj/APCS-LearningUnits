// Java1009.java
// This program will display 15 random sentences.
// With 7 different ranks, 7 different people, 7 different actions and 7 different locations,
// there are more than 2400 different sentences possible.

import java.util.Random;			// necessary to use the <Random> class

public class Java1009
{
	public static void main(String args[])
	{
		System.out.println("Java1009\n");
		Random random = new Random();

		String rank[]     = {"Private", "Corporal", "Sargent", "Lieutenant", "Captain", "Major", "General"};

		String person[]   = {"Smith", "Gonzales", "Brown", "Jackson", "Powers", "Jones", "Nguyen"};

		String action[]   = {"drive the tank", "drive the jeep", "take the troops", "bring all supplies",
						    "escort the visitor", "prepare to relocate", "bring the Admiral"};

		String location[] = {"over the next hill", "to the top of the mountain", "outside the barracks",
						    "30 miles into the dessert", "to the middle of the forest",
						    "to my present location", "to anywhere but here"};

		for (int j = 1; j <= 15; j++)
		{
			int randomRank   	=  random.nextInt(rank.length);
			int randomPerson  	=  random.nextInt(person.length);
			int randomAction   	=  random.nextInt(action.length);
			int randomLocation 	=  random.nextInt(location.length);

			String sentence = rank[randomRank] + " " + person[randomPerson] + " " +
							  action[randomAction] + " " + location[randomLocation] + ".";

			System.out.println("\n" + sentence);
		}
		System.out.println();
	}
}
