package Week5;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
//		Prompt the user to enter a interger
		System.out.println("Enter a integer");
		int n =  input.nextInt();
//		Display output
		if (isPalindrome(n) ){
			System.out.printf("The %d is palindrome", n);
			
		}else {
			System.out.printf("The %d is not palindrome", n);
	
		}
		
		

	}
	public static boolean isPalindrome(int number) {
		
//		Check if a number and reverse are the same
		if (number == reverse(number) ) {
			return true;
		}
		return false;
		
		
	}
	
	public static int reverse(int number) {
		
		int reverse = 0;
//		Reversing a number 
		while (number >0 ) {			
			int rem = (number % 10);
			reverse =  (reverse * 10)+rem  ;
			number =  number /10;
		}
		

		return reverse;
			
	}

}
