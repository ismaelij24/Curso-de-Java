
import java.util.ArrayList;
import java.util.HashMap;


public class StorageFacility {
    private HashMap<String, ArrayList<String>> units;
    
    public StorageFacility(){
        this.units = new HashMap<>();
    }
    
    public void add(String unit, String item){
        this.units.putIfAbsent(unit, new ArrayList<>());
        
        this.units.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit){
        ArrayList<String> list = new ArrayList<>();
        return this.units.getOrDefault(storageUnit, list);
    }
    
    public void remove(String storageUnit, String item){
        this.units.get(storageUnit).remove(item);
        
        if(this.units.get(storageUnit).isEmpty()){
            this.units.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> unitsKeys = new ArrayList<>();
        
        for(String unit: this.units.keySet()){
            if(!this.units.get(unit).isEmpty()){
                unitsKeys.add(unit);
            }
        }
        
        return unitsKeys;
    }
}
