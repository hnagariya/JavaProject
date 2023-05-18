package practicalQInterview;

import java.util.Scanner;

public class PrimeNumber {
	Scanner sc = new Scanner(System.in);

	public void checkIfNumberisPrime() {
		boolean isNumberNotPrime = false;
		System.out.println("Please enter the number");
		int number = sc.nextInt();
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isNumberNotPrime = true;
				break;
			}
		}
		if (isNumberNotPrime) {
			System.out.println("nmber is not prime");
		} else {
			System.out.println("Number is prime");
		}
	}

	public void displayPrimeNumbersBetweenTwoInterwal() {
		boolean isNumberNotPrime = false;
		System.out.println("Please enter first number");
		int a = sc.nextInt();
		System.out.println("Please enter  second number");
		int b = sc.nextInt();
//		for (int i = a; a <= b; a++) {
//			for (int j = 2; j < a; j++) {
//				if (a % j == 0) {
//					isNumberNotPrime = true;
//					break;
//				}
//			}
//			if (isNumberNotPrime == false) {
//				System.out.println(a);
//			} else {
//				isNumberNotPrime = false;
//			}
//}
		while (a < b) {
			isNumberNotPrime = false;
			for (int i = 2; i < a; i++) {
				if (a % i == 0) {
					isNumberNotPrime = true;
					break;
				}
			}
			if (!isNumberNotPrime && a != 0 && a != 1) {
				System.out.println(a + " ");
			}
			a++;
		}
	}
}
