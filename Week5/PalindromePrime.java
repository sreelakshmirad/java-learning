package Week5;

import java.util.Scanner;

public class PalindromePrime {

	public static void main(String[] args) {

		
		
		int count = 0;
		int n =1;

		while(count <= 100) {
			
			if (isPalindrome(n)  ){
				count ++;
				System.out.print(n);
				if (count% 10 == 0) {
					System.out.printf("\n");
				}
				
			}
			n++;
		}

	}

	public static boolean isPrime(int number) {

		boolean isPrime = true;
//		Check if a number and reverse are the same
		for (int i = 1; i < number - 1; i++) {

			if (number % i == 0) {

				isPrime = false;
			}
		}
		return false;

	}

	public static boolean isPalindrome(int number) {

//		Check if a number and reverse are the same
		if (number == reverse(number)) {
			return true;
		}
		return false;

	}

	public static int reverse(int number) {

		int reverse = 0;
//		Reversing a number 
		while (number > 0) {
			int rem = (number % 10);
			reverse = (reverse * 10) + rem;
			number = number / 10;
		}

		return reverse;

	}

}
