package javaWeek2;

import java.util.Scanner;

public class ForLoopDemo {
	int actualPin;
	int enteredPin;
	Scanner sc = new Scanner(System.in);

	void cardBlockedAfter3IncorrectPin() {
		for (int counter = 1; counter <= 3; counter++) {
			System.out.println("Enter your PIn");
			enteredPin = sc.nextInt();
			if (enteredPin == actualPin) {
				System.out.println("Entered pin is correct");
				break;
			} 
			else {
				System.out.println("Entered pin is incorrect");
				if (counter == 3)
					System.out.println("You have entered incorrect password for 3 times. Your card is locked");
			}
		

		}

	}
}
