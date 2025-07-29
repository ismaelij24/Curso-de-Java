
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // implement here a program that reads user input
        while(true) {
            int number = Integer.valueOf(scanner.nextLine());
            if(number == 9999) {
                break;
            }
            list.add(number);
        }
        
        int smallest = list.get(0);
        int index = 0;
        
        for (int i = 1; i < list.size(); i++) {
            if(list.get(i) < smallest) {
                smallest = list.get(i);
                index = i;
            }
        }
        
        System.out.println("Smallest number: " + smallest);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == smallest) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}
