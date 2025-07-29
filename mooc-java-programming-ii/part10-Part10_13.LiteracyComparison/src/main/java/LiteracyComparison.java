
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        
        try {
            Files.lines(Paths.get("literacy.csv")).forEach(line -> lines.add(line));
            lines.stream().map(line -> )
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public static List<String> read(String file){
        
    }
}
