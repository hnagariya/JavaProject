package bank;

import java.util.Arrays;
import java.util.Scanner;

public class BankOperations {
	double accountBalance;


	public BankOperations(double accountBalance) {
		super();
		this.accountBalance = accountBalance;
	}

	double withdrawAmount(double amountWithdrawn) {
		if (amountWithdrawn < accountBalance) {
			System.out.println("You have withdrawn: " + amountWithdrawn);
			accountBalance=accountBalance - amountWithdrawn;
		} else {
			System.out.println("You do not have enough balance. Enter the amount lesser than Account Balance");
		}
		return accountBalance;
	}

	double depositAmount(double amountDeposited) {
		accountBalance=accountBalance + amountDeposited;
		return accountBalance;
	}

	void viewBalance() {
		System.out.println("Your account balance is: " + accountBalance);
	}

}
