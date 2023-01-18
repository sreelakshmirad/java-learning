/* Project -2
* Group- 7
* Group Members:
* Haowen Shi (8882279)
* Navneet Kaur Sindhu Brar (8818367)
* Saumya Singh (8854619)
* Sreelakshmi Sreenarayanapurath Radhakrishnan (8788732)
*/
package businessLayer;

import java.time.*;

//Class Staff
public class Staff implements Comparable<Staff> {
	private  String id;
	private String lastName;
	private String firstName;
	private LocalDate dateOfBirth;
	private String address;
	private String city;
	private String state;
	private String telephone;
	private String email;
	
	//no-arg constructor	
	public Staff() {
		
	}
	
	//constructor that accepts id, lastName, firstName, dateofBirth, address, city, state, telephone and email	
	public Staff(String id, String lastName,String firstName,LocalDate dateOfBirth,String address, String city,String state,String telephone,String email) {
		setId(id);
		setLastName(lastName);
		setFirstName(firstName);
		setDateofBirth(dateOfBirth);
		setAddress(address);
		setCity(city);
		setState(state);
		setTelephone(telephone);
		setEmail(email);
	}
	
	//method to retrieve id	
	public String getId() {
		return id;
	}
	
	//method to retrieve lastName
	public String getLastName() {
		return lastName;
	}
	
	//method to retrieve firstName
	public String getFirstName() {
		return firstName;
	}
	
	//method to retrieve dateofBirth
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	
	//method to retrieve address
	public String getAddress() {
		return address;
	}
	
	//method to retrieve city
	public String getCity() {
		return city;
	}	
	
	//method to retrieve state
	public String getState() {
		return state;
	}
	
	//method to retrieve telephone
	public String getTelephone() {
		return telephone;
	}
	
	//method to retrieve email
	public String getEmail() {
		return email;
	}
	
	//method to find the age
	public int getAge() {
		LocalDate now = LocalDate.now();
		Period period = Period.between(this.dateOfBirth, now);  
		return period.getYears();
	}
	
	//method to set Id
	public void setId ( String id) throws IllegalArgumentException{
		if (id == "") {
			throw new IllegalArgumentException("Invalid staff ID");
			
		} else {
			this.id = id;
			
		}
	}
	
	//method to set lastName	
	public void setLastName(String lastName) throws IllegalArgumentException {
		if(lastName == "") {
			throw new IllegalArgumentException("Invalid Lastname");
		}else {
			this.lastName = lastName;
		}
	}
	
	//method to set firstName	
	public void setFirstName(String firstName)  throws IllegalArgumentException{
		if(firstName == "") {
			throw new IllegalArgumentException("Invalid Firstname");
		}else {
			this.firstName = firstName;
		}
	}
	
	//method to set dateOfBirth	
	public void setDateofBirth(LocalDate dateOfBirth)throws IllegalArgumentException {
		if(dateOfBirth == null) {
			throw new IllegalArgumentException("Invalid Date of Birth");
		}else {
			this.dateOfBirth = dateOfBirth;
		}
	}
	
	//method to set address	
	public void setAddress(String address)throws IllegalArgumentException  {
		if(address == "") {
			throw new IllegalArgumentException("Invalid address");
		}else if(address != "0"){
			this.address = address;
		}
	}
	
	//method to set city	
	public void setCity(String city)throws IllegalArgumentException  {
		if(city == "") {
			throw new IllegalArgumentException("Invalid city");
		}else if (city != "0") {
			this.city = city;
		}
	}
	
	//method to set state	
	public void setState(String state)throws IllegalArgumentException  {
		if(state == "") {
			throw new IllegalArgumentException("Invalid state");
		}else if(state.length() > 2) {
			throw new IllegalArgumentException("State cannot have more than 2 characters");	
		}else if (state != "0"){
			this.state = state;
		}
	}
	
	//method to set telephone	
	public void setTelephone(String telephone)throws IllegalArgumentException  {
		if(telephone == "") {
			throw new IllegalArgumentException("Invalid telephone !");
		//validating phone number			
		}else if(!telephone.matches("[0-9]+")) {
			throw new IllegalArgumentException("Telephone can have only numbers!");
		}else if (telephone != "0") {
			this.telephone = telephone;
		}
	}
	
	//method to set email	
	public void setEmail(String email) throws IllegalArgumentException  {
		if(email == "") {
			throw new IllegalArgumentException("Invalid email !");
		}
		//validating email		
		else if(!email.matches("^[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,6}$")) {
			throw new IllegalArgumentException("Invalid email !");	
		}
		else if(email != "0") {
			this.email = email;
		}
	}
	
	//method to compare one staff another based on their age	
	public int compareTo(Staff s) {
		return (int)(this.getAge() - s.getAge());
	}
	
	//method to print staff in a formatted way	
	public String toString() {
		return "Staff ID: " + this.id + 
				"\nFirstname : " + this.firstName + 
				"\nLastname : " + this.lastName + 
				"\nDate of Birth : "+ this.dateOfBirth + 
				"\nAge : "+ this.getAge() + 
				"\nAddress : " + this.address+
				"\nCity :" + this.city +
				"\nState : " + this.state+
				"\nTelephone : " + this.telephone+
				"\nEmail : "+ this.email;
	}
}
