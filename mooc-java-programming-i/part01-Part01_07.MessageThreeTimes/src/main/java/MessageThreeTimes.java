
import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        // Write your program here
        String user_input = scanner.nextLine();
        System.out.println(user_input);
        System.out.println(user_input);
        System.out.println(user_input);

    }
}
