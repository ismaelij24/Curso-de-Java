
import java.util.Objects;


public class Bird {
    private String name;
    private String nameInLatin;
    private int observations;
    
    public Bird(String name, String nameInLatin){
        this.name = name;
        this.nameInLatin = nameInLatin;
        this.observations = 0;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getNameInLatin(){
        return this.nameInLatin;
    }
    
    public int getObservations(){
        return this.observations;
    }
    
    public void observation(){
        this.observations++;
    }
    
    @Override
    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }
       
        if(!(compared instanceof Bird)){
            return false;
        }
       
        Bird comparedBird = (Bird) compared;
        if(this.name.equals(comparedBird.name) &&
           this.nameInLatin.equals(comparedBird.nameInLatin)){
            return true;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(name, nameInLatin);
    }
    
    @Override
    public String toString(){
        return this.name + "(" + this.nameInLatin + "): " + this.observations + "observations"; 
    }
}
