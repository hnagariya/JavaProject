package practicalQInterview;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] rPS= {"Rock","Paper","Scissors"};
		System.out.println("Please enter : Rock or Paper or Scissor");
		String userInput=sc.next().toLowerCase();
		Random rd=new Random();
		int index=rd.nextInt(rPS.length);
	String	computerInput =rPS[index].toLowerCase();
	System.out.println(computerInput);
	RockPaperScissor rps=new RockPaperScissor();
	rps.playerWin(userInput, computerInput);
	
	}

}
