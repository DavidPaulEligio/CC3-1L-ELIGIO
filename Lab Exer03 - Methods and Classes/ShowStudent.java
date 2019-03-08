import java.util.Scanner;

public class ShowStudent {

	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		Student stud = new Student();

		System.out.print("Student ID >> ");
		int id = in.nextInt();
		stud.setIdNumber(id);

		System.out.print("Credit hours earned >> "); 
		int creditHours = in.nextInt();
		stud.setCreditHours(creditHours);

		System.out.print("Points earned >> ");
		int points = in.nextInt();
		stud.setPointsEarned(points);	

		System.out.println(
			"\nStudent ID: " + stud.getIdNumber() + 
			"\nCredit hours earned: " + stud.getCreditHours() + 
			"\nPoints: " + stud.getPointsEarned() +
			"\nGrade point Average: " + stud.gradePointAvg() + 
			"\nClassification: " + stud.classify()
		);

	}

}