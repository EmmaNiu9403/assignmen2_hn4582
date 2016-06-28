package assignment2;

import java.util.Arrays;

public class Game {
	public static boolean testMode;
	public Game(boolean val){
		
		testMode = val;
	}

	public boolean WinOrLost(String[] s, int numberOfPegs) {
		boolean flag = true;
		int i = 0;
		while (i < numberOfPegs) {
			if (s[i].equals("B"))
				;
			else {
				flag = false;
				break;
			}
		}
		if (flag == false)
			return false;
		else
			return true;
	}
}
