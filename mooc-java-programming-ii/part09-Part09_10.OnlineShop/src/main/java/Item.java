
public class Item {
    private String name;
    private int quantity;
    private int unitPrice;
    
    public Item(String name, int qty, int unitPrice){
        this.name = name;
        this.quantity = qty;
        this.unitPrice = unitPrice;
    }
    
    public int price(){
        return this.quantity * this.unitPrice;
    }
    
    public void increaseQuantity(){
        this.quantity++;
    }
    
    public String toString(){
        return this.name + ": " + this.quantity;
    }
}
