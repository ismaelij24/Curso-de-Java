
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.print("First name: ");
            String inputFirstName = scanner.nextLine();
            
            if(inputFirstName.equals("")) {
                break;
            }
            
            System.out.print("Last name: ");
            String inputLastName = scanner.nextLine();
            
            System.out.print("Identification number: ");
            String inputIDNumber = scanner.nextLine();
            
            infoCollection.add(new PersonalInformation(inputFirstName, inputLastName, inputIDNumber));
                
        }
        
        System.out.println(); 
        for(int i = 0; i < infoCollection.size(); i++) {
            System.out.println(infoCollection.get(i).getFirstName() + " " + infoCollection.get(i).getLastName());
        }
    }
}
