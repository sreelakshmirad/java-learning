/* Project -2
* Group- 7
* Group Members:
* Haowen Shi (8882279)
* Navneet Kaur Sindhu Brar (8818367)
* Saumya Singh (8854619)
* Sreelakshmi Sreenarayanapurath Radhakrishnan (8788732)
*/

package presentationLayer;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import businessLayer.Staff;
import dataAccessLayer.DataAccess;

public class TestStaff {
	static List<Staff> allStaffs = new ArrayList<>();
	public static void main(String[] args) {
		
		//setting continueInput to true		
		boolean continueInput = true;
		
		//initializing scanner		
		Scanner input = new Scanner(System.in);
		
		do {
		try {
			//initializing the collection with all staffs.			
			allStaffs = DataAccess.getStaffs();
			
			//Prompting user to enter a character to choose the operation			
			System.out.println("\nHello, What would you like to do today? \n"
					+ "Enter corresponding alphabets to choose from the following options.\n"
					+ "A : Get a collection of all staffs\n" 
					+ "B : Find a staff by ID\n" 
					+ "C : Insert a new staff \n"
					+ "D : Update a staff \n"
					+ "E : Delete a staff \n");

			
			String selectedOptionString = input.next();
			
			//fetching the first letter from the entered string			
			char selectedOption = Character.toUpperCase(selectedOptionString.charAt(0));

			//switch case to determine which action to take			
			switch (selectedOption) {
			case 'A':
				getStaffs(input);
				break;
			case 'B':
				getStaffbyId(input);
				break;
			case 'C':
				insertStaff(input);
				break;
			case 'D':
				updateStaff(input);
				break;
			case 'E':
				deleteStaff(input);
				break;
			default:
				System.out.println("Invalid option \n");
			};
			
			//Prompting the user to enter a number 0 or 1 to decide if they want to continue or not			
			System.out.println("Would you like to repeat? Please enter \n1 : to repeat\n0 : to stop\n");
			
			//If the entered number is 0, then stop, otherwise continue			
			if (input.nextInt() == 0) {
				continueInput = false;
				System.out.println("Stopping... Bye");
				System.exit(0);
			}
				
		//handling SQL Exceptions		
		} catch (SQLException e) {
			System.out.println("Exception while interacting with database : " + e.getMessage());
		
		//handling illegal argument exception		
		} catch (IllegalArgumentException e) {
			System.out.println("Encountered exception : " + e.getMessage());
		
		//handling all other kinds of exceptions	
		} catch (Exception e) {
			System.out.println("Exception : " + e.getMessage());
		}
		}while (continueInput);

	}
	
	//method to get all the staff and display them	
	public static void getStaffs(Scanner input) throws SQLException{
		
		//fetching all the staffs		
		List<Staff> staffs = DataAccess.getStaffs();
		
		//display the total number of staffs		
		System.out.println("Total number of staffs: " + staffs.size() + "\n");
		
		//displaying the details of each staff		
		for (Staff staff : staffs) {
			System.out.println(staff+"\n");
		}
	}
	
	//method to display the	details of a staff with the given ID
	public static void getStaffbyId(Scanner input) throws SQLException{
		
		//prompting the user to enter staff ID		
		System.out.println("Enter the Staff ID");
		String staffId = input.next();
		
		//fetching the details of the staff from the given ID		
		Staff staff = DataAccess.getStaffbyId(staffId);
		
		//if there is no staff with the given ID		
		if (staff == null){
			System.out.println("No staff found with id "+ staffId);
			
		}else {
			//displaying staff details		
			System.out.println(staff+"\n");
			
		}
		
		
	}
	
	//method to delete the staff with the given ID	
	public static void deleteStaff(Scanner input) throws SQLException {
		
		//prompting the user to enter staff ID		
		System.out.println("Enter the Staff ID");
		String staffId = input.next();
		
		//deleting the staff		
		Staff staff = DataAccess.getStaffbyId(staffId);
		
		//deleting the staff from the database		
		DataAccess.deleteStaff(staffId);
		
		//removing the staff from the collection		
		allStaffs.remove(staff);
		
		//sorting the collection		
		Collections.sort(allStaffs);
		
		//displaying success message		
		System.out.println("Deleted successfully");
	
	}
	
