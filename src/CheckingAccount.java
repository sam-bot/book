public class CheckingAccount extends BankAccount {
// Data fields that represent an overdraft charge and
// overdraft protection
private static double overdraftCharge = 35.00;
private boolean overdraftProtection;


// No arg constructor
public CheckingAccount() {
super();
}


// Checking account constructor that includes all class variables
public CheckingAccount(String accountNum, double balance,
double interestRate, java.util.Date dateOpened, Customer cust,
double avgBalance, String lastDeposit, String lastWithdrawal,
boolean overdraftProtection) {
super(accountNum, balance, interestRate, dateOpened, cust, avgBalance,
lastDeposit, lastWithdrawal);
this.overdraftProtection = overdraftProtection;
}


// return the overdraft charge
public static double getOverdraftCharge() {
return overdraftCharge;
}


// set the overdraft charge
public static void setOverdraftCharge(double overdraftCharge) {
CheckingAccount.overdraftCharge = overdraftCharge;
}


// return overdraft protection
public boolean isOverdraftProtection() {
return overdraftProtection;
}


// set the overdraft protection
public void setOverdraftProtection(boolean overdraftProtection) {
this.overdraftProtection = overdraftProtection;
}


// Override the Object toString() method
public String toString() {
if (overdraftProtection == true)
return super.toString() + "\nOverdraft: Yes";
else
return super.toString() + "\nOverdraft: No";
}


@Override // Calculates account interest
public double calculateInterest() {
double interest = 0;
if (getBalance() <= 500)
interest = 0;
else if (getBalance() > 500)
interest = getBalance() * (getInterestRate() / 100);
return interest;
}


// Overrides the Account abstract method
public double makeWithdrawal(double balance, double withdrawalAmount) {
if (balance > withdrawalAmount)
return balance = balance - withdrawalAmount;
else
return balance = balance - overdraftCharge;
}
}
