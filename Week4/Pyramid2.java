package Week4;

import java.util.Scanner;

public class Pyramid2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number  of lines");
		
		int numLines = input.nextInt();
		
		for (int i= 1; i<=numLines  ; i++) {
			
			int offsetNumbers = numLines-i;
			for(int s=0;s <offsetNumbers ; s++) {
				
				System.out.print("   ");
				
			}
for(int leftSide = numLines-offsetNumbers ;leftSide >=2; leftSide-- ) {
	System.out.printf("%4d", (leftSide));
	
}

for(int rightSide = 1 ;rightSide < numLines- offsetNumbers ; rightSide++ ) {
	System.out.printf("%4d", (rightSide));
	
}

System.out.println();
			
		}
		



	}

}
