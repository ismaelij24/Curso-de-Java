
import java.util.ArrayList;
import java.util.Scanner;


public class UserInterface {
    private Scanner scan;
    private GradeRegister register;
    
    public UserInterface(Scanner scan, GradeRegister grades){
        this.scan = scan;
        this.register = grades;
    }
    
    public void start(){
        readPoints();
        printAverages();
        printPercentages();
        printGradeDistribution();
    }
    
    public void readPoints(){
        while(true){
            System.out.println("Enter point totals, -1 stops:");
            int points = Integer.valueOf(this.scan.nextLine());
            
            if(points == -1){
                break;
            } 
            
            this.register.add(points);
        }
    }
    
    public void printAverages(){
        double average = this.register.getAverage();
        double averagePassing = this.register.getAveragePassing();
        
        System.out.println("Point average (all): " + average);
        if(averagePassing == 0.0){
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): "+ averagePassing);
        }
    }
    
    public void printPercentages(){
        System.out.println("Pass percentage: " + this.register.getPassPercentage());
    }
    
    public void printGradeDistribution(){
        System.out.println("Grade distribution:");
        int grade = 5;
        while(grade >= 0){
            int stars = this.register.numberOfGrades(grade);
            System.out.print(grade + ":  ");
            printStars(stars);
            System.out.println("");
            
            grade = grade - 1;
        }
    }
    
    public static void printStars(int stars){
        while(stars > 0){
            System.out.print("*");
            stars--;
        }
    }
}
