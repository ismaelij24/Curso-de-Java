
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            
            System.out.print("Name: ");
            String input_name = scanner.nextLine();
            
            if(!input_name.equals("")) {
                items.add(new Item(input_name));
            } else {
                break;
            }    
        }
        
        for(Item item: items) {
            System.out.println(item);
        }
    }
}
