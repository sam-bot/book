import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class Account implements Search {
	// The data fields that represent account information
	private String accountNum;
	private double balance;
	private double interestRate;
	private java.util.Date dateOpened;
	private Customer cust;
	private double avgBalance;

	// No arg constructor
	protected Account() {

	}

	// Account constructor with all class variables
	protected Account(String accountNum, double balance, double interestRate,
			java.util.Date dateOpened, Customer cust, double avgBalance) {
		this.dateOpened = new java.util.Date();
		this.accountNum = accountNum;
		this.balance = balance;
		this.interestRate = interestRate;
		this.cust = cust;
		this.avgBalance = avgBalance;
	}

	// return the account number
	public String getAccountNum() {
		return accountNum;
	}

	// set the account number
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	// return the balance
	public double getBalance() {
		return balance;
	}

	// set the balance
	public void setBalance(double balance) {
		this.balance = balance;
	}

	// return the interest rate
	public double getInterestRate() {
		return interestRate;
	}

	// set the interest rate
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	// return the date opened
	public java.util.Date getDateOpened() {
		return dateOpened;
	}

	// set the date opened
	public void setDateOpened(java.util.Date dateOpened) {
		this.dateOpened = dateOpened;
	}

	// return the customer
	public Customer getCust() {
		return cust;
	}

	// set the customer
	public void setCust(Customer cust) {
		this.cust = cust;
	}

	// return the average balance
	public double getAvgBalance() {
		return avgBalance;
	}

	// set the average balance
	public void setAvgBalance(double avgBalance) {
		this.avgBalance = avgBalance;
	}

	// overrides the Object toString() method
	public String toString() {
		return cust + "\nAccount Number: " + accountNum + "\nBalance: " + "$"
				+ balance + "\nInterest Rate: " + interestRate + "%"
				+ "\nAverage Thirty Day Balance: " + "$" + avgBalance
				+ "\nDate Opened: " + dateOpened;
	}

	// Method takes an Account array as parameter and outputs result to the
	// console
	public static Account[] getOutput(Account[] accounts) {
		for (int i = 0; i < accounts.length; i++) {
			System.out.println(accounts[i]);
			System.out.println("---------------------------");
		}
		return accounts;
	}

	// abstract method that calculates an account's interest
	public abstract double calculateInterest();

	@Override
	// Searches an array of accounts for information
	public int searchRecords(Object[] list, String s) {
		int j = 0;
		for (int i = 0; i < list.length; i++) {
			if (accountNum.equals(s))
				j = i;
			else
				j = -1;
		}
		return j;
	}

	// Displays current interest on an input account
	public void showInterest() {
		System.out.printf("Current Interest of Account " + getAccountNum()
				+ ": $%.2f\n", calculateInterest());
	}

	// tests the searchRecords method
	public void testSearch(Account[] accounts, String s) {
		if (this.searchRecords(accounts, s) == (-1))
			System.out.println("Customer " + s + " not found.");
		else
			System.out.println("Account " + s + " found." + " Balance: "
					+ accounts[0].getBalance());
	}
}
