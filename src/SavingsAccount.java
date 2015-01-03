public class SavingsAccount extends BankAccount {

	// Static data field that represents a bonus
	private static double bonus = .01;

	// No arg constructor
	public SavingsAccount() {

	}

	// Savings Account constructor with all class variables
	public SavingsAccount(String accountNum, double balance,
			double interestRate, java.util.Date dateOpened, Customer cust,
			double avgBalance, String lastDeposit, String lastWithdrawal) {
		super(accountNum, balance, interestRate, dateOpened, cust, avgBalance,
				lastDeposit, lastWithdrawal);
	}

	// return the bonus
	public static double getBonus() {
		return bonus;
	}

	// set the bonus
	public static void setBonus(double bonus) {
		SavingsAccount.bonus = bonus;
	}

	// Overrides the Object toString() method
	public String toString() {
		return super.toString();
	}

	// Overrides the Account abstract method
	public double calculateInterest() {
		double interest = getBalance() * (getInterestRate() / 100);
		return interest;

	}

	// Overrides the Account abstract makeWithdrawal method
	public double makeWithdrawal(double balance, double withdrawalAmount) {

		if (balance > withdrawalAmount)
			return balance = balance - withdrawalAmount;
		else
			return -1;
	}
}
