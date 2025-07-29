
import java.util.ArrayList;


public class ChangeHistory {
    private ArrayList<Double> history;
    
    public ChangeHistory(){
        this.history = new ArrayList<>();
    }
    
    public void add(double status){
        this.history.add(status);
    }
    
    public void clear(){
        this.history.clear();
    }
    
    public double maxValue(){
        if(this.history.isEmpty()){
            return 0;
        } else {
            double maxValue = 0.0;
            for(double value: this.history){
                if(value > maxValue){
                    maxValue = value;
                }
            }
            return maxValue;
        }
    }
    
    public double minValue(){
        if(this.history.isEmpty()){
            return 0;
        } else {
            double minValue = this.history.get(0);
            for(double value: this.history){
                if(value < minValue){
                    minValue = value;
                }
            }
            return minValue;
        }
    }
    
    public double average(){
        if(this.history.isEmpty()){
            return 0;
        } else {
            double sum = 0.0;
            for(double value: this.history){
                sum += value;
            }
            double average = sum / this.history.size();
            return average;
        }    
    }
    
    public String toString(){
        return this.history.toString();
    }
}
