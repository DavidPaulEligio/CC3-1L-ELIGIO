import java.util.Scanner;
public class Exponent {

	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("Enter a number >> ");
		int num = in.nextInt();

		square(num);
		cube(num);

	}

	public static void square(int num) {

		double sq = Math.pow(num, 2);
		System.out.println("Squared: " + sq);

	}

	public static void cube(int num) {

		double cb = Math.pow(num, 3);
		System.out.println("Cube: " + cb);

	}

}