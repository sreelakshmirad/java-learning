/* Project -1 
 * Group- 7
 * Group Members:
 * Haowen Shi (8882279)
 * Navneet Kaur Sindhu Brar (8818367)
 * Saumya Singh (8854619)
 * Sreelakshmi Sreenarayanapurath Radhakrishnan (8788732)
 * Every member contributed to the plan, and Navneet Kaur Sindhu Brar was absent from some group meetings and finalization.
 */

package Project1;

//import java utilities
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class NameRankFinder {

	// set the final variables to store the values
	final static int START_YEAR = 2001;
	final static int END_YEAR = 2010;
	final static int NUMBER_OF_YEARS = 10;
	final static int NUMBER_OF_RANKS = 1000;

	// main method
	public static void main(String[] args) {

		// set the two dimensional arrays to store the information of girls
		String[][] girlNames = new String[NUMBER_OF_YEARS][NUMBER_OF_RANKS];

		// set the two dimensional arrays to store the information of boys
		String[][] boyNames = new String[NUMBER_OF_YEARS][NUMBER_OF_RANKS];

		// call the readFile method to add information from files to arrays
		readFile(girlNames, boyNames);

		Scanner input = new Scanner(System.in);

		// Get the year the user wants to query and store it in the "year" variable
		System.out.println("Enter the year:");
		int year = input.nextInt();

		// Get the gender the user wants to query and store it in the "gender"variable
		System.out.println("Enter the gender :");
		String gender = input.next();

		// Get the name the user wants to query and store it in the "name" variable
		System.out.println("Enter the name :");
		String name = input.next();

		// call the method to check the rank of the name in specific year
		int rank = findRank(girlNames, boyNames, name, gender, year);

		// call the method to display the result
		displayOutput(rank, year, name);

	}

	// read the data from the files and store it in to arrays
	static void readFile(String[][] girlNames, String[][] boyNames) {

		final String FILE_PATH = "src\\Project1\\NameRankingsData\\babynameranking";
		final String FILE_EXTENSION = ".txt";

		// loop through the files and store data in different array by gender
		for (int year = START_YEAR, i = 0; year <= END_YEAR && i < NUMBER_OF_YEARS; year++, i++) {
			File file = new File(FILE_PATH + year + FILE_EXTENSION);
			try (Scanner fileScanner = new Scanner(file)) {
				while (fileScanner.hasNextLine()) {
					String[] line = fileScanner.nextLine().split("\\s+");
					boyNames[i][Integer.parseInt(line[0]) - 1] = line[1];
					girlNames[i][Integer.parseInt(line[0]) - 1] = line[3];
				}

			} catch (IOException ioException) {
				ioException.printStackTrace();

			}

		}

	}

	// find the rank of the name in the specific year
	static int findRank(String[][] girlNames, String[][] boyNames, String name, String gender, int year) {

		// validating year
		if (year < START_YEAR || year > END_YEAR) {
			System.out.printf("Data unavailable for the year %d", year);
			System.exit(0);

		}

		// set the year
		int arrayIndex = year - START_YEAR;
		String[] nameArray = new String[NUMBER_OF_RANKS];

		// Select the array based on genders
		switch (gender) {
		case "M":
			nameArray = boyNames[arrayIndex];
			break;
		case "F":
			nameArray = girlNames[arrayIndex];
			break;
		default:
			System.out.printf("Unknown gender : %s \n", gender);
			System.exit(0);

		}

		// loop through the array to find the rank
		int rank = -1;
		for (int i = 0; i < nameArray.length; i++) {
			if (name.equalsIgnoreCase(nameArray[i])) {
				rank = i;
			}
		}
		return rank;

	}

	// method for printing the result
	static void displayOutput(int rank, int year, String name) {

		String outputString = "";

		if (rank < 0) {
			outputString = String.format("The name %s is not ranked in year %d", name, year);
		} else {
			outputString = String.format("%s is ranked  #%d in year %d", name, rank + 1, year);

		}
		System.out.println(outputString);
	}

}
