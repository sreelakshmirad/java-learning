package Week6;

public class ArrayUtils {

	static void PrintArray(double[] myList) {

		for (int i = 0; i < myList.length; i++) {
			System.out.print(myList[i] + " ");
		}
		System.out.printf("\n");

	}
	

	static void PrintArray(int[] myList) {

		for (int i = 0; i < myList.length; i++) {
			System.out.print(myList[i] + " ");
		}
		System.out.printf("\n");

	}
	
	static void PrintArray(double[][] myList) {

		for (int i = 0; i < myList.length; i++) {
			System.out.print(myList[i] + " ");
		}
		System.out.printf("\n");

	}

	static void SumArray(double[] myList) {

		double total = 0;
		for (int i = 0; i < myList.length; i++) {
			total += myList[i];
		}

	}

	static int binarySearch(double[] myList, int key) {

		int low = 0;
		int high = myList.length - 1;
		while (high >= low) {

			int mid = (low + high) / 2;
			if (key < myList[mid])
				high = mid - 1;
			else if (key == myList[mid])
				return mid;
			else
				low = mid + 1;
		}
		return -low - 1;

	}
	
	
	static void SelectionSort(double []list) {
		
		
		for(int i =0; i<= list.length-1;i++) {
			
			double currentMin = list[i];
			int currentMinIndex = i;
			
			for(int j =i+1; j<list.length;j++) {
				
				if(currentMin > list[j]) {
					
					currentMin = list[j];
					currentMinIndex = j;
				}
				
			}
			
			if(currentMinIndex != i) {
				
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
			
			
		}
	}
}
