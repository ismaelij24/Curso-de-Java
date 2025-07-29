
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition){
        int euros = this.euros + addition.euros;
        int cents = this.cents + addition.cents;
        
        Money newMoney = new Money(euros, cents);
        
        return newMoney;
    }
    
    public boolean lessThan(Money compared){
        
        if(this.euros < compared.euros){
            return true;
        } else if(this.euros == compared.euros) {
            if(this.cents < compared.cents){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    
    public Money minus(Money decreaser) {
        
        int euros = this.euros;
        int cents = this.cents;

        // Pide prestado 1 euro si no alcanza para restar centavos
        if (cents < decreaser.cents) {
            cents += 100;
            euros--;
        }

        euros -= decreaser.euros;
        cents -= decreaser.cents;

        // Si el total es negativo, devuelve 0
        if (euros < 0) {
            return new Money(0, 0);
        }

        return new Money(euros, cents);
        
        /*
        Resuelto de otra manera:
        
        int thisTotalCents = this.euros * 100 + this.cents;
        int decreaserTotalCents = decreaser.euros * 100 + decreaser.cents;

        int diff = thisTotalCents - decreaserTotalCents;

        if (diff < 0) {
            return new Money(0, 0);
        }

        int euros = diff / 100;
        int cents = diff % 100;

        return new Money(euros, cents);
        */    
    }

}
