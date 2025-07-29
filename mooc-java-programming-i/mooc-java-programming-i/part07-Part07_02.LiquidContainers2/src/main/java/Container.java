
public class Container {
    private int amountOfLiquid;
    
    public Container(){
        this.amountOfLiquid = 0;
    }
    
    public int contains(){
        return this.amountOfLiquid;
    }
    
    public void add(int amount) {
        if(amount > 0){
            if(amount + this.amountOfLiquid <= 100){
                this.amountOfLiquid += amount;
            } else {
                this.amountOfLiquid = 100;
            }            
        }
    }
    
    public void remove(int amount){
        if(amount > 0){
            if(this.amountOfLiquid - amount >= 0){
                this.amountOfLiquid -= amount;
            } else {
                this.amountOfLiquid = 0;
            }
        }
    }
    
    @Override
    public String toString(){
        return this.amountOfLiquid + "/100";
    }
}
