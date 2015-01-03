import java.util.Scanner;

public class PayrollStatement {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//prompt the user to enter his/her name
		System.out.println("Enter your full name ");
		String name = input.nextLine();
		
		//prompt the user to enter the number of hours worked in a week
		System.out.println("Enter the number of hours worked in a week.");
		int hoursWorkedInAWeek = input.nextInt();
		
		//prompt the user to enter his/her hourly pay rate
		System.out.println("Enter your hourly pay rate.");
		double payRate = input.nextDouble();
		
		double grossPay = payRate * hoursWorkedInAWeek;
		
		//prompt the user to enter the Federal tax withholding rate
		System.out.println("Enter the Federal tax withholding rate.");
		double federalTaxWithholdingRate = input.nextDouble();
		
		//prompt the user to enter the State tax withholding rate
		System.out.println("Enter the State tax withholding rate.");
		double stateTaxWithholdingRate = input.nextDouble();
		
		double federalTaxAmount = ((federalTaxWithholdingRate * payRate) * 100) / 10;
		double stateTaxAmount = ((stateTaxWithholdingRate * payRate) * 100) / 10.0;
		double netPay = ((grossPay - federalTaxAmount - stateTaxAmount) * 100.0) / 100.0;
		double totalDeduction = federalTaxAmount + stateTaxAmount; 
		
		//format to two digits after decimal
		federalTaxAmount = (int)(federalTaxAmount * 100) / 100.0;
		stateTaxAmount = (int)(stateTaxAmount * 100) / 100.0;
		netPay = (int) (netPay * 100) / 100.0;
		totalDeduction = (int)(totalDeduction * 100) / 100.0;
		
		//assign variables for $ and %
		char letter = '\u0024';
		char percentage = '\u0025';
		
		//format to display percentage in output
		double federalTaxRatePercentage = federalTaxWithholdingRate * 100;
		double stateTaxRatePercentage = stateTaxWithholdingRate * 100;
		
		
		
		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked: " + hoursWorkedInAWeek);
		System.out.println("Pay Rate: " + letter + payRate);
		System.out.println("Gross Pay: " + letter + grossPay);
		System.out.println("Deductions:\n" + "\t Federal Withholding" + "(" + 
		federalTaxRatePercentage + percentage + ")" + ":" + letter + federalTaxAmount);
		System.out.println("\t State Withholding" + "(" + 
				stateTaxRatePercentage + percentage + ")" + ":" + letter + stateTaxAmount);
		System.out.println("\t Total Deduction" + ":" + letter + totalDeduction);
		System.out.println("Net Pay: " + letter + netPay);
	}
}
