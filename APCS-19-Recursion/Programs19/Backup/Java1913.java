// Java1913.java
// This program solves the "Tower of Hanoi" puzzle.


import java.util.*;


public class Java1913
{

	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("\nHow many disks are in the tower  ===>>  ");
		int disks = input.nextInt();
		solveHanoi('A','B','C',disks);
		System.out.println("\n\nEXECUTION TERMINATED");
	}

	public static void solveHanoi(char s, char t, char d, int n)
	// s - source peg
	// t - temporary peg
	// d - destination peg
	// n - number of disks
	{
		if (n != 0)
		{
			solveHanoi(s,d,t,n-1);
			System.out.println("Move Disk " + n + " From Peg " + s + " to Peg " + d);
			solveHanoi(t,s,d,n-1);
		}
	}

}

