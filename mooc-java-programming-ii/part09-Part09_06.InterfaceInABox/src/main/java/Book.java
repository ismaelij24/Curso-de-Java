
public class Book implements Packable{
    private String autor;
    private String bookName;
    private double weight;
    
    public Book(String autor, String bookName,double weight){
        this.autor = autor;
        this.bookName = bookName;
        this.weight = weight;
    }
    
    @Override
    public double weight() {
        return this.weight;
    }
    
    @Override
    public String toString(){
        return this.autor + ": " + this.bookName;
    }
}
