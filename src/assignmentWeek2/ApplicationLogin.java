package assignmentWeek2;

import java.util.Scanner;

public class ApplicationLogin {
	String actualUserID;
	String actualPassword;
	String enteredUserID;
	String enteredPassword;
	Scanner sc = new Scanner(System.in);

	void login() {
		
		for (int counter = 1; counter <= 3; counter++) {
			System.out.println("Enter your user Id");
			enteredUserID= sc.next();
			System.out.println("Enter your password");
			enteredPassword=sc.next();
			if (enteredUserID.equals(actualUserID) && enteredPassword.equals(actualPassword)) {
				System.out.println("You are logged into the application");
				break;
			} else if (enteredUserID != actualUserID || enteredPassword != actualPassword) {
				System.out.println("Incorrect user ID or Password. Please try again");
			} else {
				System.out.println("Incorrect user ID and Password. Please try again");
			}
			if (counter == 3) {
				System.out.println("3 incorrect attempt.Your account is locked");
			}

		}
	}
}
