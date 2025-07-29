
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here
    
    public void addMeal(String meal) {
        int b = 0;
        for(String dish: this.meals) {
            if(dish.equals(meal)){
                b = 1;
            }
        }
        
        if(b == 0){
            this.meals.add(meal);
        }
    }
    
    public void printMeals(){
        for(String meal: this.meals){
            System.out.println(meal);
        }
    }
    
    public void clearMenu(){
        this.meals.clear();
    }
}
