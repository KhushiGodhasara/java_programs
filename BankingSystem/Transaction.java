
public class Transaction {
	private final double transactionFee;
	
	public Transaction(double transactionFee)
	{
		this.transactionFee = transactionFee;
	}
	
	public final void performTransaction(Account account,double amount, boolean isDeposit)
	{
		if(isDeposit)
		{
			account.deposit(amount);
		}
		else
		{
			account.withdraw(amount);
		}
		account.withdraw(transactionFee);
		System.out.println("Transaction fee of " + transactionFee + " applied, current balance: " + account.getBalance());
	}
	
	public final double getTransactionFee()
	{
		return transactionFee;
	}
}
