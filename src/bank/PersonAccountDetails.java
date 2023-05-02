package bank;

public class PersonAccountDetails {
	private String accountNumber;
	private String accountHolderName;
	private double accountBalance;
	private int pin;
	private String onlineBankingPassword;

	public PersonAccountDetails() {
		super();
	}

	public PersonAccountDetails(String accountNumber, String accountHolderName, double accountBalance, int pin,
			String onlineBankingPassword) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
		this.pin = pin;
		this.onlineBankingPassword = onlineBankingPassword;
	}

	public int getPin(boolean isBank) {
		if (isBank) {
			return pin;
		} else {
			return 0;
		}
	}

	public void setPin(int enteredPin, int existingPin) {
		if (enteredPin == existingPin) {
			this.pin = enteredPin;
		} else {
			System.out.println("Incorrect attempt");
		}
	}

	public String getOnlineBankingPassword(boolean isBank) {
		if (isBank) {
			return onlineBankingPassword;
		} else {
			return null;
		}
	}

	public void setOnlineBankingPassword(String enteredOnlineBankingPassword, String existingOnlineBankingPassword) {

		if (existingOnlineBankingPassword.equals(onlineBankingPassword)) {
			this.onlineBankingPassword = enteredOnlineBankingPassword;
		} else {
			System.out.println("wrong attempt");
		}

	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

}
