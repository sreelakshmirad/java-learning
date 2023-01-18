package Week2;
import java.util.Scanner ;

public class SortNumbers {

	public static void main(String[] args) {
		
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter three numbers");
	    int a = input.nextInt();
	    int b = input.nextInt();
	    int c = input.nextInt();
	    int temp;
	    if (b < a) {
	      temp = a;
	      a = b;
	      b = temp;
	    }

	    if (c < b) {
	      temp = b;
	      b = c;
	      c = temp;
	    }

	    if (b < a) {
	      temp = a;
	      a = b;
	      b = temp;
	    }
	    System.out.println(a);
	    System.out.println(b);
	    System.out.println(c);
	}

}
