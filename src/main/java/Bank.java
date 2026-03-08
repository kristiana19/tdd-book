public class Bank {

    Money reduce (Expression source, String to) {
        if (source instanceof Money) return (Money) source;
        Sum sum = (Sum) source;
        //int amount = sum.augend.amount + sum.addend.amount;
        //return Money.dollar(10);
        //return new Money(amount, to);
        return sum.reduce(to);
    }
}