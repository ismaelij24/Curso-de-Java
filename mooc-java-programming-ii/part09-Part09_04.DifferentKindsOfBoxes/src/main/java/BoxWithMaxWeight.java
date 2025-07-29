
import java.util.ArrayList;


public class BoxWithMaxWeight extends Box{

    private int capacity;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight(int capacity){
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    
    public int totalWeight(){
        int sum = 0;
        for(Item item: this.items){
            sum += item.getWeight();
        }
        return sum;
    }
    
    @Override
    public void add(Item item) {
        if(this.totalWeight() + item.getWeight() > capacity){
            return;
        } else {
            this.items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }
    
}
