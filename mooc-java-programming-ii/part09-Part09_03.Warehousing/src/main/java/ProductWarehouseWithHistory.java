
public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory historyListObj = new ChangeHistory();
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.historyListObj.add(initialBalance);
    } 
    
    public String history(){
        return this.historyListObj.toString();
    }
    
    public void printAnalysis(){
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + this.historyListObj.toString());
        System.out.println("Largest amount of product: " + this.historyListObj.maxValue());
        System.out.println("Smallest amount of product: " + this.historyListObj.minValue());
        System.out.println("Average: " + this.historyListObj.average());
    }
    
    @Override
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        this.historyListObj.add(this.getBalance());    
    }
    
    @Override
    public double takeFromWarehouse(double amount){
        double amountTaken = super.takeFromWarehouse(amount);
        this.historyListObj.add(this.getBalance());
        return amountTaken;
    }
    
}
