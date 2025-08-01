
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);
        
        paulsCard.eatHeartily();
        mattsCard.eatAffordably();

        System.out.println("Paul's card: " + paulsCard);
        System.out.println("Matt's card: " + mattsCard);
        
        paulsCard.addMoney(20);
        mattsCard.eatHeartily();
        
        System.out.println("Paul's card: " + paulsCard);
        System.out.println("Matt's card: " + mattsCard);
        
        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        mattsCard.addMoney(50);
        
        System.out.println("Paul's card: " + paulsCard);
        System.out.println("Matt's card: " + mattsCard);
        
    }
}
