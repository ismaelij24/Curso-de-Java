
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }
    
    public static List<Book> readBooks(String file){
        List<Book> books = new ArrayList<>();
        try{
            Files.lines(Paths.get(file))
                    .map(row -> row.split(","))
                    .filter(bookParts -> bookParts.length == 4)
                    .map(bookParts -> new Book(bookParts[0], Integer.parseInt(bookParts[1]), Integer.parseInt(bookParts[2]), bookParts[3]))
                    .forEach(book -> books.add(book));
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
        return books;
    }

}
