
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString(){
        String printOutput = "";
        if(elements.isEmpty()){
            printOutput = "The collection " + this.name + " is empty.";    
        } else if(this.elements.size() == 1){
            printOutput = "The collection " + this.name + " has " + this.elements.size() + " element:\n" 
                    + this.elements.get(0);
        } else {
            String totalElements = "";
            for(String element: this.elements){
                totalElements = totalElements + element + "\n";
            }
            printOutput = "The collection " + this.name + " has " + this.elements.size() + " elements:" 
                    + "\n" + totalElements;
        }
        
        return printOutput;
    
    }
    
}
