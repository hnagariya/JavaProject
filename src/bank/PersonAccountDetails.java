package bank;

public class PersonAccountDetails {
	private String accountNumber;
	private String accountHolderName;
	private double totalFunds;
	private int pin;
	private String onlineBankingPassword;

	public PersonAccountDetails(String accountNumber, String accountHolderName, int pin, String onlineBankingPassword) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
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

	public double getTotalFunds() {
		return totalFunds;
	}

}
