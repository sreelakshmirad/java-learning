package Week6;

public class TwoDArray {

	public static void main(String[] args) {

		int matrix[][] = new int[10][10];
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix[i].length; j++)
				matrix[i][j] = (int) (Math.random() * 1000);

		printArray(matrix);

	}

	public static void printArray(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
//				System.out.print(matrix[i][j] + " ");
				System.out.printf(" %5d ",matrix[i][j] );


			}
			System.out.printf("\n");
		}

	}

}
