package week7AbstractClassBank;

import java.util.Scanner;

public class ATM extends BankOperation {
	Scanner sc = new Scanner(System.in);

	@Override
	public void changePinPassword(PersonAccountDetails person) {
		System.out.println("Please enter your current pin");
		int existingPin = sc.nextInt();
		System.out.println("Please enter your 4 digit new pin.");
		int newPinToSet = sc.nextInt();
		String newPinString = Integer.toString(newPinToSet);
		int digitCountInNewPin = newPinString.length();
		if (digitCountInNewPin == 4 && existingPin == person.getPin(true) && newPinToSet != person.getPin(true)) {
			person.setPin(newPinToSet, existingPin);
			System.out.println(person.getPin(true));
		} else {
			System.out.println("Incorrect atempt");
		}
	}

	@Override
	public void depositAmount(double amountDeposited, PersonAccountDetails person) {
		System.out.println("Money deposited by cheque");
		person.setAccountBalance(person.getAccountBalance() + amountDeposited);
	}

	@Override
	public void withdrawAmount(double amountWithdrawn, PersonAccountDetails person) {
		int counter = 0;
		if (amountWithdrawn < person.getAccountBalance()) {
			System.out.println("You have withdrawn: " + amountWithdrawn);
			person.setAccountBalance(person.getAccountBalance() - amountWithdrawn);
			counter++;
		} else {
			System.out.println("You do not have enough balance. Enter the amount lesser than Account Balance");
		}
		if (counter == 5) {
			System.out.println("You have exceed the free limit of ATM");
		}
	}

}
