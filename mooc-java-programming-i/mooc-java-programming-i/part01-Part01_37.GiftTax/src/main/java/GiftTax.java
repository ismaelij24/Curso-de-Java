
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        int value = Integer.valueOf(scan.nextLine());
        
        double totalValue;
        
        if (value >= 5000 && value < 25000) {
            totalValue = (100 + (value - 5000) * 0.08);
            System.out.println("Tax: " + totalValue);
        } else if (value >= 25000 && value < 55000) {
            totalValue = (1700 + (value - 25000) * 0.10);
            System.out.println("Tax: " + totalValue);
        } else if (value >= 55000 && value < 200000) {
            totalValue = (4700 + (value - 55000) * 0.12);
            System.out.println("Tax: " + totalValue);
        } else if (value >= 200000 && value < 1000000) {
            totalValue = (22100 + (value - 200000) * 0.15);
            System.out.println("Tax: " + totalValue);
        } else if (value >= 1000000) {
            totalValue = (142100 + (value - 1000000) * 0.17);
            System.out.println("Tax: " + totalValue);
        } else {
            value = value;
            System.out.println("No Tax!");
        }
         
    }
}
