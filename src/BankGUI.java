import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;

public class BankGUI extends JFrame {
	/*
	 * Name: Sam Renick Date: 5-3-12 Module 13 Assignment Description:
	 */
	private JTextField accountInfoField = new JTextField();
	private JTextField balanceField = new JTextField();
	private JTextField interestRateField = new JTextField();
	private JTextField avgBalanceField = new JTextField();
	private JLabel firstNameLabel = new JLabel("First Name");
	private JLabel lastNameLabel = new JLabel("Last Name");
	private JLabel accountNumberLabel = new JLabel("Account Number");
	private JLabel balanceLabel = new JLabel("Balance");
	private JLabel interestRateLabel = new JLabel("Interest Rate");
	private JLabel avgBalanceLabel = new JLabel("Average Balance");
	private JLabel ovdrftProtLabel = new JLabel("Overdraft Protection");
	private JRadioButton ovrdftPrtctn1 = new JRadioButton("Yes");
	private JRadioButton ovrdftPrtctn2 = new JRadioButton("No");
	private JButton accntInfoButton = new JButton("Account Information");
	private JButton depositButton = new JButton("Deposit");
	private JButton withdrawalButton = new JButton("Withdrawal");
	private JButton createAccountButton = new JButton("New Account");
	private JTextField firstNameField = new JTextField();
	private JTextField lastNameField = new JTextField();
	private JButton customerInfoButton = new JButton("Customer Information");
	private JButton enterNewCustomer = new JButton("New Customer");
	private JTextArea displayCustomerInfo = new JTextArea(
			"Customer Information", 5, 10);
	private JTextArea displayAccountInfo = new JTextArea("Account Information",
			37, 37);
	private ImageIcon stag = new ImageIcon("BankLogo.jpg");
	private JLabel logo2 = new JLabel("General Community Bank");
	private JLabel logo = new JLabel(stag, 2);
	private Customer[] customerList = new Customer[2];
	private Account[] accountList = new Account[4];
	Date d1 = new Date();
	private String lastName = lastNameField.getText();
	private String accountNum = accountInfoField.getText();
	private double balance = 0;
	private double avgBalance = 0;
	private String lastWithdrawal = d1.toString();
	private String lastDeposit = d1.toString();
	private boolean overdraftProtection = false;
	private double withdrawalAmount;
	private double depositAmount;

	/* Main Method */
	public static void main(String[] args) {

		BankGUI b1 = new BankGUI();
		b1.setSize(850, 600);
		b1.setLocationRelativeTo(null);
		b1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b1.setTitle("General Community Bank");
		b1.setVisible(true);

	}

