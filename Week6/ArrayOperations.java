package Week6;

public class ArrayOperations {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		double[] myList = new double[4];
		System.out.print("Enter " + myList.length + " values: ");
		for (int i = 0; i < myList.length; i++)
			myList[i] = input.nextDouble();
	
//		ArrayUtils.PrintArray(myList);
//		ArrayUtils.SumArray(myList);
		int indexofArray = ArrayUtils.binarySearch(myList, 1);
		System.out.printf("The index of %d is %d \n" , 1, indexofArray);
		
		

	}
	
	
	

}
