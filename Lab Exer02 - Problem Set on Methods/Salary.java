import java.util.Scanner;

public class Salary {

	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("Hourly pay rate >> ");
		double hourlyPay = in.nextDouble();

		System.out.print("Regular hours >> ");
		int regHour = in.nextInt();

		System.out.print("Overtime hours >> ");
		int overtime = in.nextInt();

		System.out.println(
			"\nRegular pay: " + ((hourlyPay*regHour)) + 
			"\nTotal pay for Overtime: " + (overtime*1.5*hourlyPay) + 
			"\nOvertime pay: " + overtimePay(hourlyPay, regHour, overtime)
		);

	}

	public static double overtimePay(double hourlyRate, int regHour, int overtime) {

		return ((hourlyRate*regHour) + (overtime*1.5*hourlyRate));

	}

}