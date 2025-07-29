
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<Integer> numbers = new ArrayList<>();
        
        while(true){
            System.out.println("Input numbers, type \"end\" to stop.");
            String input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }
            numbers.add(Integer.valueOf(input));
        }
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String select = scanner.nextLine();
        
        if(select.equals("n")){
            double average = numbers.stream()
                .mapToDouble(s -> Double.valueOf(s))
                .filter(n -> n < 0)
                .average()
                .getAsDouble();
            System.out.println("Average of negative numbers: " + average);
        }
        
        if(select.equals("p")){
            double average = numbers.stream()
                .mapToDouble(s -> Double.valueOf(s))
                .filter(n -> n > 0)
                .average()
                .getAsDouble();
            System.out.println("Average of positive numbers: " + average);
        }
    }
}
