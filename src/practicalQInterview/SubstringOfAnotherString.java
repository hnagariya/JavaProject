package practicalQInterview;

import java.util.Scanner;

public class SubstringOfAnotherString {
	Scanner sc = new Scanner(System.in);
	String string2;
	String string1;

	public void checkIfStringPartOfAnotherString() {
		System.out.println("Please enter a string 1");
		string1 = sc.next();
		System.out.println("Please enter String 2 to check if String 1 is subsring of String2");
		string2 = sc.next();
		if (string2.contains(string1)) {
			System.out.println("String1 is substring of string2");
		} else {
			System.out.println("String 1 is not substring of String 2");
		}
		int x=string2.indexOf(string1);
		if(x>=0) {
			System.out.println("String1 is substring of string2");
		}
		else {
			System.out.println("String 1 is not substring of String 2");
		}
		System.out.println(string1.length());
	}
}
