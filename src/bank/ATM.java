package bank;

public class ATM extends BankOperations {

	public ATM(int accountBalance) {
		super(accountBalance);
	}

	double depositAmount(double amountDeposited, int chequeNumber) {
		System.out.println("Money deposited by cheque");
		setAccountBalance(getAccountBalance() + amountDeposited);
		return getAccountBalance();
	}

	@Override
	double withdrawAmount(double amountWithdrawn) {
		int counter = 0;
		if (amountWithdrawn < getAccountBalance()) {
			System.out.println("You have withdrawn: "+amountWithdrawn);
			setAccountBalance(getAccountBalance() - amountWithdrawn);
			counter++;
		} else {
			System.out.println("You do not have enough balance. Enter the amount lesser than Account Balance");
		}
		if (counter == 5) {
			System.out.println("You have exceed the free limit of ATM");
		}

		return getAccountBalance();
	}

}
