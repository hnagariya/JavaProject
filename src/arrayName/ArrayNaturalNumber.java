package arrayName;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayNaturalNumber {
	int x; // declare for user input
	int[] naturalNumber; // declare array
	Scanner sc = new Scanner(System.in);

	void naturalNumberInput() {
		System.out.println("Enter a positive number");
		x = sc.nextInt();
		naturalNumber = new int[x];
		for (int i = 0; i < x; i++) {
			naturalNumber[i] = x - i;
		}
		System.out.println(Arrays.toString(naturalNumber));
	}
}
