package assignment2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HumanPlayer {
	public String[] GuessPattern(String[] colors, int numberOfPegs) {
		boolean flag = true;
		Set<String> PatternSet = new HashSet<String>(Arrays.asList(colors));
		String guess1 = new String();
		Scanner a = new Scanner(System.in);
		guess1=a.nextLine();
		char[] guess1tochar = guess1.toCharArray();
		String [] guess = new String[numberOfPegs];
		for(int i=0;i<numberOfPegs;i++){
			if(PatternSet.contains(guess[i])==false){
				flag=false;
				break;
			}
			else guess[i]=Character.toString(guess1tochar[i]);
		}
		if((flag==false)||(guess1tochar.length!=numberOfPegs)) guess[0]="-1";
		return guess;
	}
	

}
