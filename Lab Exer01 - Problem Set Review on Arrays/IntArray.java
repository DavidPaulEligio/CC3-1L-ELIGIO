import java.util.Scanner;
public class IntArray {

	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		int num[] = new int[5];
        int i;
        
        // Input a value of num[]
        for (i = 0; i < num.length; i++) {
            
            System.out.print("Enter a number: ");
            num[i] = in.nextInt();
            
        }
        
        System.out.print("\n\n");
        ascOrder(num);
        System.out.print("\n");
        descOrder(num);

        System.out.print("\n\n");

	}

	public static void ascOrder(int[] num) {

		System.out.println("First To Last: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

	}

	public static void descOrder(int[] num){

		System.out.println("Last to  First: ");
		for (int i = num.length-1; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }

	}

}