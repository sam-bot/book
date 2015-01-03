public abstract class BankAccount extends Account {
	// The data fields that represent bank account information
	private String lastDeposit;
	private String lastWithdrawal;

	// No arg constructor
	protected BankAccount() {
	}

	// Bank Account constructor with class variables
	protected BankAccount(String accountNum, double balance,
			double interestRate, java.util.Date dateOpened, Customer cust,
			double avgBalance, String lastDeposit, String lastWithdrawal) {
		super(accountNum, balance, interestRate, dateOpened, cust, avgBalance);
		this.lastDeposit = lastDeposit;
		this.lastWithdrawal = lastWithdrawal;

	}

	// Return the last deposit
	public String getLastDeposit() {
		return lastDeposit;
	}

	// Set a new last deposit
	public void setLastDeposit(String lastDeposit) {
		this.lastDeposit = lastDeposit;
	}

	// Return the last withdrawal
	public String getLastWithdrawal() {
		return lastWithdrawal;
	}

	// Set a new last withdrawal
	public void setLastWithdrawal(String lastWithdrawal) {
		this.lastWithdrawal = lastWithdrawal;
	}

	// Overrides the Object toString() method
	public String toString() {
		return super.toString();
	}

	// Adds a deposit to an account balance
	public double makeDeposit(double balance, double depositAmount) {
		balance = depositAmount + balance;
		return balance;
	}

	// Adds interest to an account balance
	public double addInterest() {
		double balance = getBalance() + calculateInterest();
		return balance;
	}

	// Withdrawals funds from an account
	public abstract double makeWithdrawal(double balance,
			double withdrawalAmount);

	// Tests the makeWithdrawal, makeDeposit, and addInterest methods
	public void testMethods(Account[] accounts, double withdrawalAmount,
			double depositAmount) {
		System.out.printf("Account " + accounts[0].getAccountNum()
				+ " add interest. New Balance: $%.2f.\n", addInterest());
		System.out
				.printf("Account "
						+ accounts[1].getAccountNum()
						+ " withdrawal. Insufficient funds. New balance after fee $%.2f.",
						makeWithdrawal(accounts[1].getBalance(),
								withdrawalAmount));
		System.out.printf("Account " + accounts[2].getAccountNum()
				+ " new balance after deposit: $%.2f.\n",
				makeDeposit(accounts[2].getBalance(), depositAmount));

	}
}
