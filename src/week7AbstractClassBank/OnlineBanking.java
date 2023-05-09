package week7AbstractClassBank;

import java.util.Scanner;

public class OnlineBanking extends BankOperation {
	Scanner sc = new Scanner(System.in);

	public OnlineBanking() {
		super();
	}
	@Override
    double depositAmount(double amountDeposited,double accountBalance) {
		System.out.println("Deposited by etransfer");
		accountBalance = accountBalance + amountDeposited;
		return accountBalance;
	}

	@Override
	public String changePinPassword(String actualPinOrPassword) {
		boolean isSpecialCharacterNotPresent = true;
		System.out.println("Please enter your current pin");
		String existingPassword = sc.next();
		System.out.println(
				"Please enter new password which should be atleast 8 character and should not containing &,$,@");
		String newPasswordToSet = sc.next();
		char[] newPasswordChar = newPasswordToSet.toCharArray();
		for (int i = 0; i < newPasswordChar.length; i++) {
			if (newPasswordChar[i] == '&' || newPasswordChar[i] == '$' || newPasswordChar[i] == '@') {
				isSpecialCharacterNotPresent = false;
			}
		}
		if (isSpecialCharacterNotPresent && existingPassword.equals(actualPinOrPassword)
				&& !newPasswordToSet.equals(actualPinOrPassword)) {
			actualPinOrPassword = newPasswordToSet;
		} else {
			System.out.println("Incorrect attempt to change password");
		}
		return actualPinOrPassword;

	}
}
