package week7AbstractClassBank;

import java.util.Arrays;
import java.util.Scanner;

public class BankOperationMain {
	static String[] typeOfOperation = { "Deposit", "WithdrawMoney", "ViewBalance", "ChangePinPassword" };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		PersonAccountDetails neelamAccount = new PersonAccountDetails("87654321", "Neelam", 1000, 1234, "abc1234");
		PersonAccountDetails monikaAccount = new PersonAccountDetails("87654322", "Monika", 2000, 1235, "abc1235");
		PersonAccountDetails saritaAccount = new PersonAccountDetails("87654323", "Sarita", 3000, 1236, "abc1236");
		PersonAccountDetails maneeshAccount = new PersonAccountDetails("87654324", "maneesh", 4000, 1237, "abc1237");
		PersonAccountDetails suhasAccount = new PersonAccountDetails("87654325", "Suhas", 5000, 1238, "abc1238");

		PersonAccountDetails[] personList = { neelamAccount, monikaAccount, saritaAccount, maneeshAccount,
				suhasAccount };
		PersonAccountDetails person = null;

		BankOperation bankOperation = null;
		System.out.println("Please enter your accont no.");
		String personAccountNumber = sc.next();
		Boolean isAccountNumberValid = false;

		for (int i = 0; i < personList.length; i++) {
			if (personAccountNumber.equals(personList[i].getAccountNumber())) {
				person = personList[i];
				isAccountNumberValid = true;
			}
		}

		if (isAccountNumberValid) {
			System.out.println("Please select the method of bank trsnsaction: ATM or OnlineBanking");
			String method = sc.next();
			boolean isValidationCorrect = false;

			switch (method) {

			case "ATM":
				for (int counter = 0; counter < 3; counter++) {
					System.out.println("Please enter your pin");
					int enteredPinToValidate = sc.nextInt();
					sc.nextLine();
					if (enteredPinToValidate == person.getPin(true)) {
						bankOperation = new ATM();
						isValidationCorrect = true;
						break;
					}
				}
				break;

			case "OnlineBanking":
				for (int counter = 0; counter < 3; counter++) {
					System.out.println("Please enter your password");
					String enteredPasswordToValidate = sc.next();
					if (enteredPasswordToValidate.equals(person.getOnlineBankingPassword(true))) {
						bankOperation = new OnlineBanking();
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
				String operationTypeSelected = sc.next();

				if (operationTypeSelected.equals("Deposit")) {
					System.out.println("Please enter the amount to be deposited");
					int amountDeposited = sc.nextInt();
					bankOperation.depositAmount(amountDeposited, person);
					isTypeOfOperationCorrect = true;
				} else if (operationTypeSelected.equals("WithdrawMoney")) {
					System.out.println("Please enter the amount to be withdrawn");
					double amountWithdrawn = sc.nextDouble();
					bankOperation.withdrawAmount(amountWithdrawn, person);
					isTypeOfOperationCorrect = true;
				} else if (operationTypeSelected.equals("ViewBalance")) {
					bankOperation.viewBalance(person);
					isTypeOfOperationCorrect = true;
				} else if (operationTypeSelected.equals("ChangePinPassword")) {
					bankOperation.changePinPassword(person);
					isTypeOfOperationCorrect = true;
				}
				if (isTypeOfOperationCorrect && !operationTypeSelected.equals("ChangePinPassword")) {
					System.out.println("Your account balance is: " + person.getAccountBalance());
				} else if (!isTypeOfOperationCorrect) {
					System.out.println("Incorrect type of Operation");
				}
			} else {
				System.out.println("Your account is locked.");
			}
		} else {
			System.out.println("Account number is not valid.");
		}
	}
}
