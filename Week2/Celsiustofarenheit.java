package Week2;
import java.util.Scanner;

public class Celsiustofarenheit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a degree in Celsius");
		double celsiusValue = input.nextDouble();
		double farenheitValue = (9.0/5) * celsiusValue + 32;
		System.out.println(celsiusValue + " Celsius is " + farenheitValue + " Farenheit" );
		
		
		
		
		// TODO Auto-generated method stub

	}

}
