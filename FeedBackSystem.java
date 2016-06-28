package assignment2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FeedBackSystem {
	String feedbackResults= new String();
	 public static int countBlack=0, countWhite=0;
	public String[] Compare(String[] givenPattern, String[] guessPattern,int numberOfPegs) {
		String[] feedback = new String[numberOfPegs];
		if(guessPattern[0]=="-1")
			feedback[0]="-1";
	else {int count = 0;
		String[] temp1 = new String[numberOfPegs];
		String[] temp2 = new String[numberOfPegs];
		for(int i=0;i<numberOfPegs;i++){
			temp1[i]=new String(givenPattern[i]);
			temp2[i]=new String(guessPattern[i]);
		}
		for(int i=0;i<numberOfPegs;i++){
			if(temp1[i].equals(temp2[i])){
				feedback[count]="B";
				count++;
				DeleteElement(temp1,i);
				DeleteElement(temp2,i);
			}
		}
		int i=0;
		while(i<numberOfPegs){
			if(temp2[i]!="NULL"){
				for(int k=0;k<numberOfPegs;k++){
				if(temp2[i].equals(temp1[k])&&temp2[i]!="NULL"){
					feedback[count]="W";
					if(count<3) count++;
					DeleteElement(temp2,i);
					DeleteElement(temp1,k);
					break;
				}
				}
			}
			i++;
		}
	}
			return feedback;
		}
	public String[] DeleteElement(String [] s, int i){
		s[i]="NULL";
		return s;
	}
	public void GenerateFinalFeedback(String [] s){
		if(s[0]=="-1")
			System.out.println("		-> INVALID INPUT");
		else{
		for(int i=0;i<s.length;i++){
			if(s[i]=="B") countBlack++;
			else if(s[i]=="W") countWhite++;
		}
		if(countBlack==0&&countWhite==0)
			System.out.println("No pegs");
		else if(countBlack==0&&countWhite!=0)
			System.out.println(countWhite+" white pegs");
		else if(countBlack!=0&&countWhite==0){
			System.out.print(countBlack+" black pegs");
			if(countBlack==4)
			System.out.println(" - You win!!");
			else
				System.out.println("");
		}
		else
			System.out.println(countBlack+" black pegs "+countWhite+" white pegs");
	}
	}
	}