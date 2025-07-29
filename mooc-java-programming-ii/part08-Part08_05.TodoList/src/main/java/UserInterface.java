
import java.util.Scanner;


public class UserInterface {
    private TodoList todoList;
    private Scanner scan;
    
    public UserInterface(TodoList todoList, Scanner scan){
        this.todoList = todoList;
        this.scan = scan;
    }
    
    public void start(){
        
        while(true){
            System.out.print("Command: ");
            String command = scan.nextLine();
        
            if(command.equals("stop")){
                break;
            } else if(command.equals("add")){
                System.out.print("To add: ");
                String task = scan.nextLine();
                todoList.add(task);
            } else if(command.equals("list")){
                todoList.print();
            } else if(command.equals("remove")){
                System.out.print("Which one is removed? ");
                int removed = Integer.valueOf(scan.nextLine());
                todoList.remove(removed);
            } else {
                System.out.println("Unknown command");
            }
        }
        
        
    }
}
