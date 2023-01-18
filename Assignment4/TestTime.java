package Assignment4;

//Assignment 4 -  Sreelakshmi Sreenaryanapurath Radhakrishnan  - 8788732

import java.util.Scanner;

public class TestTime {

	public static void main(String[] args) {
		
		//initializing scanner		
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter time 1 in hour, minute and second
		System.out.println("Enter time 1 (hour minute second): ");
		int hour,minute,second;
		hour = input.nextInt();
		minute = input.nextInt();
		second = input.nextInt();
		
		//initializing time1		
		Time time1 =  new Time(hour,minute,second);
		
		//Displaying time in string format and elapsed time	
		System.out.println(time1);
		System.out.println("Elapsed seconds in time1 : " + time1.getSeconds());
		
		//prompt user to input time2 in elapsed time		
		System.out.println("Enter time2 (elapsed time): ");
		long seconds = input.nextLong();
		
		//initializing time2		
		Time time2 = new Time(seconds);
		
		//displaying output		
		System.out.println(time2);
		System.out.println("Elapsed time in time2 : "+ time2.getSeconds());
		
		//comparing, cloning and displaying output		
		System.out.println("time1.compareTo(time2)? " + time1.compareTo(time2));
		Time time3 = (Time)time1.clone();
		System.out.println("time3 is created as a clone of time1");
		System.out.println("time1.compareTo(time3)? " + time1.compareTo(time3));		
		
	}

}
