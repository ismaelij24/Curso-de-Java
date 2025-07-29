
import java.util.ArrayList;


public class Herd implements Movable{

    private ArrayList<Movable> herd;
    
    public Herd(){
        this.herd = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable){
        this.herd.add(movable);
    }
    
    @Override
    public void move(int dx, int dy) {
        for(Movable member: this.herd){
            member.move(dx, dy);
        }
    }
    
    public String toString(){
        String string = "";
        for(Movable member: this.herd){
            string += member.toString() + "\n";
        }
        
        return string;
    }
}
