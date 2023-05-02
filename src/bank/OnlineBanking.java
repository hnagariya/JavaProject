package bank;

public class OnlineBanking extends BankOperations {

	public OnlineBanking(double accocuntBalance) {
		super(accocuntBalance);
		// TODO Auto-generated constructor stub
	}

	@Override
	double depositAmount(double amountDeposited) {
		System.out.println("Money deposit by etransfer ");
		return super.depositAmount(amountDeposited);
	}
}
