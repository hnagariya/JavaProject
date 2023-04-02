package assignmentWeek2;

import java.util.Scanner;

public class PositiveNumber {
	int n;
	Scanner sc = new Scanner(System.in);

	void isPositiveNumberPrime() {
		System.out.println("Enter positive number");
		n = sc.nextInt();
		boolean notPrime=false;
		if (n >= 0) {
			for (int i = 2; i < n; i++) {
				int r = n % i;
				if (r == 0) {
					notPrime = true;
					break;
				}
			}
		} else {
			System.out.println("It is not a positive number. Please enter a positive number");
		}
		if (notPrime) {
			System.out.println("Entered positive number is not a Prime number");
		} else {
			System.out.println("It is prime.");
		}
	}
}
