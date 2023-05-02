package bank;

import java.util.Arrays;
import java.util.Scanner;

public class BankMain {
	static String[] typeOfOperation = { "Deposit", "WithdrawMoney", "ViewBalance" };

	public static void main(String[] args) {
		// Scanner object created
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter initial amount of account.");
		double initialAmountAccountBalance=sc.nextDouble();
		sc.nextLine();
		PersonAccountDetails neelamAccount = new PersonAccountDetails("87654321", "Neelam",initialAmountAccountBalance, 1234, "abc1234");

		// BankOperation class object created by initializing it null, later it will be
		// initiated through child class constructor
		BankOperations bankOperation = null;

		// to select the option between ATM and Online banking
		System.out.println("Please select the method of bank trsnsaction: ATM or OnlineBanking");
		String method = sc.nextLine();
		int counter = 0;
		boolean isValidationCorrect = false;

		switch (method) {

		case "ATM":
			for (counter = 0; counter < 3; counter++) {
				System.out.println("Please enter your pin");
				int enteredPin = sc.nextInt();
				sc.nextLine();
				if (enteredPin == neelamAccount.getPin(true)) {
					// bankOperation class object created by calling child class ATM constructor
					bankOperation = new ATM(initialAmountAccountBalance);
					isValidationCorrect = true;
					break;
				}
			}
			break;

		case "OnlineBanking":
			for (counter = 0; counter < 3; counter++) {
				System.out.println("Please enter your password");
				String enteredPassword = sc.nextLine();
				if (enteredPassword.equals(neelamAccount.getOnlineBankingPassword(true))) {
					// bankOperation class object created by calling child class ATM constructor
					bankOperation = new OnlineBanking(initialAmountAccountBalance);
					isValidationCorrect = true;
					break;
				}
			}
			break;

		default:
			System.out.println("You have selected the wrong method");
			break;
		}
		if (isValidationCorrect == true) {
			boolean isTypeOfOperationCorrect = false;
			System.out.println("Please select the type of operation");
			System.out.println(Arrays.toString(typeOfOperation));
			String operationTypeSelected = sc.nextLine();

			if (operationTypeSelected.equals("Deposit")) {
				System.out.println("Please enter the amount to be deposited");
				int amountDeposited = sc.nextInt();
				bankOperation.depositAmount(amountDeposited);
				isTypeOfOperationCorrect = true;
			} else if (operationTypeSelected.equals("WithdrawMoney")) {
				System.out.println("Please enter the amount to be withdrawn");
				double amountWithdrawn = sc.nextDouble();
				bankOperation.withdrawAmount(amountWithdrawn);
				isTypeOfOperationCorrect = true;
			} else if (operationTypeSelected.equals("ViewBalance")) {
				bankOperation.viewBalance();
				isTypeOfOperationCorrect = true;
			}
			if (isTypeOfOperationCorrect) {
				neelamAccount.setAccountBalance(bankOperation.accountBalance);
				System.out.println("Your account balance is: " + neelamAccount.getAccountBalance());
			} else {
				System.out.println("Please enter correct type of Operation");
			}
		} else {
			System.out.println("Your account is locked.");
		}
	}
}
