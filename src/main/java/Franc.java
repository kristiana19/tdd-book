public class Franc extends Money{
    //private int amount;
    //private String currency;

   Franc (int amount, String currency) {
        
        super(amount, currency);
    

       //this.amount = amount;
       //this.currency = currency;
   }

    Money times (int multiplier){
        return new Franc (amount * multiplier, currency);
    }

    /* public boolean equals(Object object){
        Money franc = (Money) object;
        return amount == money.amount;
    } */

    /* String currency() {
        return currency;
    } */
}
