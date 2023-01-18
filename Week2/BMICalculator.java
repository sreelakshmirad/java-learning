package Week2;
import java.util.Scanner;
//Submitted by Sreelakshmi Sreenarayanapurath Radhakrishnan 8788732

public class BMICalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
				
		System.out.println("Enter your weight in pounds");
		double weight =  input.nextDouble();
		
		System.out.println("Enter feet");
		int feet = input.nextInt();
		
		System.out.println("Enter inches");
		double inches = input.nextDouble();
		
		double totalheight =  (feet * 12 ) + inches;
		double bmi = weight/ Math.pow(totalheight, 2) * 703;
	
		System.out.println("BMI is " + bmi);
	
		if (bmi < 18.5) {
			System.out.println("Underweight");
		}
		else if(bmi < 25.0) {
			System.out.println("Normal");
	
		} 	else if(bmi < 30.0) {
			System.out.println("Overweight");
	
		} 	else if(bmi > 30.0) {
			System.out.println("Obese");
	
		} 
	
	
	}
}
