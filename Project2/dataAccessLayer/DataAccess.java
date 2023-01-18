/* Project -2
* Group- 7
* Group Members:
* Haowen Shi (8882279)
* Navneet Kaur Sindhu Brar (8818367)
* Saumya Singh (8854619)
* Sreelakshmi Sreenarayanapurath Radhakrishnan (8788732)
*/
package dataAccessLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import java.time.*;


import businessLayer.Staff;

public class DataAccess {
	
	//declaring constants for creating connection	
	private static final String CONN_URL = "jdbc:mysql://localhost:3306/staff_db?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC";
	private static final String	USER = "root";
	private static final String	PASSWORD = "root";


	//establishing connection with mysql database	
	private static Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(
				CONN_URL,
				USER, PASSWORD);
		return conn;
	}	
	
	//method to retrieve all the staffs 	
	public static List<Staff> getStaffs() throws SQLException {
		
		//establishing connection		
		Statement stmt = getConnection().createStatement();
		
		//SQL statement		
		String strSelect = "SELECT * FROM Staff";

		ResultSet rset = stmt.executeQuery(strSelect);
		List<Staff> staffs = new ArrayList<>();
		
		//looping through the result set 		
		while (rset.next()) {
			String id = rset.getString("id");
			String lastName = rset.getString("lastName");
			String firstName =rset.getString("firstName");
			String dateofBirthStr = rset.getString("dateofBirth");
			dateofBirthStr = dateofBirthStr.substring(0,dateofBirthStr.indexOf(" "));
			LocalDate  dateOfBirth  = LocalDate.parse(dateofBirthStr);
			String address = rset.getString("address");
			String city = rset.getString("city");
			String state = rset.getString("state");
			String telephone = rset.getString("telephone");
			String email = rset.getString("email");
			Staff staff = new Staff(id, lastName, firstName, dateOfBirth, address,city,state,telephone,email);
			staffs.add(staff);
		}
		
		//sorting the collection		
		Collections.sort(staffs);
		
		//returning sorted collection of staffs		
		return staffs;
	}
	
	//method to retrieve a staff by staff ID	
	public static Staff getStaffbyId(String staffId) throws SQLException {
		//establishing connection		
		Statement stmt = getConnection().createStatement();
		
		//SQL statement		
		String strSelect = "SELECT * FROM Staff WHERE id="+staffId;

		ResultSet rset = stmt.executeQuery(strSelect);
		Staff staff = null;

		//looping through the result set		
		while (rset.next()) {
			String id = rset.getString("id");
			String lastName = rset.getString("lastName");
			String firstName =rset.getString("firstName");
			String dateofBirthStr = rset.getString("dateofBirth");
			dateofBirthStr = dateofBirthStr.substring(0,dateofBirthStr.indexOf(" "));
			LocalDate  dateOfBirth  = LocalDate.parse(dateofBirthStr);
			String address = rset.getString("address");
			String city = rset.getString("city");
			String state = rset.getString("state");
			String telephone = rset.getString("telephone");
			String email = rset.getString("email");
			staff = new Staff(id, lastName, firstName, dateOfBirth, address,city,state,telephone,email);
		}
		
		//returning the staff with the given ID		
		return staff;
	}
	
	//method to update staff with the given ID	
	public static void updateStaff(Staff staff) throws SQLException {
		
		//establishing connection		
		Statement stmt = getConnection().createStatement();
		
		//SQL statement for updating		
		String updateQuery = "UPDATE Staff SET "
				+" address='"+staff.getAddress()+"'"
				+", city='"+staff.getCity()+"'"
				+", state='"+staff.getState()+"'"
				+", telephone='"+staff.getTelephone()+"'"
				+", email='"+staff.getEmail()+"'"
				+" WHERE id="+staff.getId();

		stmt.executeUpdate(updateQuery);
	}
	
	//method to delete staff with given ID	
	public static void deleteStaff(String staffId) throws SQLException{
		
		//establishing connection		
		Statement stmt = getConnection().createStatement();
		
		//SQL statement for delete		
		String deleteQuery = "DELETE FROM Staff"
							+ " WHERE id="+staffId;
		stmt.executeUpdate(deleteQuery); 
		
	}
	public static void Insertstaff(Staff staff) throws SQLException{
		
		//establishing connection		
		Statement stmt =  getConnection().createStatement();
		
		//SQL query for insertion		
		String insertQuery = " INSERT INTO Staff VALUES"
							+ "("+ staff.getId()
							+ ", '"+staff.getLastName()+"'"
							+ ", '"+staff.getFirstName()+"'"
							+ ", '"+staff.getDateOfBirth()+"'"
							+ ", '"+staff.getAddress()+"'"
							+ ", '"+staff.getCity()+"'"
							+ ", '"+staff.getState()+"'"
							+ ", '"+staff.getTelephone()+"'"
							+ ", '"+staff.getEmail()+"'"
							+")";
		stmt.executeUpdate(insertQuery); 		
	}
}
