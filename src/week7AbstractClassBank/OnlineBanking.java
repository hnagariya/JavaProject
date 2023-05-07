package week7AbstractClassBank;

import java.util.Scanner;

public class OnlineBanking extends BankOperation {
//	boolean isEnteredPasswordReqMeet;
//	String enteredPassword;
//	String existingPassword;
	Scanner sc = new Scanner(System.in);

	public OnlineBanking(double accountBalance) {
		super(accountBalance);
		// TODO Auto-generated constructor stub
	}

	@Override
	double depositAmount(double amountDeposited) {
		System.out.println("Money deposit by etransfer ");
		return super.depositAmount(amountDeposited);
	}

//	public boolean checkEnteredPinOrPasswordMeetReq(String enteredPinOrPassword) {
//		boolean isSpecialCharacterNotPresent = true;
//		System.out.println(
//				"Please enter new password which should be atleast 8 character and should not containing &,$,@");
//		enteredPassword = sc.next();
//		char[] newPasswordChar = enteredPassword.toCharArray();
//		for (int i = 0; i < newPasswordChar.length; i++) {
//			if (newPasswordChar[i] == '&' || newPasswordChar[i] == '$' || newPasswordChar[i] == '@') {
//				isSpecialCharacterNotPresent = false;
//			}
//		}
//		if (isSpecialCharacterNotPresent && enteredPassword.length() > 8) {
//			isEnteredPasswordReqMeet = true;
//		}
//		return isEnteredPasswordReqMeet;
//	}

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
