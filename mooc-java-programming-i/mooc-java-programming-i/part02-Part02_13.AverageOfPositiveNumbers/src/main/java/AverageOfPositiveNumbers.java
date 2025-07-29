
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int contTotal = 0;
        int contPos = 0;
        int sum = 0;
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if(number == 0 && contTotal == 0) {
                System.out.println("Cannot calculate the average");
                break;
            } else if (number == 0) {
                break;
            } else if (number < 0) {
                contTotal++;
                continue;
            } else {
                contTotal++;
                contPos++;
                sum += number;
            }
            
        }
        double averageOfPositives = sum / (double) contPos;
        System.out.println(averageOfPositives);
    }
}
