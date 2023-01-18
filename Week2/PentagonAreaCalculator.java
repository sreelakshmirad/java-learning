package Week2;

import java.util.Scanner;

public class PentagonAreaCalculator {

	public static void main(String[] args) {
		
		
		

			Scanner input = new Scanner(System.in);
			
//			Prompt user to enter the length from center to vertex
			System.out.println("Enter the length from the center to a vertex");
			double lengthFromcenter  = input.nextDouble();
			
//			Calculate length of the side
			double lengthofSide   = 2 * lengthFromcenter * Math.sin(Math.PI/5);
			
//			Calculate the area of pentagon
			
			double area = (5 * Math.pow(lengthFromcenter, lengthofSide)) / 4 * Math.tan(Math.PI/5);
			
			System.out.println("The area of the pentagon is" + Math.round(area));
			
		
		// TODO Auto-generated method stub

	}

}
