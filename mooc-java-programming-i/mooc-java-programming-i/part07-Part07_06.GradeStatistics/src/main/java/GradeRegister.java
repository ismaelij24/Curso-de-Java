
import java.util.ArrayList;


public class GradeRegister {
    private ArrayList<Integer> points;
    private ArrayList<Integer> passingGrades;
    private ArrayList<Integer> grades;
    
    public GradeRegister(){
        this.points = new ArrayList<>();
        this.passingGrades = new ArrayList<>();
        this.grades = new ArrayList<>();
    }
    
    public void add(int points){
        if(points >= 0 && points <= 100){
            this.points.add(points);
            
            if(points >= 50){
                this.passingGrades.add(points);
            }
            
            this.grades.add(this.pointsToGrades(points));
        }
    }
    
    public double getAverage(){
        if(this.points.isEmpty()){
            return 0.0;
        }
        
        int sum = 0;
        for(int e: this.points){
            sum += e;
        }
        return (double) sum / this.points.size();
    }
    
    public double getAveragePassing(){
        int passingSum = 0;
        int passingCount= 0;
        
        for(int e: this.points){
            if(e >= 50){
                passingSum += e;
                passingCount++;
            }
        }
        if(passingCount == 0.0){
            return 0.0;
        }
        return (double) passingSum / passingCount;
    }
    
    public double getPassPercentage(){
        double pass = this.passingGrades.size();
        double participants = this.points.size();
        
        return 100 * pass / participants;
    }
    
    public int numberOfGrades(int grade){
        int count = 0;
        for(int e: this.grades){
            if(e == grade){
                count++;
            }
        }
        return count;
    }
    
    public static int pointsToGrades(int points){
        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
}
