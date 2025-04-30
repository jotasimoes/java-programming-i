
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
    
    public Money plus(Money addition) {       
    Money newMoney = new Money(this.euros+addition.euros,this.cents+addition.cents); // create a new Money object that has the correct worth
    
    

    // return the new Money object
    return newMoney;
}
    
    public boolean lessThan(Money compared){
        if(this.euros<compared.euros){
            return true;
        }
            
        if(this.euros==compared.euros & this.cents<compared.cents){
            return true;
        }        
        return false;
    }
    
    public Money minus(Money decreaser){
        
       
        if (decreaser.lessThan(this)) {
        int newEuros = this.euros - decreaser.euros;
        int newCents = this.cents - decreaser.cents;

        // Borrowing logic: if cents go negative, take 1 euro and add 100 cents
        if (newCents < 0) {
            newEuros -= 1;
            newCents += 100;
        }

        return new Money(newEuros, newCents);
    } else {
        return new Money(0, 0);
    }
        
        
        
        
       
        
        
      
    }
    
    
    

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
