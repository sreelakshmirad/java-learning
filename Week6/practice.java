package Week6;

public class practice {

	public static void main(String[] args) {

		char ch = 'A';
		System.out.println(ch);
		++ch;
		System.out.print(false);

		int in = 'a';
		System.out.println(in);
		char b = 97;
		System.out.println(b);

		for (int i = 0, j = 0; (i + j < 10) && i < 4; i++, j++) {
			System.out.println("hello");
		}
		
		double[] doubleArray = {5,6,10};

		for (double value: doubleArray)
			System.out.println(value);
		
		int x = 1; // x represents an int value
		int[] y = new int[10]; // y represents an array of int values
		m(x, y); // Invoke m with arguments x and y
		System.out.println("x is " + x);
		System.out.println("y[0] is " + y[0]);
			
	}

	public static void m(int number, int[] numbers) {
		
		System.out.print(numbers.length);
		number = 1001; // Assign a new value to number
		numbers[0] = 5555; // Assign a new value to numbers[0]
	}
	
	

}
