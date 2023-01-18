package Week4;

import java.util.Scanner;

public class SumCalculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Takes the first input
	    System.out.print("Enter an integer (the input ends if it is 0): ");
	    int data =  input.nextInt();
	    
	    int sum= 0;
	    double totalCount = 0;
	    int postiveCount = 0;
	    int negativeCount = 0;
	    double average = 0;
	    
	    //Check if number is zero
	    if (data == 0) {
	    	System.out.println("No number entered except 0");
	    	System.exit(0);
	    }
	    
	    //while not zero count and calculate sum
	    while(data != 0) {
	    	totalCount += 1;
	    	sum += data;
	    	if (data >0) {
	    		postiveCount += 1;
	    	}
	    	else {
	    		negativeCount += 1;
	    	}
	        System.out.print("Enter an integer (the input ends if it is 0): ");
	        data = input.nextInt();
	    }
	    
	    //Calculate average
	    average = sum/ totalCount;
	    
	    
	    //Display result
	    System.out.printf("The number of positives is %d\n", postiveCount );
	    System.out.printf("The number of negatives is %d\n", negativeCount );
	    System.out.printf("The total is %d\n", sum );
	    System.out.printf("The average is %.2f\n", average );

	    }

}
