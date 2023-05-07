package week7AbstractClassBank;

public abstract class BankOperation {
	double accountBalance;

	public BankOperation(double accountBalance) {
		super();
		this.accountBalance = accountBalance;
	}
	

	//public abstract boolean checkEnteredPinOrPasswordMeetReq(String enteredPinOrPassword);

	public abstract String changePinPassword(String actualPinOrPassword);

	double withdrawAmount(double amountWithdrawn) {
		if (amountWithdrawn < accountBalance) {
			System.out.println("You have withdrawn: " + amountWithdrawn);
			accountBalance = accountBalance - amountWithdrawn;
		} else {
			System.out.println("You do not have enough balance. Enter the amount lesser than Account Balance");
		}
		return accountBalance;
	}

	double depositAmount(double amountDeposited) {
		accountBalance = accountBalance + amountDeposited;
		return accountBalance;
	}

	void viewBalance() {
		System.out.println("Your account balance is: " + accountBalance);
	}

}
