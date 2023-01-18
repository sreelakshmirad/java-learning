package Week5;
import java.util.Scanner;

public class SumDigits {

	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
//		  Prompt user to input a digit
		  System.out.println("Enter a digit");
		  
		  int number =  input.nextInt();
//		  Calling method sumDigits
		  int sum = sumDigits(number);
		  
		  
//		  Display the output
		  System.out.printf("The sum of digits %d is %d \n", number, sum);

	}
	
	public static int sumDigits(long n) {
		int sum = 0;
//		Check if number is greater than zero
			while (n > 0) {
				int rem =  (int) (n % 10);
				sum =  sum+rem ;
				n =  (n- rem)/10;
				
			}
			  	
	
		return sum;
		
		
	}
	
}
