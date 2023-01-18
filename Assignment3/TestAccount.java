//Assignment 3 -  Sreelakshmi Sreenaryanapurath Radhakrishnan  - 8788732

package Assignment3;

import java.util.Scanner;

public class TestAccount {

	public static void main(String[] args) {

		// initializing the scanner
		Scanner input = new Scanner(System.in);

		// Setting continueInput as true
		boolean continueInput = true;

		// looping until continueInput becomes false
		do {
			try {
				// Prompt user to input ID
				System.out.println("Enter the Account ID:");
				int accountId = input.nextInt();

				// Prompt user to input balance
				System.out.println("Enter the balance:");
				double balance = input.nextDouble();

				// Prompt user to input annual interest rate
				System.out.println("Enter the annual interest rate:");
				double annualInterestRate = input.nextDouble();

				// Prompt user to input withdrawal amount
				System.out.println("Enter the withdrawal amount:");
				double withdrawalAmount = input.nextDouble();

				System.out.println("Enter the deposit amount:");
				double depositAmount = input.nextDouble();

				// Creates account object with given id and balance
				Account account = new Account(accountId, balance);

				// Setting annual interest rate as the entered value
				account.setAnnualInterestRate(annualInterestRate);

				// Withdrawing the entered withdrawal amount
				account.withdraw(withdrawalAmount);

				// Depositing the entered deposit amount
				account.deposit(depositAmount);

				// Displaying the output
				System.out.println("Balance: $" + account.getBalance());
				System.out.println("Monthly Interest: $" + account.getMonthlyInterest());
				System.out.println("Date Created: " + account.getDateCreated());

				// Updating the value of continueInput to false so that the loop will not be
				// executed again
				continueInput = false;

			} catch (IllegalArgumentException iae) {
				// catching IllegalArgumentException
				System.out.println("Try again! " + iae.getMessage());
			} catch (Exception e) {
				// catching all other exceptions
				System.out.print("Try again! " + e.getMessage());
			}

		} while (continueInput);

	}

}
