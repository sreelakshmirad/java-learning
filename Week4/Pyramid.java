package Week4;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number  of lines");
		
		int numLines = input.nextInt();
		
		for (int i= 1; i<= numLines ; i++) {
			
			
			
			for(int k=i ; k >= 2;  k--  ) {
				System.out.print(" " +k );

				
	
			}
			
			for(int j = 1 ; j <= i;  j++  ) {
				System.out.print(" " +j );

				
				
				
			}
			
			
			
			System.out.printf("\n");

			
			
		}

		
		
		
	}

}
