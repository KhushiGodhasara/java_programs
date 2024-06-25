
public class BankingTransaction {

	public static void main(String[] args) {
		SavingsAccount savingacc = new SavingsAccount(500.00);
		CheckingAccount checkingacc = new CheckingAccount(1000.00);
		
		Transaction transaction = new Transaction(5.00);
		transaction.performTransaction(savingacc, 200.00, true);
		transaction.performTransaction(checkingacc, 150.00, false);
		
		System.out.println("Total number of account : " + Bank.getTotalAccounts());
	}

}
