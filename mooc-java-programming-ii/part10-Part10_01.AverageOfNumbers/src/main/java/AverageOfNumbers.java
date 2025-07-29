
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        ArrayList<Integer> numbers = new ArrayList<>();
        
        while(true){
            System.out.println("Input numbers, type \"end\" to stop.");
            String input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }
            numbers.add(Integer.valueOf(input));
        }
        
        double average = numbers.stream()
                .mapToDouble(s -> Double.valueOf(s))
                .average()
                .getAsDouble();
        
        System.out.println("Average of the numbers: " + average);
    }
}
