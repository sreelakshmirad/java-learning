// Assignment 1 - Sreelakshmi Sreenarayanapurath Radhakrishnan 8788732

package Week2;

import java.util.Scanner;

public class EnergyCalculator {

	public static void main(String[] args) {
		final double MULTIPLITER = 4184;

		Scanner input = new Scanner(System.in);
		// Prompt the user to enter amount of water in kilograms
		System.out.println("Enter the amount of water in kilograms :");
		double weightinKilograms = input.nextDouble();

		//Validating the user input , checking if entered weight is less than zero
		if (weightinKilograms < 0) {
			System.out.println("Water amount cannot be negative number!");
			return;

		}
		//Prompt the user to enter the initial temperature
		System.out.println("Enter the initial temperature :");
		double initialTemp = input.nextDouble();

		//Prompt the user to enter the final temperature
		System.out.println("Enter the final temperature :");
		double finalTemp = input.nextDouble();

		//Compute the energy  needed
		double energyNeeded = weightinKilograms * (finalTemp - initialTemp) * MULTIPLITER;

		//Display the result
		System.out.println("The energy needed is:" + energyNeeded);

	}

}
