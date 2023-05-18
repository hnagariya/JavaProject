package practicalQInterview;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveSecondCharInEachWord {
	Scanner sc = new Scanner(System.in);

	public void removeSecondCharacterInEachWord() {
		System.out.println("Please enter a sentence");
		String s = sc.nextLine();
		String[] sa = s.split(" ");
		System.out.println(Arrays.toString(sa));
		for (int i = 0; i < sa.length; i++) {
			if (sa[i].length() > 1) {
				sa[i] = sa[i].substring(0, 1) + sa[i].substring(2, sa[i].length());
			}
		}
		System.out.println(String.join(" ",sa));
	}
}
