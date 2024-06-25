

public abstract class Account {
	protected double balance;
	
	public Account(double initialBalance)
	{
		this.balance = initialBalance;
		Bank.incrementTotalAccounts();
	}
	
	public abstract void deposit(double amount);
	
	public abstract void withdraw(double amount);

	public abstract double getBalance();
}