	// no arg constructor
	public BankGUI() {

		// Create a panel to hold logo and name
		JPanel jpBank = new JPanel();
		Color slate = new Color(49, 62, 79);
		Color burntOrange = new Color(204, 85, 0);
		jpBank.setBackground(slate);

		// Create a logo for GCB
		jpBank.setLayout(new BorderLayout(1, 1));
		Font f = new Font("Dialog", Font.BOLD, 40);
		logo2.setFont(f);
		logo2.setForeground(Color.GRAY);
		jpBank.add(logo, BorderLayout.WEST);
		jpBank.add(logo2, BorderLayout.CENTER);
		add(jpBank, BorderLayout.NORTH);

		// Create a panel to accept user inputs for information
		JPanel jpBank2 = new JPanel();

		jpBank2.setBackground(slate);
		Font f2 = new Font("Calibri", Font.BOLD, 15);

		// Format color and font for labels
		firstNameLabel.setFont(f2);
		firstNameLabel.setForeground(burntOrange);
		lastNameLabel.setFont(f2);
		lastNameLabel.setForeground(burntOrange);
		accountNumberLabel.setFont(f2);
		accountNumberLabel.setForeground(burntOrange);
		balanceLabel.setFont(f2);
		balanceLabel.setForeground(burntOrange);
		interestRateLabel.setFont(f2);
		interestRateLabel.setForeground(burntOrange);
		avgBalanceLabel.setFont(f2);
		avgBalanceLabel.setForeground(burntOrange);

		// add labels and text fields to panel
		jpBank2.setLayout(new GridLayout(2, 2));
		JPanel jpBankAcct = new JPanel();
		jpBankAcct.setLayout(new GridLayout(4, 1));
		jpBankAcct.setBackground(slate);

		jpBankAcct.add(accountNumberLabel);
		jpBankAcct.add(accountInfoField);
		jpBankAcct.add(balanceLabel);
		jpBankAcct.add(balanceField);
		jpBankAcct.add(interestRateLabel);
		jpBankAcct.add(interestRateField);
		jpBankAcct.add(avgBalanceLabel);
		jpBankAcct.add(avgBalanceField);

		// Creates a panel to display account information
		JPanel jpBank5 = new JPanel();
		displayAccountInfo.setWrapStyleWord(true);
		displayAccountInfo.setLineWrap(true);
		jpBank5.add(displayAccountInfo);

		JPanel jpBankRadio = new JPanel();
		jpBankRadio.setLayout(new GridLayout(1, 3));
		jpBankRadio.setBackground(slate);
		jpBankRadio.add(ovdrftProtLabel);
		jpBankRadio.add(ovrdftPrtctn1);
		jpBankRadio.add(ovrdftPrtctn2);

		jpBank2.add(jpBankAcct);
		jpBank2.add(jpBank5);
		jpBank2.add(jpBankRadio);

		JPanel jpAcctBtns = new JPanel(new GridLayout(2, 2));
		jpAcctBtns.add(accntInfoButton);
		jpAcctBtns.add(depositButton);
		jpAcctBtns.add(withdrawalButton);
		jpAcctBtns.add(createAccountButton);
		jpBank2.add(jpAcctBtns);

		ActionListener listener = new AccountInfoListener();
		ActionListener listener2 = new CustomerInfoListener();
		ActionListener listener3 = new NewAccountListener();
		ActionListener listener4 = new DepositListener();
		ActionListener listener5 = new WithdrawalListener();

		accntInfoButton.addActionListener(listener);
		accountInfoField.addActionListener(listener);
		customerInfoButton.addActionListener(listener2);
		lastNameField.addActionListener(listener2);
		firstNameField.addActionListener(listener2);
		accountInfoField.addActionListener(listener4);
		accountInfoField.addActionListener(listener5);
		accountInfoField.addActionListener(listener3);
		interestRateField.addActionListener(listener3);
		lastNameField.addActionListener(listener3);
		withdrawalButton.addActionListener(listener5);
		depositButton.addActionListener(listener4);

		// Create a panel to record overdraft protection
		JPanel jpBank3 = new JPanel();
		ovdrftProtLabel.setFont(f2);
		ovdrftProtLabel.setForeground(burntOrange);
		jpBank3.setBackground(slate);
		displayCustomerInfo.setWrapStyleWord(true);
		displayCustomerInfo.setLineWrap(true);
		jpBank3.add(displayCustomerInfo); // Displays customer info

		// Groups radio buttons together
		ButtonGroup group = new ButtonGroup();
		group.add(ovrdftPrtctn1);
		group.add(ovrdftPrtctn2);
		ovrdftPrtctn1.setBackground(slate);
		ovrdftPrtctn2.setBackground(slate);
		ovrdftPrtctn2.setForeground(burntOrange);
		ovrdftPrtctn1.setForeground(burntOrange);
		add(jpBank2, BorderLayout.CENTER);
		ovrdftPrtctn1.addActionListener(listener3);
		ovrdftPrtctn2.addActionListener(listener3);

		// Creates a panel for buttons
		JPanel jpBank4 = new JPanel();
		jpBank4.setBackground(Color.DARK_GRAY);
		JPanel jpButtons = new JPanel(new GridLayout(6, 2));
		jpBank4.setLayout(new GridLayout(1, 2));
		jpButtons.add(firstNameLabel);
		jpButtons.add(firstNameField);
		jpButtons.add(lastNameLabel);
		jpButtons.add(lastNameField);
		jpButtons.add(customerInfoButton);
		jpButtons.add(enterNewCustomer);
		jpButtons.setBackground(slate);
		jpBank4.add(jpButtons);
		add(jpBank4, BorderLayout.SOUTH);

		JPanel jpCustDisplay = new JPanel();
		jpCustDisplay.add(displayCustomerInfo);
		jpBank4.add(displayCustomerInfo);

		Font f3 = new Font("Cambria", Font.BOLD, 18);
		accntInfoButton.setFont(f3);
		depositButton.setFont(f3);
		withdrawalButton.setFont(f3);
		createAccountButton.setFont(f3);
		customerInfoButton.setFont(f3);
		enterNewCustomer.setFont(f3);

		// Creates background and font colors
		Color darkGreen = new Color(0, 60, 39);

		// Sets button colors
		accntInfoButton.setBackground(darkGreen);
		depositButton.setBackground(darkGreen);
		withdrawalButton.setBackground(darkGreen);
		createAccountButton.setBackground(darkGreen);
		customerInfoButton.setBackground(darkGreen);
		enterNewCustomer.setBackground(darkGreen);
		accntInfoButton.setForeground(Color.GRAY);
		depositButton.setForeground(Color.GRAY);
		withdrawalButton.setForeground(Color.GRAY);
		createAccountButton.setForeground(Color.GRAY);
		customerInfoButton.setForeground(Color.GRAY);
		enterNewCustomer.setForeground(Color.GRAY);
		createAccountButton.addActionListener(listener3);

		// Create and initializes an array of Customer
		customerList[0] = new Customer("121212121", "Smith", "Laura",
				"10-02-78", "123 Main St", "Statesboro", "GA", "30458",
				"912-489-9056", "myemail@yahoo.com");
		customerList[1] = new Customer("232523252", "Deal", "John", "04-13-45",
				"212 S. Zetterower", "Statesboro", "GA", "30458",
				"912-489-1122");

		// Create and initializes an array of Account
		accountList[0] = new CheckingAccount("111222333", 1500.75, 2.5, d1,
				customerList[0], 5175.42, "06/02/11", "06/03/11", true);
		accountList[1] = new CheckingAccount("111222334", 501.80, 1.5, d1,
				customerList[1], 150.32, "06/15/11", "06/11/11", false);
		accountList[2] = new SavingsAccount("111222335", 1112.56, 2.25, d1,
				customerList[0], 3007.80, "06/15/11", "06/11/11");
		accountList[3] = new LoanAccount("111222336", 1201.77, 7.5, d1,
				customerList[0], 2004.35, "car", "06/01/11", 25000, 3);

	}

