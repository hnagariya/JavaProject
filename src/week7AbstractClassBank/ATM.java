package week7AbstractClassBank;

import java.util.Scanner;

public class ATM extends BankOperation {
	Scanner sc = new Scanner(System.in);

	public ATM() {
		super();
	}

	double depositAmount(double amountDeposited, double accountBalance) {
		System.out.println("Money deposited by cheque");
		accountBalance = accountBalance + amountDeposited;
		return accountBalance;
	}

	@Override
	double withdrawAmount(double amountWithdrawn, double accountBalance) {
		int counter = 0;
		if (amountWithdrawn < accountBalance) {
			System.out.println("You have withdrawn: " + amountWithdrawn);
			accountBalance = accountBalance - amountWithdrawn;
			counter++;
		} else {
			System.out.println("You do not have enough balance. Enter the amount lesser than Account Balance");
		}
		if (counter == 5) {
			System.out.println("You have exceed the free limit of ATM");
		}
		return accountBalance;
	}

	@Override
	public String changePinPassword(String actualPinOrPassword) {
		int actualPin = Integer.parseInt(actualPinOrPassword);
		int digitCountInNewPin;
		System.out.println("Please enter your current pin");
		int existingPin = sc.nextInt();
		System.out.println("Please enter your 4 digit new pin.");
		int newPinToSet = sc.nextInt();
		String newPinString = Integer.toString(newPinToSet);
		digitCountInNewPin = newPinString.length();
		if (digitCountInNewPin == 4 && existingPin == actualPin && newPinToSet != actualPin) {
			actualPin = newPinToSet;
			actualPinOrPassword = Integer.toString(actualPin);
		} else {
			System.out.println("Incorrect atempt");
		}
		return actualPinOrPassword;

	}
}
