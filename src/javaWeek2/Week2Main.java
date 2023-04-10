package javaWeek2;

public class Week2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TableOf2 multipleOf2 = new TableOf2();
		multipleOf2.number = 2;
		multipleOf2.table2();
		multipleOf2.number = 3;
		multipleOf2.table3();
		System.out.println("*****************");
		ForLoopDemo atmPinLocked = new ForLoopDemo();
		atmPinLocked.actualPin=1234;
		atmPinLocked.cardBlockedAfter3IncorrectPin();
		System.out.println("*****************");
		ATMWithdrawal wc = new ATMWithdrawal();
		wc.accountBalance=5000;
		wc.withdrawalAmount=1000;
		wc.customerAtmWithdrawalWithPin();
		System.out.println("*******************");
		Table table =new Table();
		table.tableOfNumber();
		
		

	}

}
