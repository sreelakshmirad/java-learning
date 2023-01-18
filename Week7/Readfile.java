package Week7;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Readfile {

	public static void main(String[] args) {

		final String FILENAME_PREFIX = "babynameranking";

		String year = "2010";

		File file = new File("src\\Data\\babynameranking" + year + ".txt");

		try (Scanner fileScanner = new Scanner(file)) {
			while (fileScanner.hasNextLine()) {
				
//				String str = fileScanner.nextLine();
//				for(int  i =0 ; i<= str.length() ; i++) {
//					System.out.println(str);
//		
//				}
				String[] line = fileScanner.nextLine().split("\\s+");
				System.out.println(line[0] + " - " + line[1] + " - " + line[2]);
			}

		} catch (IOException ioException) {
			ioException.printStackTrace();
		}

	}

}
