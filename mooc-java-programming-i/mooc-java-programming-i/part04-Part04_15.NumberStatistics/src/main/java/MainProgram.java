
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Statistics sticsAll = new Statistics();
        Statistics sticsEven = new Statistics();
        Statistics sticsOdd = new Statistics();
        
        System.out.println("Enter numbers:");
        
        while(true) {
            int input_number = Integer.valueOf(scanner.nextLine());
            
            if(input_number == -1) {
                break;
            } else if(input_number % 2 == 0) {
                sticsEven.addNumber(input_number);
            } else {
                sticsOdd.addNumber(input_number);
            }
            
            sticsAll.addNumber(input_number);
        }
        
        System.out.println("Sum: " + sticsAll.sum());
        System.out.println("Sum of even numbers: " + sticsEven.sum());
        System.out.println("Sum of odd numbers: " + sticsOdd.sum());
    }
}
