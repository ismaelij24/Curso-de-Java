
public class Statistics {
    private int count;
    private int sum;
    
    public Statistics() {
        this.count = 0;
    }
    
    public void addNumber(int number) {
        this.count ++;
        this.sum += number;
    }
    
    public int getCount() {
        return this.count;
    }
    
    public int sum() {
        return this.sum;
    }
    
    public double average() {
        if(count != 0){
            double average = (double) this.sum / this.count;
            return average;
        } else {
            return 0;
        }    
    }
}
