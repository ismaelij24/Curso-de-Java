
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeRegister gradeRegister = new GradeRegister();
        UserInterface ui = new UserInterface(scanner, gradeRegister);
        
        ui.start();
        
    }
}
