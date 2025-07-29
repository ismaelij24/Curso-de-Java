
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here
        int min, med, max;
        
        if(number1 > number2) {
            max = number1;
            min = number2;
        } else {
            max = number2;
            min = number1;
        }
        
        if(number3 > max) {
            med = max;
            max = number3;
        } else if(number3 > min) {
            med = number3;
        } else {
            med = min;
            min = number3;
        }
        
        return max;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
