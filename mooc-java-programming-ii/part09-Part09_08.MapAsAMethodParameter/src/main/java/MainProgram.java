
import java.util.HashMap;
import java.util.Map;



public class MainProgram {

    public static void main(String[] args) {
        // test your method here
        Map<String, String> map = new HashMap<>();
        returnSize(map);
    }

    // Implement here a method returnSize, which takes a Map-object as a parameter 
    // and returns the size of the map object
    public static int returnSize(Map<String, String> map){
        return map.size();
    }
}
