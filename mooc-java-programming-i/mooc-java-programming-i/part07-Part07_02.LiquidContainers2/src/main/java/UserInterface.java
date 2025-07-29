
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class UserInterface {
    private ArrayList<Container> containers = new ArrayList<>(Arrays.asList(new Container(), new Container()));
    private Scanner scanner;
    private Container containerOne = this.containers.get(0);
    private Container containerTwo = this.containers.get(1);
    
    public UserInterface(Scanner scan){
        this.containers = containers;
        this.scanner = scan;
    }
    
    public void start(){
        while(true){
            System.out.println("First: " +  this.containerOne);
            System.out.println("Second: " + this.containerTwo);
            
            String input = this.scanner.nextLine();
            if(input.equalsIgnoreCase("quit")){
                break;
            }
            
            final String[] parts = input.split(" ");
            final String command = parts[0];
            final int amount = Integer.parseInt(parts[1]);
            
            if(amount < 1){
                continue;
            }
            
            if (command.equalsIgnoreCase("add")) {
                this.containerOne.add(amount);
            }

            if (command.equalsIgnoreCase("move")) {
                if (amount > this.containerOne.contains()) {
                    this.containerTwo.add(this.containerOne.contains());
                } else {
                    this.containerTwo.add(amount);
                    this.containerOne.remove(amount);
                }
            }

            if (command.equalsIgnoreCase("remove")) {
                this.containerTwo.remove(amount);
            }
        }
    }
}
