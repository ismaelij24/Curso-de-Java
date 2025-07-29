
import java.util.ArrayList;


public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases = new ArrayList<>();
    
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if(suitcase.totalWeight() + this.totalWeight() <= this.maxWeight){
            this.suitcases.add(suitcase);
        }    
    }
    
    private int currentWeight(){
        int totalWeight = 0;
        for(Suitcase suitcase: this.suitcases){
            totalWeight += suitcase.totalWeight();
        }
        
        return totalWeight;
    }
    
    public int totalWeight(){
        return this.currentWeight();
    }
    
    public String toString(){
        return this.suitcases.size() + " suitcases " + "(" + this.totalWeight()  + " kg)";
    }
    
    public void printItems(){
        for(Suitcase suitcase: this.suitcases){
            suitcase.printItems();
        }
    }
    
        
}
