
public class SavingsAccount extends Account {
	private static final double INTEREST_RATE = 0.03;
	
	public SavingsAccount(double initialBalance)
	{
		super(initialBalance);
	}
	
	@Override
	public void deposit(double amount)
	{
		balance += amount + (amount * INTEREST_RATE);
		System.out.println("Deposite " + amount + "with interest, new balance : " + balance);
	}
	
	@Override
	public void withdraw(double amount)
	{
		if(amount <= balance)
		{
			balance -= amount;
			System.out.println("Withdraw " + amount + ",new balance : " + balance);
		}
		else
		{
			System.out.println("Insufficient funds for withdrawal.");
		}
	}
	
	@Override
	public double getBalance()
	{
		return balance;
	}
}