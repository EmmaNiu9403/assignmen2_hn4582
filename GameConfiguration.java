/*  * EE422C Project 2 (Mastermind) submission by
 * Robert (Connor) Byron 
 * rcb2746
 * <Student 2 Name> Haoran Niu
 * <Student 2 EID>  hn4582
 * https://github.com/rcbyron/java/tree/master/mastermind-game/src/assignment2
 * Slip days used: 0
 * Summer 2016
 */

package assignment2;

import java.util.Scanner;

public class GameConfiguration {
	public static int guessNumber = 12;
	public static String[] colors = { "B", "G", "O", "P", "R", "Y" };
	public static int pegNumber = 4;

	public void SetGuessNumber() {
		System.out.println("please enter the rounds you want:");
		int n;
		Scanner b = new Scanner(System.in);
		n = b.nextInt();
		b.nextLine();
		guessNumber = n;
	}

	public void SetColors(String[] colors, int n) {
		Scanner b1 = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			System.out.println("please enter the color you want:");
			colors[i] = b1.nextLine();
		}
	}
	
	public int getNumber(){
		
		return guessNumber;
	}
	
	public int setColorNumber(){
		System.out.println("please enter the number of colors you want");
		Scanner b = new Scanner(System.in);
		return b.nextInt();
	}
	
	
}
