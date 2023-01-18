package Week4;
import java.util.Scanner;

public class HighestScore {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Number of students to be evaluated?");
		int numOfStudents = input.nextInt();
		
		String studentName;
		String highestScoreStName = "";

		double studentScore;
		double highestScore =0;

		for(int i = 1; i <= numOfStudents ; i ++) {
			System.out.println("Enter the name of the student");
			studentName = input.next();
			System.out.println("Enter the score of the student");
			studentScore =  input.nextDouble();
			
			if (studentScore > highestScore){
				highestScore =  studentScore;
				highestScoreStName = studentName;
			}
			
		}	
		System.out.printf("Student with higest score id %s. \nThe score is %.2f \n",highestScoreStName,highestScore );

	}
	


	

}
