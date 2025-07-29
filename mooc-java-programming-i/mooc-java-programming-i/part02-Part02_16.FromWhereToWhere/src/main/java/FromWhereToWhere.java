
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.print("Where to? ");
        int endPoint = Integer.valueOf(scanner.nextLine());
        System.out.print("Where from? ");
        int startingPoint = Integer.valueOf(scanner.nextLine());
        
        for(int i = startingPoint; i <= endPoint; i++) {
            System.out.println(i);
        }
                
    }
}
