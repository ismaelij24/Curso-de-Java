
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double averageBirthYears = 0.0;
        int ageCount = 0;
        int ageAcu = 0;
        String longestName = "";
        
        while(true) {
            String input = scanner.nextLine();
            if(input.equals("")) {
                break;
            }
            
            String[] pieces = input.split(",");
            
            int nameLength = pieces[0].length();
            if(nameLength > longestName.length()) {
                longestName = pieces[0];
            }
            
            ageAcu += Integer.valueOf(pieces[1]);
            ageCount++;
        }
        
        averageBirthYears = (double) ageAcu / ageCount; 
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + averageBirthYears);
    }
}
