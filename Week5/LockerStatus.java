
//Assignment 2 -  Sreelakshmi Sreenaryanapurath Radhakrishnan  - 8788732
package Week5;

public class LockerStatus {
	// Declaring constants number of students and lockers
	final static int NUMBER_OF_STUDENTS = 100;
	final static int NUMBER_OF_LOCKERS = 100;

	public static void main(String[] args) {

		// Declaring boolean array to hold the status of lockers
		boolean[] lockers = new boolean[NUMBER_OF_LOCKERS];

		//Processing each locker upon the entry of each student 		
		lockers = processLockers(lockers);
		
		//display the open lockers		
		displayOpenLockers(lockers);

	}

	public static boolean[] processLockers(boolean[] lockers) {
		for (int i = 1; i <= NUMBER_OF_STUDENTS; i++) {

			for (int j = i; j <= NUMBER_OF_LOCKERS; j++) {

				if (j % i == 0) {
					lockers[j - 1] = Toggle(lockers[j - 1]);

				}
			}

		}
		return lockers;

	}

	public static boolean Toggle(boolean isOpen) {
		/* Toggling the status of locker
		 * If open - to Closed 
		 * If Closed -  to Open
		 */
		
		return !isOpen;
	}

	public static void displayOpenLockers(boolean[] lockers) {
		//Looping over all the lockers		
		for (int i = 0; i < lockers.length; i++) {
			
			//Printing only open lockers			
			if (lockers[i]) {
				System.out.printf("Locker %d is open \n", i + 1);

			}
		}
	}

}
