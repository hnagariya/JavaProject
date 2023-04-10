package arrayName;

import java.util.Scanner;

public class ArrayNaturalNumber {
	int x;
	int[] naturalNumber;
	Scanner sc = new Scanner(System.in);

	void naturalNumberInput() {
		System.out.println("Enter a positive number");
		x = sc.nextInt();
		if (x >= 0) {
			for (int i = 0; i < x; i++) {
				naturalNumber=new int[x];
				System.out.println(naturalNumber[i]=i+1);
			}
		}
	}
}
