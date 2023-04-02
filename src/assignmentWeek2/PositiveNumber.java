package assignmentWeek2;

import java.util.Scanner;

public class PositiveNumber {
	int n;
	Scanner sc = new Scanner(System.in);

	void isPositiveNumberPrime() {
		System.out.println("Enter positive number");
		n = sc.nextInt();
		if (n >= 0) {
			if (n >= 2) {

				for (int i = 2; i < n; i++) {
					int r = n % i;
					if (r == 0) {
						System.out.println("Entered positive number is not a Prime number");
					}
					break;

				}
			} else {
				System.out.println("Entered number is a prime number");
			}
		}

		else {
			System.out.println("It is not a positive number. Please enter a positive number");
		}
	}
}
