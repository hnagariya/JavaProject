package bank;

public class ATM extends BankOperations {

	

	public ATM(double accocuntBalance) {
		super(accocuntBalance);
	}

	double depositAmount(double amountDeposited, int chequeNumber) {
		System.out.println("Money deposited by cheque");
		accountBalance=accountBalance + amountDeposited;
		return accountBalance;
	}

	@Override
	double withdrawAmount(double amountWithdrawn) {
		int counter = 0;
		if (amountWithdrawn <accountBalance) {
			System.out.println("You have withdrawn: " + amountWithdrawn);
			accountBalance=accountBalance - amountWithdrawn;
			counter++;
		} else {
			System.out.println("You do not have enough balance. Enter the amount lesser than Account Balance");
		}
		if (counter == 5) {
			System.out.println("You have exceed the free limit of ATM");
		}

		return accountBalance;
	}

}
