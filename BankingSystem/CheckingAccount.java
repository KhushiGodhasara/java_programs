
public class CheckingAccount extends Account {
	private static final double OVERDRAFT_LIMIT = 1000.00;
	
	public CheckingAccount(double initialBalance)
	{
		super(initialBalance);
	}
	
	@Override
	public void deposit(double amount)
	{
		balance += amount;
		System.out.println("Deposite " + amount + ",new balance : " + balance);
	}
	
	@Override
	public void withdraw(double amount)
	{
		if(amount <= balance + OVERDRAFT_LIMIT) 
		{
			balance -= amount;
			System.out.println("Withdraw " + amount + ",new balance: " + balance);
		}
		else
		{
			System.out.println("Overdraft limit exceeded.");
		}
	}
	
	@Override
	public double getBalance()
	{
		return balance;
	}
}
