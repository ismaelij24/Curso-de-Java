
import java.util.ArrayList;


public class TodoList {
    private ArrayList<String> tasks;
    
    public TodoList(){
        this.tasks = new ArrayList<>();
    }
    
    public void add(String task){
        this.tasks.add(task);
    }
    
    public void print(){
        int index = 1;
        for(String t: tasks){
            System.out.println(index + ": " + t);
            index++;
        }
    }
    
    public void remove(int number){
        this.tasks.remove(number - 1);
    }
}
