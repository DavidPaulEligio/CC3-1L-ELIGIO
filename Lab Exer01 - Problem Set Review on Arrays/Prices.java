import java.util.Scanner;
import java.math.RoundingMode;
import java.math.BigDecimal;

public class Prices {

    private static Scanner sc = new Scanner(System.in);
    
    private static BigDecimal bd;
    
    public static void main(String[] args) {
		
	double[] prices = new double[20];

	for (int i = 0;i < prices.length ;i++ ) {
//            prices[i] = (int) ((Math.random() * 1000) + 10) /20.0;
            System.out.print((i+1) + ") Enter Price => $");
            prices[i] = sc.nextDouble();
	}

//	for (int i = 0;i < prices.length ;i++ ) {
//            System.out.println("$" + prices[i]);
//	}

	System.out.println("\n\nTotal: " +  "$" + total(prices) + "\n");
	belowFive(prices);
	System.out.println("Average: " + "$" + average(prices) + "\n");
	aboveAverage(prices);


    }

    public static double total(double prices[]) {

        double sum = 0;

        for(double i:prices){
            sum += i;
        }
            
        bd = new BigDecimal(sum);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();


    }

    public static void belowFive(double prices[]) {

        System.out.println("Prices Below $5.00:");
	for (int i = 0;i < prices.length ;i++ ) {
            if(prices[i] < 5){
                System.out.println(" - $" + prices[i]);
            }
	}
        System.out.print("\n");

    }

    public static double average(double prices[]) {

        double avg = total(prices) / prices.length;
        bd = new BigDecimal(avg);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();

    }

    public static void aboveAverage(double prices[]) {

        System.out.println("Prices higher than average:");
        for (int i = 0;i < prices.length ;i++ ) {
            if(prices[i] > average(prices)){
                System.out.println(" - $" + prices[i]);
            }
        }

    }
}