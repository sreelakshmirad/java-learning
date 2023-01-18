//Assignment 3 -  Sreelakshmi Sreenaryanapurath Radhakrishnan  - 8788732
package Assignment3;

import java.util.Date;

/*
 * Account class containing :
 * 		private int data id, with default 0
 * 		private double balance, with default 0
 * 		private double annualInterestRate with default 0
 * 		private Date dateCreated
 * 		a no-arg constructor
 * 		a constructor that creates object with given id and balance
 * 		accessor and mutator methods for id , balance and annualInterestDate
 * 		accessor method for dateCreated
 * 		getMonthlyInterestRate method for calculating monthly interest rate
 * 		withdraw method for withdrawing
 * 		deposit method for depositing
 */

public class Account {
	private int id = 0;
	private double balance = 0;
	private static double annualInterestRate = 0;
	private java.util.Date dateCreated;

	// no-arg constructor
	public Account() {
	}

	// constructor creates the object with given id and balance and initializes
	// dateCreated to the date when the object is created
	public Account(int id, double balance) {
		dateCreated = new java.util.Date();
		setId(id);
		setBalance(balance);

	}

	// accessor method for the field id
	public int getId() {
		return this.id;
	}

	// accessor method for the field balance
	public double getBalance() {
		return balance;
	}

	// accessor method for annualInterestRate
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	// accessor method for dateCreated
	public Date getDateCreated() {
		return dateCreated;
	}

	// mutator method for id
	public void setId(int id) throws IllegalArgumentException {
		// validating id
		if (id > 0)
			this.id = id;
		else
			throw new IllegalArgumentException("ID must be greater than zero");

	}

	// mutator method for balance
	public void setBalance(double balance) {
		// validating balance
		if (balance > 0)
			this.balance = balance;
		else
			throw new IllegalArgumentException("Balance must be greater than zero");
	}

	// mutator method for annualInterestRate
	public void setAnnualInterestRate(double annualInterestDate) {
		// validating annualInterestRate
		if (annualInterestDate > 0)
			Account.annualInterestRate = annualInterestDate;
		else
			throw new IllegalArgumentException("Annual Interest rate must be greater than zero");
	}

	// method to calculate monthly interest rate
	public double getMonthlyInterestRate() {
		return (annualInterestRate / 100) / 12;
	}

	// method to calculate monthly interest
	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}

	// method to withdraw and update balance
	public void withdraw(double amount) {
		// validating withdrawal amount
		if (amount > 0 && amount <= this.balance)
			this.balance = balance - amount;
		else
			throw new IllegalArgumentException("withdrwal amount must be greater than 0 and less than" + this.balance);

	}

	// method to deposit and update balance
	public void deposit(double amount) {
		// validating deposit amount
		if (amount > 0)
			this.balance = balance + amount;
		else
			throw new IllegalArgumentException("deposit amount must be greater than 0");
	}
}
