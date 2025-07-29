
import java.util.Scanner;


public class UI {
    private Scanner scan;
    private Observatory observatory;
    
    public UI(Scanner scan, Observatory observatory){
        this.scan = scan;
        this.observatory = observatory;
    }
    
    public void start(){
        while(true){
            System.out.print("? ");
            String command = this.scan.nextLine();
            
            if(command.toLowerCase().equals("quit")){
                break;
            } else if(command.toLowerCase().equals("add")){
                System.out.print("Name: ");
                String name = this.scan.nextLine();
                System.out.print("Name in Latin: ");
                String nameInLatin = this.scan.nextLine();
                
                this.observatory.addBird(name, nameInLatin);
            } else if(command.toLowerCase().equals("observation")){
                System.out.print("Bird? ");
                String name = this.scan.nextLine();
                
                this.observatory.observation(name);
            } else if(command.toLowerCase().equals("all")){
                this.observatory.printAll();
            } else if(command.toLowerCase().equals("one")){
                System.out.println("Bird? ");
                String name = this.scan.nextLine();
                this.observatory.printOne(name);
            }
        }
    }
}
