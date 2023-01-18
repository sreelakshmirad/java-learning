package Week2;

public class NumbertoMonthConverter {

	public static void main(String[] args) {
		int random = (int) (1 + Math.random() * 12);
		
		System.out.println(random);
		String month = " ";
		
		switch(random) {
			case 1 :
				month = "January";
				break;
			case 2 :
				month = "February";
				break;
			case 3 :
				month = "March";
				break;
			case 4 :
				month = "April";
				break;
			case 5 :
				month = "May";
				break;
			case 6 :
				month = "June";
				break;
			case 7 :
				month = "July";
				break;
			case 8 :
				month = "August";
				break;
			case 9 :
				month = "September";
				break;
			case 10 :
				month = "october";
				break;
			case 11 :
				month = "November";
				break;
			case 12 :
				month = "December";
				break;
			default:
				month = "Invalid month";	
			
		}
		System.out.println(month);



	}

}
