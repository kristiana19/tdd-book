public class Dollar extends Money {
    //private int amount;

    private String currency;
       Dollar(int amount, String currency) {

        super(amount, currency);

       // this.amount = amount;
       //this.currency = currency;
    }


    Money times(int multiplier) {
        return new Dollar (amount * multiplier, "USD");

    }

    /* public boolean equals(Object object){
        Money dollar = (Money) object;
        return amount == money.amount;
    } */
        
    /* String currency() {
        return currency;
    } */

}