	//method to update the staff	
	public static void updateStaff(Scanner input) throws SQLException,IllegalArgumentException{
		
		//prompting the user to enter the staff ID		
		System.out.println("Enter the Staff ID");
		String staffId = input.next();
			
		//finding the staff 		
		Staff staff = DataAccess.getStaffbyId(staffId);
		
		//displaying the details of the staff		
		System.out.println(staff+"\n");
		
		//getting the current index of staff in the collection		
//		int staffIndex = allStaffs.indexOf(staff);
		
		System.out.println("The fields available to update are:\n"
				+ "Address\n"
				+ "City \n"
				+ "State \n"
				+ "Telephone \n"
				+ "E mail \n"
				+ "Enter the new value for each and press enter, If you do not wish to update, enter 0  and press enter");
		
		//prompting the user to enter address and updating the staff object	
		System.out.println("Enter the address : ");
		String address = input.next();
		staff.setAddress(address);
		
		//prompting the user to enter city and updating the staff object	
		System.out.println("Enter the city : ");
		String city = input.next();
		staff.setCity(city);
		
		//prompting the user to enter state and updating the staff object	
		System.out.println("Enter the state : ");
		String state = input.next();
		staff.setState(state);
		
		//prompting the user to enter telephone and updating the staff object	
		System.out.println("Enter the telephone");
		String telephone = input.next();
		staff.setTelephone(telephone);
		
		////prompting the user to enter email and updating the staff object		
		System.out.println("Enter the email");
		String email = input.next();
		staff.setEmail(email);
		
		//updating the database		
		DataAccess.updateStaff(staff);
		
		//displaying the updated staff		
		System.out.println("The updated staff is" + staff);
		
		//updating the staff collection		
//		allStaffs.set(staffIndex, staff);
	
	}
	
	//method to insert a new staff
	public static void insertStaff (Scanner input) throws SQLException {
		
		//prompting user to enter staff ID		
		System.out.println("Enter the Staff ID");
		String staffId = input.next();
		
		//prompting user to enter first name		
		System.out.println("Enter first name");
		String firstName = input.next();
		
		//prompting user to enter last name		
		System.out.println("Enter last name");
		String lastName = input.next();
		
		//prompting user to enter date of birth		
		System.out.println("Enter date of birth in the format yyyy-mm-dd");
		String dateOfBirthStr = input.next();
		
		//parsing LocalDate from the string		
		LocalDate  dateOfBirth  = LocalDate.parse(dateOfBirthStr);
		
		//prompting user to enter the address		
		System.out.println("Enter the address");
		String address = input.next();
		
		//prompting user to enter the city	
		System.out.println("Enter the city");
		String city = input.next();
		
		//prompting user to enter the state	
		System.out.println("Enter the state");
		String state = input.next();
		
		//prompting user to enter the telephone	
		System.out.println("Enter the telephone");
		String telephone = input.next();
		
		//prompting user to enter the email
		System.out.println("Enter the email");
		String email = input.next();
		
		//creating a new staff with the entered details		
		Staff newStaff = new Staff(staffId,firstName,lastName,dateOfBirth,address, city,state,telephone,email);

		//check if any staff exists with the same name and date of birth		
		if(!staffExists(newStaff)) {
			
			//insrting staff to the database			
			DataAccess.Insertstaff(newStaff);
			
			//adding staff to the collection			
			allStaffs.add(newStaff);
			
			//sorting the collection			
			Collections.sort(allStaffs);
			
			//displaying the newly created staff and success messages			
			System.out.println("\n"+newStaff);
			System.out.println("Created a new staff successfully");
		}else {
			
			//throws exception if staff with same name and date of birth exists			
			throw new IllegalArgumentException("Staff with same name and date of birth exists");
		}
	}
	
	//method to find if staff with same name and date of birth exists	
	public static boolean staffExists(Staff newStaff) {
		
		//looping through all staffs		
		for (Staff staff : allStaffs) {
			
			//checks if first name, last name and date of birth are the same			
			if (staff.getFirstName().equals(newStaff.getFirstName()) && staff.getLastName().equals(newStaff.getLastName()) && staff.getDateOfBirth().equals(newStaff.getDateOfBirth()) ){
				return true;
			}
		}
		return false;
	}
	
}
