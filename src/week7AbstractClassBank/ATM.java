package week7AbstractClassBank;

import java.util.Scanner;

public class ATM extends BankOperation {
	// boolean isEnteredPinMeetReq;
	Scanner sc = new Scanner(System.in);

	public ATM(double accountBalance) {
		super(accountBalance);
		// TODO Auto-generated constructor stub
	}

	double depositAmount(double amountDeposited, int chequeNumber) {
		System.out.println("Money deposited by cheque");
		accountBalance = accountBalance + amountDeposited;
		return accountBalance;
	}

	@Override
	double withdrawAmount(double amountWithdrawn) {
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
//@Override
//	public boolean checkEnteredPinOrPasswordMeetReq(String enteredPinOrPassword) {
//		int digitCountInNewPin;
//		System.out.println("Please enter your 4 digit new pin.");
//		enteredPin = sc.nextInt();
//		String newPinString = Integer.toString(enteredPin);
//		// char[] newPinChar = newPinString.toCharArray();
//		// digitCountInNewPin = newPinChar.length;
//		digitCountInNewPin = newPinString.length();
//		if (digitCountInNewPin == 4) {
//			isEnteredPinMeetReq = true;
//		} else {
//			isEnteredPinMeetReq = false;
//		}
//		return isEnteredPinMeetReq;
//	}

	@Override
	public String changePinPassword(String actualPinOrPassword) {
		int actualPin = Integer.parseInt(actualPinOrPassword);
		int digitCountInNewPin;
		System.out.println("Please enter your current pin");
		int existingPin=sc.nextInt();
		System.out.println("Please enter your 4 digit new pin.");
		int newPinToSet = sc.nextInt();
		String newPinString = Integer.toString(newPinToSet);
		digitCountInNewPin = newPinString.length();
		if (digitCountInNewPin == 4 && existingPin==actualPin && newPinToSet != actualPin) {
			actualPin = newPinToSet;
			actualPinOrPassword=Integer.toString(actualPin);
		} else {
			System.out.println("Incorrect atempt");
		}
		return actualPinOrPassword;

	}
}
