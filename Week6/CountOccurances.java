package Week6;

import java.util.Scanner;

public class CountOccurances {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter numbers between 1 and 100. Enter 0 to stop");
		int[] numList = new int[5];
		int number ;
		int i = 0;

		do{
			number = input.nextInt();
			if (number <= 0) {
				break;
			}
				
			numList[i] = number;
			i++;

		}while (number > 0) ;

		
		ArrayUtils.PrintArray(numList);
		countOccurance(numList);
	}
	
	public static void countOccurance(int[] numList) {
		int[] occuranceCount = new int[5];
		
		for(int i =0; i<= numList.length-1;i++) {
			for(int j =i+1; j<numList.length;j++) {
				System.out.print(numList[i]);
				System.out.println(numList[j]);
				

				if (i == j) {
					
					occuranceCount[i] =  occuranceCount[i]++;
				}
				else {
					
					occuranceCount[i] = 1;
				}
			}
	
		}
		ArrayUtils.PrintArray(occuranceCount);	
	}

}
