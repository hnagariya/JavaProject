package week7AbstractClassBank;

public class PersonAccountDetails {
	private String accountNumber;
	private String accountHolderName;
	private double accountBalance;
	private int actualPin;
	private String actualPassword;

	public PersonAccountDetails() {
		super();
	}

	public PersonAccountDetails(String accountNumber, String accountHolderName, double accountBalance, int pin,
			String onlineBankingPassword) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
		this.actualPin = pin;
		this.actualPassword = onlineBankingPassword;
	}

	public int getPin(boolean isBank) {
		if (isBank) {
			return actualPin;
		} else {
			return 0;
		}
	}

	public void setPin(int enteredPin, int existingPin) {
		if (existingPin == actualPin) {
			this.actualPin = enteredPin;
		} else {
			System.out.println("Incorrect attempt to set pin");
		}
	}

	public String getOnlineBankingPassword(boolean isBank) {
		if (isBank) {
			return actualPassword;
		} else {
			return null;
		}
	}

	public void setOnlineBankingPassword(String enteredOnlineBankingPassword, String existingOnlineBankingPassword) {

		if (existingOnlineBankingPassword.equals(actualPassword)) {
			this.actualPassword = enteredOnlineBankingPassword;
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
