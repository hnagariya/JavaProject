package assignmentWeek2;

import java.util.Scanner;

public class ApplicationLogin {
	String actualUserID;
	String actualPassword;
	String enteredUserID;
	String enteredPassword;
	Scanner sc = new Scanner(System.in);

	void login() {
		int counter = 0;
		do {
			System.out.println("Enter your user Id");
			enteredUserID = sc.next();
			System.out.println("Enter your password");
			enteredPassword = sc.next();
			if (enteredUserID.equals(actualUserID) && enteredPassword.equals(actualPassword)) {
				System.out.println("You are logged into the application");
				break;
			} else if (enteredUserID != actualUserID || enteredPassword != actualPassword) {
				System.out.println("Incorrect user ID or Password. Please try again");
				counter++;
			}
		} while (counter <= 2);
		if (counter == 3) {
			System.out.println("3 incorrect attempt.Your account is locked");
		}
	}
}
