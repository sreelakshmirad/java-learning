package Week3;

import java.util.Scanner;

public class NumberFinder {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		
		//Prompt the user to enter a letter
		System.out.println("Enter a letter");
		String s = input.nextLine();
		
		//Getting the first character from the string
		char ch = s.charAt(0);

		
		//Converting the letter to upper case
		ch = Character.toUpperCase(ch);
		
		int number = 0;
		
		//Checking the input and determining the value of character
		if (ch >= 'A' && ch <= 'C') {
			number = 2;
		} else if (ch >= 'D' && ch <= 'F') {
			number = 3;

		} else if (ch >= 'G' && ch <= 'I') {
			number = 4;

		} else if (ch >= 'J' && ch <= 'L') {
			number = 5;

		} else if (ch >= 'M' && ch <= 'O') {
			number = 6;

		} else if (ch >= 'P' && ch <= 'S') {
			number = 7;

		} else if (ch >= 'T' && ch <= 'V') {
			number = 8;

		} else if (ch >= 'W' && ch <= 'Z') {
			number = 9;

		} else {
			System.out.print(ch + " is an invalid input");
			System.exit(1);

		}

		//Display the output
		System.out.println("The corresponsing number is " + number);

	}

}
