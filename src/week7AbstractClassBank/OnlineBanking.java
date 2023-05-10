package week7AbstractClassBank;

import java.util.Scanner;

public class OnlineBanking extends BankOperation {
	Scanner sc = new Scanner(System.in);

	public OnlineBanking() {
		super();
	}

	@Override
	public void depositAmount(double amountDeposited, PersonAccountDetails person) {
		System.out.println("Deposited by etransfer");
		person.setAccountBalance(person.getAccountBalance()+amountDeposited);
	}

	@Override
	public void changePinPassword(PersonAccountDetails person) {
		boolean isSpecialCharacterNotPresent = true;
		System.out.println("Please enter your current pin");
		String existingPassword = sc.next();
		System.out.println(
				"Please enter new password which should be atleast 8 character and should not containing &,$,@");
		String newPasswordToSet = sc.next();
		if(newPasswordToSet.contains("&")&& newPasswordToSet.contains("$")&& newPasswordToSet.contains("@")) {
			isSpecialCharacterNotPresent = false;
		}
		if (isSpecialCharacterNotPresent && existingPassword.equals(person.getOnlineBankingPassword(true))
				&& !newPasswordToSet.equals(person.getOnlineBankingPassword(true))) {
			person.setOnlineBankingPassword(newPasswordToSet, existingPassword);
			System.out.println(person.getOnlineBankingPassword(isSpecialCharacterNotPresent));
		} else {
			System.out.println("Incorrect attempt to change password");
		}
	}

	
}
