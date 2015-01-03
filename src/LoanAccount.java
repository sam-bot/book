public class LoanAccount extends Account {
// The data fields that represent a loan account
private String type;
private String lastPayment;
private double principal;
private int numYears;


// No arg constructor
public LoanAccount() {


}


// Loan account constructor that includes all class variables
public LoanAccount(String accountNum, double balance, double interestRate,
java.util.Date dateOpened, Customer cust, double avgBalance,
String type, String lastPayment, double principal, int numYears) {
super(accountNum, balance, interestRate, dateOpened, cust, avgBalance);
this.type = type;
this.lastPayment = lastPayment;
this.principal = principal;
this.numYears = numYears;
}


// Return the type
public String getType() {
return type;
}


// Set a new type
public void setType(String type) {
this.type = type;
}


// Return the last payment
public String getLastPayment() {
return lastPayment;
}


// Set a new last payment
public void setLastPayment(String lastPayment) {
this.lastPayment = lastPayment;
}


// Return the principal
public double getPrincipal() {
return principal;
}


// Set a new principal
public void setPrincipal(double principal) {
this.principal = principal;
}


// Return the number of years
public int getNumYears() {
return numYears;
}


// Set a new number of years
public void setNumYears(int numYears) {
this.numYears = numYears;
}


// Overrides the Object toString() method
public String toString() {
return super.toString() + "\nType: " + type + "\nPrincipal: "
+ principal + "\nLength: " + numYears + " years"
+ "\nLast Payment: " + lastPayment;
}


// Overrides the Account abstract method
public double calculateInterest() {
double interest = principal * (getInterestRate() / 100) * numYears;
return interest;
}
}
