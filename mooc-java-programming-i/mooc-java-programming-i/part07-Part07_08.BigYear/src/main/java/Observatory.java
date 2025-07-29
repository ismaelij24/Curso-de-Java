
import java.util.ArrayList;
import java.util.Random;


public class Observatory {
    ArrayList<Bird> birds;
    
    public Observatory(){
        this.birds = new ArrayList<>(); 
    }
    
    public void addBird(String name, String nameInLatin){
        Bird bird = new Bird(name, nameInLatin);
        if(this.birds.contains(bird)){
            return;
        } else {
            this.birds.add(bird);
        }    
    }
    
    public boolean observation(String name){
        for(Bird bird: this.birds){
            if(bird.getName().equals(name)){
                bird.observation();
                return true;
            }
        }
        return false;
    }
    
    public void printAll(){
        for(Bird bird: this.birds){
            System.out.println(bird);
        }
    }
    
    public void printOne(String name){
        for(Bird bird: this.birds){
            if(bird.getName().equals(name)){
                System.out.println(bird);
            }
        }    
    }
}
