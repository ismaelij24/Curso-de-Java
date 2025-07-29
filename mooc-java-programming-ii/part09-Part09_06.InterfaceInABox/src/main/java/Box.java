
import java.util.ArrayList;


public class Box implements Packable{
    private double maxCapacity;
    private ArrayList<Packable> items = new ArrayList<>(); 
    
    public Box(double maxCapacity){
        this.maxCapacity = maxCapacity;
    }

    public void add(Packable item){
        if(this.weight() + item.weight() <= this.maxCapacity){
            this.items.add(item);
        }
    }
    
    @Override
    public double weight() {
        double weight = 0;
        for(Packable item: this.items){
            weight += item.weight();
        }
        return weight;
    }
    
    @Override
    public String toString(){
        return "Box: " + this.items.size() + " items, total weight " + this.weight() + " kg";
    }
}
