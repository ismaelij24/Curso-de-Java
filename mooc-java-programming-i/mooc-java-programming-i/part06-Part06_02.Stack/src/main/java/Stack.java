import java.util.ArrayList;

public class Stack {
    ArrayList<String> stack;
    
    public Stack(){
        this.stack = new ArrayList<String>();
    }
    
    public boolean isEmpty(){
        return this.stack.isEmpty();
    }
    
    public void add(String value) {
        this.stack.add(value);
    }
    
    public ArrayList<String> values(){
        return this.stack;
    }
    
    public String take(){
        String lastValue = this.stack.get(this.stack.size() - 1);
        this.stack.remove(lastValue);
        return lastValue;
    }
    
}
