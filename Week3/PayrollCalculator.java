package Week3;
import java.util.Scanner;

public class PayrollCalculator {

	public static void main(String[] args) {
		
		Scanner input =  new Scanner(System.in);
		
		//Defining constants
		final double MULTIPLIER = 100.0;
		
		//Prompt user to enter name
		System.out.println("Enter employee’s name:");
		String  employeeName= input.next();
		
		 //Prompt user to enter the number of hours worked in a week		 
		 System.out.println("Enter number of hours worked in a week: ");
		double hours =  input.nextDouble();
		
		//Prompt user to enter the hourly pay rate.
		System.out.println("Enter hourly pay rate: ");
		double payRate = input.nextDouble();
		
		//Prompt user to enter the federal tax withholding rate
		System.out.println("Enter federal tax withholding rate: ");
		double federalTaxRate = input.nextDouble();
		
		//Prompt user to enter the state tax withholding rate.
		System.out.println("Enter state tax withholding rate: ");
		double stateTaxRate = input.nextDouble();
		
		//Calculate gross pay
		double grossPay =  hours * payRate;
		
		//Calculate federal withholding
		double federalWithholding = grossPay * federalTaxRate;
		
		//Calculate state withholding
		double stateWithholding = grossPay * stateTaxRate;
		
		//Calculate total deduction
		double totalDeduction = federalWithholding + stateWithholding;
		
		//Calculate net pay
		double netPay  = grossPay - totalDeduction;
		
		//Format and display output
		System.out.println("Employee Name: " + employeeName);
		System.out.println("Hours Worked: " + hours);
		System.out.printf("Pay Rate: $%.2f\n" , payRate);
		System.out.printf("Gross Pay: $%.2f\n" , grossPay);
		System.out.printf("Deductions : \n");
		System.out.printf("\t State Withholding (%.1f %%) : $%.2f\n" ,federalTaxRate * MULTIPLIER , federalWithholding);
		System.out.printf("\t State Withholding (%.1f %%): $%.2f\n" ,stateTaxRate * MULTIPLIER , stateWithholding);
		System.out.printf("\t Total Deduction : $ %.2f \n",totalDeduction );
		System.out.printf("Net Pay : $%.2f", netPay); 


	
		

	}

}
