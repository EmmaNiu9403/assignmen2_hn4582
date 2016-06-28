package assignment2;

import java.util.Random;

public class GameBoard {

	public String []  GeneratePattern(String [] colors, int numberOfPegs, int colorsNumber){
		String [] pattern = new String[numberOfPegs];
		for(int j=0;j<numberOfPegs;j++){
			Random num = new Random();
			int i = num.nextInt(colorsNumber);
			pattern[j]=colors[i];
		}
		return pattern;
		
	}
}
