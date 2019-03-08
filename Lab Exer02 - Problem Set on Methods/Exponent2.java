import java.util.Scanner;
public class Exponent2 {

	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("Enter a number >> ");
		int num = in.nextInt();

		System.out.println("Squared: " + square(num));
		System.out.println("Cubed: " + cube(square(num)));

	}

	public static double square(int num) {

		double sq = Math.pow(num, 2);
		// System.out.println("Squared: " + sq);
		return sq;

	}

	public static double cube(double num) {

		double cubed = Math.pow(num, 3);
		return cubed;

	}

}