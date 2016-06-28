package assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class GameRunner {

	public static void main(String[] args) {
		try {
			// Print intro text
			Scanner intro = new Scanner(new File("src/assignment2/intro.txt"));
			while (intro.hasNextLine())
				System.out.println(intro.nextLine());

			// Check if user is ready to play
			System.out.print("You have " + GameConfiguration.guessNumber
					+ " to figure out the secret code or you lose the game. Are you ready to play? (Y/N): ");
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();

			if (s.equalsIgnoreCase("y"))
				// Play the game
				System.out.print("Playing game...");
			else
				System.exit(0);
			Game game = new Game(true);
			GameBoard newPattern = new GameBoard();
			String[] givenPattern = newPattern.GeneratePattern(GameConfiguration.colors,GameConfiguration.pegNumber,GameConfiguration.colors.length);
			FeedBackSystem feed = new FeedBackSystem();
			HumanPlayer player = new HumanPlayer();
			for (int i = GameConfiguration.guessNumber; i > 0; i--) {
				if (game.testMode)
					System.out.println(Arrays.toString(givenPattern));
				System.out.println("You have " + i + " guesses left");
				System.out.println("What is your next guesses?");
				System.out.println("Type in the characters for your guess and press enter");
				System.out.print("Enter guess:		");
				String[] guessPattern = player.GuessPattern(GameConfiguration.colors, GameConfiguration.pegNumber);
				System.out.println("");
				System.out.println(Arrays.toString(guessPattern)+" -> Result:		");
				feed.GenerateFinalFeedback(feed.Compare(givenPattern, guessPattern, GameConfiguration.pegNumber));
				if (FeedBackSystem.countBlack == 4)
					break;
				
			}
			if(FeedBackSystem.countBlack!=4)
				System.out.println("Sorry, you are out of guesses. You lose, boo-hoo.");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		while(true){
			System.out.print("Are you ready for another game (Y/N): ");
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();

			if (s.equalsIgnoreCase("y"))
				// Play the game
				System.out.print("Playing game...");
			else
				System.exit(0);
			Game game = new Game(true);
			GameBoard newPattern = new GameBoard();
			String[] givenPattern = newPattern.GeneratePattern(GameConfiguration.colors,GameConfiguration.pegNumber,GameConfiguration.colors.length);
			FeedBackSystem feed = new FeedBackSystem();
			HumanPlayer player = new HumanPlayer();
			for (int i = GameConfiguration.guessNumber; i > 0; i--) {
				if (game.testMode)
					System.out.println(Arrays.toString(givenPattern));
				System.out.println("You have " + i + " guesses left");
				System.out.println("What is your next guesses?");
				System.out.println("Type in the characters for your guess and press enter");
				System.out.print("Enter guess:		");
				String[] guessPattern = player.GuessPattern(GameConfiguration.colors, GameConfiguration.pegNumber);
				System.out.println("");
				System.out.println(Arrays.toString(guessPattern)+" -> Result:		");
				feed.GenerateFinalFeedback(feed.Compare(givenPattern, guessPattern, GameConfiguration.pegNumber));
				if (FeedBackSystem.countBlack == 4)
					break;
				
			}
			if(FeedBackSystem.countBlack!=4)
				System.out.println("Sorry, you are out of guesses. You lose, boo-hoo.");

		} 
	
	}

}
