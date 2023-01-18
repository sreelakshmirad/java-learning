package Week6;

public class ArrayAverage {

	public static void main(String[] args) {

		double[] mylist = { 5, 8, 6, 3, 1, 12, 19, 56 };
		System.out.println("The array is");
		ArrayUtils.PrintArray(mylist);
		System.out.println("The average of array " + AvgArray(mylist));

	}

	public static double AvgArray(double[] myList) {
		double sum = SumArray(myList);
		double avg;

		return avg = sum / myList.length;

	}

	public static double SumArray(double[] myList) {

		double total = 0;
		for (int i = 0; i < myList.length; i++) {
			total += myList[i];
		}
		return total;

	}
}
