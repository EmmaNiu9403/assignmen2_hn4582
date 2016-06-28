package assignment2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HumanPlayer {
	public String[] GuessPattern(String[] colors, int numberOfPegs) {
		boolean flag = false;
		String guess1 = new String();
		char[] colorc = new char[colors.length];
		for(int i=0;i<colors.length;i++){
			colorc[i] = (colors[i].toCharArray())[0];
		}
		
		Scanner a = new Scanner(System.in);
		guess1=a.nextLine();
		char[] guess1tochar = guess1.toCharArray();
		String [] guess = new String[numberOfPegs];
		for(int i=0;i<numberOfPegs;i++){
			flag=false;
		for(int j=0;j<colors.length;j++){
			if(colorc[j]==guess1tochar[i]) flag = true;
		}
		if(flag==false) break;
		}
		if(flag==true){
		for(int i=0;i<numberOfPegs;i++){
			guess[i]=Character.toString(guess1tochar[i]);
		}
		}
		if((flag==false)||(guess1tochar.length!=numberOfPegs)) guess[0]="-1";
		return guess;
	}
	

}
