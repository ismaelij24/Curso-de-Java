
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Warehouse {
    private Map<String, Integer> productsPrices;
    private Map<String, Integer> productsStocks;
    
    public Warehouse(){
        this.productsPrices = new HashMap<>();
        this.productsStocks = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock){
        this.productsPrices.put(product, price);
        this.productsStocks.put(product, stock);
    }
    
    public int price(String product){
        return this.productsPrices.getOrDefault(product, -99);
    }
    
    public int stock(String product){
        return this.productsStocks.getOrDefault(product, 0);
    }
    
    public boolean take(String product){
        if(this.productsStocks.keySet().contains(product)){
            int currentStock = this.productsStocks.get(product);
            if(currentStock > 0){
                this.productsStocks.put(product, currentStock - 1);
                return true;
            }
            return false;
        }
        return false;
    }
    
    public Set<String> products(){
        return this.productsPrices.keySet();
    }
}
