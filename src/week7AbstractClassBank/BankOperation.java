package week7AbstractClassBank;

public abstract class BankOperation {

	public BankOperation() {
		super();
	}

	public abstract String changePinPassword(String actualPinOrPassword);

	double withdrawAmount(double amountWithdrawn, double accountBalance) {
		if (amountWithdrawn < accountBalance) {
			System.out.println("You have withdrawn: " + amountWithdrawn);
			accountBalance = accountBalance - amountWithdrawn;
		} else {
			System.out.println("You do not have enough balance. Enter the amount lesser than Account Balance");
		}
		return accountBalance;
	}

	double depositAmount(double amountDeposited, double accountBalance) {
		accountBalance = accountBalance + amountDeposited;
		return accountBalance;
	}

	void viewBalance(double accountBalance) {
		System.out.println("Your account balance is: " + accountBalance);
	}

}