	// listener for the Account Information button
	class AccountInfoListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// get values from text fields
			String accountNum = accountInfoField.getText();
			if (accountInfoField.getText().length() == 0) {
				javax.swing.JOptionPane.showMessageDialog(null,
						"Please enter an account number");
			}
			for (int i = 0; i < accountList.length; i++) {
				if (accountList[i].searchRecords(accountList, accountNum) > (-1)) {
					displayAccountInfo.setText(accountList[i].toString());
					break;
				} else if (accountList[i]
						.searchRecords(accountList, accountNum) == (-1)) {
					displayAccountInfo.setText("account not found");
				}
			}
		}
	}

	// listener for the Customer Information button
	class CustomerInfoListener implements ActionListener {
		public void actionPerformed(ActionEvent f) {
			String firstName = firstNameField.getText();
			String lastName = lastNameField.getText();
			for (int j = 0; j < customerList.length; j++) {
				if (lastNameField.getText().length() == 0) {
					if ((firstNameField.getText().length() == 0)
							|| lastNameField.getText().length() == 0) {
						javax.swing.JOptionPane.showMessageDialog(null,
								"Please enter a customer's last name");
						break;
					}
					if (customerList[j].searchRecords(customerList, firstName) > (-1)) {
						displayCustomerInfo.setText(customerList[j].toString());
					}
				} else if (customerList[j]
						.searchRecords(customerList, lastName) > (-1)) {
					displayCustomerInfo.setText(customerList[j].toString());
					if (customerList[j].searchRecords(customerList, lastName) == (-1)) {
						displayCustomerInfo.setText("Customer not found");
					}
				}
			}

		}
	}

	// listener for the New Customer button
	class NewAccountListener implements ActionListener {
		public void actionPerformed(ActionEvent g) {
			for (int k = 0; k < customerList.length; k++) {
				if (ovrdftPrtctn1.isSelected())
					overdraftProtection = true;
				else if (ovrdftPrtctn2.isSelected())
					overdraftProtection = false;
				else
					javax.swing.JOptionPane.showMessageDialog(null,
							"Select Overdraft Protection: Yes or No");
				if (lastNameField.getText().length() < 1) {
					javax.swing.JOptionPane.showMessageDialog(null,
							"Enter the customer's last name");
					if (accountInfoField.getText().length() != 9)
						javax.swing.JOptionPane.showMessageDialog(null,
								"Enter a nine digit account number");
					if (interestRateField.getText().length() < 1)
						javax.swing.JOptionPane.showMessageDialog(null,
								"Enter the interest rate");
					break;
				}
				if (customerList[k].searchRecords(customerList,
						lastNameField.getText()) == (-1)) {
					displayCustomerInfo
							.setText("Customer not found, please create the customer first.");
				} else if (customerList[k].searchRecords(customerList,
						lastNameField.getText()) > (-1)) {
					double interestRate = Double.parseDouble(interestRateField
							.getText());
					CheckingAccount newAccount = new CheckingAccount(
							accountNum, balance, interestRate, d1,
							customerList[k], avgBalance, lastDeposit,
							lastWithdrawal, overdraftProtection);
					displayAccountInfo.setText(newAccount.toString());
				}
			}
		}
	}

	// listener for the Deposit button
	class DepositListener implements ActionListener {
		public void actionPerformed(ActionEvent b) {
			if (accountInfoField.getText().length() != 9) {
				javax.swing.JOptionPane.showMessageDialog(null,
						"Enter a nine digit account number");
			}
			for (int m = 0; m < accountList.length; m++) {
				if (accountList[m].searchRecords(accountList,
						accountInfoField.getText()) > (-1)) {
					depositAmount = Integer.parseInt(javax.swing.JOptionPane
							.showInputDialog(null, "Enter deposit amount: "));
					balance = ((BankAccount) accountList[m]).makeDeposit(
							accountList[m].getBalance(), depositAmount);
					accountList[m].setBalance(balance);
					displayAccountInfo.setText(accountList[m].toString());
					break;
				} else {
					displayAccountInfo.setText("Account number not found");
				}
			}

		}
	}

	// listener for the Withdrawal button
	class WithdrawalListener implements ActionListener {
		public void actionPerformed(ActionEvent c) {
			for (int p = 0; p < accountList.length; p++) {
				if (accountInfoField.getText().length() != 9) {
					javax.swing.JOptionPane.showMessageDialog(null,
							"Enter a nine digit account number");
				} else if (accountList[p].searchRecords(accountList,
						accountInfoField.getText()) > (-1)) {
					withdrawalAmount = Integer
							.parseInt(javax.swing.JOptionPane.showInputDialog(
									null, "Enter withdrawal amount: "));
					if (withdrawalAmount > accountList[p].getBalance()) {
						javax.swing.JOptionPane.showMessageDialog(null,
								"Insufficient funds");
						balance = accountList[p].getBalance()
								- CheckingAccount.getOverdraftCharge();
						accountList[p].setBalance(balance);
						displayAccountInfo.setText(accountList[p].toString());
					} else
						balance = ((BankAccount) accountList[p])
								.makeWithdrawal(accountList[p].getBalance(),
										withdrawalAmount);
					accountList[p].setBalance(balance);
					displayAccountInfo.setText(accountList[p].toString());
					break;
				} else {
					displayAccountInfo.setText("Account number not found");
				}
			}
		}
	}
}