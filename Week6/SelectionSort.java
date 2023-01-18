package Week6;

public class SelectionSort {

	public static void main(String[] args) {
		
		
		double[] mylist = {5,8,6,3,1,12,19,56};
		System.out.println("Before Sorting");
		ArrayUtils.PrintArray(mylist);
		
		ArrayUtils.SelectionSort(mylist);
		
		System.out.println("After Sorting");
		ArrayUtils.PrintArray(mylist);

		

	}

}
