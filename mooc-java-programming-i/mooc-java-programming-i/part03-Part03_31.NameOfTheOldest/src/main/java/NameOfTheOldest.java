
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int ageOfTheOldest = 0;
        String nameOfTheOldest = "";
        
        while(true) {
            String input = scanner.nextLine();
            if(input.equals("")) {
                break;
            }
            
            String[] pieces = input.split(",");
            
            if(Integer.valueOf(pieces[1]) > ageOfTheOldest) {
                ageOfTheOldest = Integer.valueOf(pieces[1]);
                nameOfTheOldest = pieces[0];
            }
        }
        System.out.println("Name of the oldest: " + nameOfTheOldest);

    }
}
