// Java1305.java
// This program assigns grades 'A'..'F' based on numerical scores
// using multiple nested if..else statements.


import java.util.Scanner;

public class Java1305
{
	public static void main (String args[])
	{
		System.out.println("Java1305\n");
		Scanner input = new Scanner(System.in);
		double score;
		char grade;

		System.out.print("Enter your numerical score ===>>  ");
		score = input.nextDouble();
		if (score >= 90.0)
			grade = 'A';
		else if (score >= 80.0)
			grade = 'B';
		else if (score >= 70.0)
			grade = 'C';
		else if (score >= 60.0)
			grade = 'D';
		else
			grade = 'F';

		System.out.println("Your grade will be: " + grade);
	}
}

