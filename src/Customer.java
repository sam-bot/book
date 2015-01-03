public class Customer implements Search {
// The data fields that represents customer information
private String SSN;
private String lastName;
private String firstName;
private String DOB;
private String address;
private String city;
private String state;
private String zip;
private String phone;
private String email;


// No arg constructor
public Customer() {


}


// Customer constructor with all class variables
public Customer(String SSN, String lastName, String firstName, String DOB,
String address, String city, String state, String zip,
String phone, String email) {
this.SSN = SSN;
this.lastName = lastName;
this.firstName = firstName;
this.DOB = DOB;
this.address = address;
this.city = city;
this.state = state;
this.zip = zip;
this.phone = phone;
this.email = email;
}


// Customer constructor with all class variables except email
public Customer(String SSN, String lastName, String firstName, String DOB,
String address, String city, String state, String zip, String phone) {
this.SSN = SSN;
this.lastName = lastName;
this.firstName = firstName;
this.DOB = DOB;
this.address = address;
this.city = city;
this.state = state;
this.zip = zip;
this.phone = phone;
}


// Return the SSN
public String getSSN() {
return SSN;
}


// Set a new SSN
public void setSSN(String SSN) {
this.SSN = SSN;
}


// Return the customer's last name
public String getLastName() {
return lastName;
}


// Set a new last name
public void setLastName(String lastName) {
this.lastName = lastName;
}


// Return the customer's first name
public String getFirstName() {
return firstName;
}


// Set a new first name
public void setFirstName(String firstName) {
this.firstName = firstName;
}


// Return the date of birth
public String getDOB() {
return DOB;
}


// Set a new date of birth
public void setDOB(String DOB) {
this.DOB = DOB;
}


// Return the address
public String getAddress() {
return address;
}


// Set a new address
public void setAddress(String address) {
this.address = address;
}


// Return the city
public String getCity() {
return city;
}


// Sets a new city
public void setCity(String city) {
this.city = city;
}


// Return the state
public String getState() {
return state;
}


// Set a new state
public void setState(String state) {
}


// Return the zip code
public String getZip() {
return zip;
}


// Set a new zip code
public void setZip(String zip) {
this.zip = zip;
}


// Return the phone number
public String getPhone() {
return phone;
}


// Get a new phone number
public void setPhone(String phone) {
this.phone = phone;
}


// return email
public String getEmail() {
return email;
}


// set email
public void setEmail(String email) {
this.email = email;
}


// Overrides the Object toString() method
public String toString() {
return lastName + ", " + firstName;
}


// Method takes a Customer array as parameter and outputs result to the
// console
public static Customer[] getOutput(Customer[] customers) {
for (int i = 0; i < customers.length; i++) {
System.out.println(customers[i]);
System.out.println("---------------------------");
}
return customers;
}


@Override
// Searches an array of customers for information
public int searchRecords(Object[] list, String s) {
int j = 0;
for (int i = 0; i < list.length; i++) {
if (lastName.equals(s))
j = i;
else
j = -1;
}
return j;
}


// Tests the searchRecords method
public void testSearch(Customer[] customers, String s) {
if (this.searchRecords(customers, s) == (-1))
System.out.println("Customer " + s + " not found.");
else
System.out.println("Customer " + s + " found." + " Customer SSN: "
+ customers[0].getSSN());
}
}
