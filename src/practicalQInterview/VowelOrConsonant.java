package practicalQInterview;

import java.util.Scanner;

public class VowelOrConsonant {
	Scanner sc=new Scanner(System.in);
	char x;
	public void CheckIfLetterVowelOrConsonant() {
		System.out.println("Please enter a letter to check if it is vowel or Consonant");
		x=sc.next().charAt(0);
		if (x=='a'||x=='e'||x=='i'||x=='o'||x=='u') {
			System.out.println("Entered number "+x+" is vowel");
			}
		else {
			System.out.println("Entered number is consosnant");
		}
	}
	
	public void checkIfPositiveOrNegative() {
		System.out.println("Please enter a number to check if it positive or negative");
		int x=sc.nextInt();
		if(x<0) {
			System.out.println("entered number is negative");
		}
		else if(x>0) {
			System.out.println("entered number is positive");
		}
		else {
			System.out.println("Entered nmber is zero which is neither positive or negative");
		}
	}
	
	public void checkIfCharacterIsAlphabet() {
		System.out.println("Please enter a character");
		char c=sc.next().charAt(0);
		if(c)
	}

}
