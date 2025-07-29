
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> inputs = new ArrayList<>();
        
        while(true){
            int input = Integer.parseInt(scanner.nextLine());
            if(input < 0){
                break;
            }
            
            inputs.add(input);
        }
        
        System.out.println("");
        inputs.stream()
                .filter(value -> value > 0 && value < 6)
                .forEach(value -> System.out.println(value));
        
        
    }
}
