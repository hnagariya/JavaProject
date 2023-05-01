package bank;

public class OnlineBanking extends BankOperations{

	public OnlineBanking(int accountBalance) {
		super(accountBalance);
	}
    @Override
    double depositAmount(double amountDeposited) {
    	System.out.println("Money deposit by etransfer ");
    	return super.depositAmount(amountDeposited);
    }
}
