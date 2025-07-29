import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items = new ArrayList<Item>();
    private int maxWeight;
    
    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
    }
    
    private int currentWeight(){
        int totalWeight = 0;
        for(Item item: this.items){
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }
    
    public void addItem(Item item){
        if(item.getWeight() + this.currentWeight() <= maxWeight){
            this.items.add(item);
        }
    }
    
    public String toString(){
        String message = "";
        
        if(this.items.isEmpty()){
            message = "no items (0kg)";
        } else if(this.items.size() == 1){
            message = "1 item " + "(" + this.currentWeight() + " kg)"; 
        } else {
            message = this.items.size() + " items (" + this.currentWeight() + " kg)";
        }
        return message;
    }
    
    public void printItems(){
        for(Item item: this.items){
            System.out.println(item);
        }
    }
    
    public int totalWeight(){
        return this.currentWeight();
    }
    
    public Item heaviestItem(){
        if(this.items.isEmpty()){
            return null;
        }
        
        Item heaviestItem = this.items.get(0);
        for(Item item: this.items){
            if(item.getWeight() > heaviestItem.getWeight()){
                heaviestItem = item;
            }
        }
        
        return heaviestItem;
    }
}
