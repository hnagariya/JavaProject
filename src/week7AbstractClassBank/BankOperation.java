package week7AbstractClassBank;

public abstract class BankOperation {

	public BankOperation() {
		super();
	}

	public abstract void changePinPassword(PersonAccountDetails person);

	public void withdrawAmount(double amountWithdrawn, PersonAccountDetails person) {
		if (amountWithdrawn < person.getAccountBalance()) {
			System.out.println("You have withdrawn: " + amountWithdrawn);
			person.setAccountBalance(person.getAccountBalance() - amountWithdrawn);
		} else {
			System.out.println("You do not have enough balance. Enter the amount lesser than Account Balance");
		}
	}

	public void depositAmount(double amountDeposited, PersonAccountDetails person) {
		person.setAccountBalance(person.getAccountBalance() + amountDeposited);
	}

	void viewBalance(PersonAccountDetails person) {
		System.out.println("Your account balance is: " + person.getAccountBalance());
	}

}
