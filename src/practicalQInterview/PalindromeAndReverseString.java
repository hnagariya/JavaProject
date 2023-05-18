package practicalQInterview;

import java.util.Scanner;

public class PalindromeAndReverseString {
	Scanner sc =new Scanner(System.in);
	String s;
	String reverseS;
	
	public String getReverseString() {
		System.out.println("Please enter the string.");
		s=sc.next();
		char[]reverseSChar=new char[s.length()];
		char[] sChar=s.toCharArray();
		for (int i=0;i<sChar.length;i++) {
			reverseSChar[i]=sChar[sChar.length-(i+1)];
		}
		reverseS=String.valueOf(reverseSChar);
		System.out.println(reverseS);
		return reverseS;
		
	}
	public void checkIfStringPalindrome() {
		if(reverseS.equals(s)) {
			System.out.println("The string is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
	}

}
