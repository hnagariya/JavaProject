package javaWeek2;

public class ATMWithdrawal {
	int accountBalance;
	int withdrawalAmount;
	int overdraftAmount;
	void customerAtmWithdrawalWithPin() {
		ForLoopDemo withdrawCash =new ForLoopDemo();
		withdrawCash.actualPin=1234;
		withdrawCash.cardBlockedAfter3IncorrectPin();
		if(withdrawCash.actualPin==withdrawCash.enteredPin)
		{
			if(withdrawalAmount<accountBalance || overdraftAmount<accountBalance)
			{
				System.out.println("You can withdraw cash");}
			else {
				System.out.println("You do not have enough balance");
				}
			}
		}
	}
