package week7AbstractClassBank;

import java.util.Arrays;
import java.util.Scanner;

public class BankOperationMain {
	static String[] typeOfOperation = { "Deposit", "WithdrawMoney", "ViewBalance", "ChangePinPassword" };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int enteredPinToValidate = 0;
		String enteredPasswordToValidate = "";
		String actualPinOrPassword = "";

		PersonAccountDetails personAccount=new PersonAccountDetails();
		PersonAccountDetails neelamAccount = new PersonAccountDetails("87654321", "Neelam", 1000, 1234,"abc1234");
		PersonAccountDetails monikaAccount = new PersonAccountDetails("87654322", "Monika", 2000, 1235,"abc1235");
		PersonAccountDetails saritaAccount = new PersonAccountDetails("87654323", "Sarita",3000, 1236,"abc1236");
		PersonAccountDetails maneeshAccount = new PersonAccountDetails("87654324", "maneesh", 4000, 1237,"abc1237");
		PersonAccountDetails suhasAccount = new PersonAccountDetails("87654325", "Suhas", 5000, 1238,"abc1238");
		
		PersonAccountDetails[]personList= {neelamAccount,monikaAccount,saritaAccount,maneeshAccount,suhasAccount};
		personAccount.addPersonToPersonList(personList);
		
		// BankOperation class object created by initializing it null, later it will be
		// initiated through child class constructor
		BankOperation bankOperation = null;
        System.out.println("Please enter your accont no.");
        String personAccountNumber= sc.next();
       
        PersonAccountDetails personObject=personAccount.getObjectOfPersonDetail(personAccountNumber);
        Double accountBalance=personObject.getAccountBalance();
		System.out.println("Please select the method of bank trsnsaction: ATM or OnlineBanking");
		String method = sc.next();
		int counter = 0;
		boolean isValidationCorrect = false;

		switch (method) {

		case "ATM":
			for (counter = 0; counter < 3; counter++) {
				System.out.println("Please enter your pin");
				enteredPinToValidate = sc.nextInt();
				sc.nextLine();
				if (enteredPinToValidate == personObject.getPin(true)) {
					// bankOperation class object created by calling child class ATM constructor
					bankOperation = new ATM();
					actualPinOrPassword = Integer.toString(personObject.getPin(true));
					isValidationCorrect = true;
					break;
				}
			}
			break;

		case "OnlineBanking":
			for (counter = 0; counter < 3; counter++) {
				System.out.println("Please enter your password");
				enteredPasswordToValidate = sc.next();
				if (enteredPasswordToValidate.equals(personObject.getOnlineBankingPassword(true))) {
					// bankOperation class object created by calling child class ATM constructor
					bankOperation = new OnlineBanking();
					actualPinOrPassword = personObject.getOnlineBankingPassword(true);
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
				accountBalance=bankOperation.depositAmount(amountDeposited,accountBalance);
				isTypeOfOperationCorrect = true;
			} else if (operationTypeSelected.equals("WithdrawMoney")) {
				System.out.println("Please enter the amount to be withdrawn");
				double amountWithdrawn = sc.nextDouble();
				accountBalance=bankOperation.withdrawAmount(amountWithdrawn,accountBalance);
				isTypeOfOperationCorrect = true;
			} else if (operationTypeSelected.equals("ViewBalance")) {
				bankOperation.viewBalance(accountBalance);
				isTypeOfOperationCorrect = true;
			} else if (operationTypeSelected.equals("ChangePinPassword")) {
				String s = bankOperation.changePinPassword(actualPinOrPassword);
				if (method.equals("ATM")) {
					int newPin = Integer.parseInt(s);
					personObject.setPin(newPin, enteredPinToValidate);
					System.out.println(personObject.getPin(true));
				} else if (method.equals("OnlineBanking")) {
					personObject.setOnlineBankingPassword(s, enteredPasswordToValidate);
					System.out.println(personObject.getOnlineBankingPassword(true));
				}
				isTypeOfOperationCorrect = true;
			}
			sc.close();
			if (isTypeOfOperationCorrect && !operationTypeSelected.equals("ChangePinPassword")) {
				personObject.setAccountBalance(accountBalance);
				System.out.println("Your account balance is: " + personObject.getAccountBalance());
			} else if(!isTypeOfOperationCorrect){
				System.out.println("Please enter correct type of Operation");
			}
		} else {
			System.out.println("Your account is locked.");
		}
	}

}
