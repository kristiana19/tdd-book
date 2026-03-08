import java.util.Hashtable;

public class Bank {

    Money reduce (Expression source, String to) {
        if (source instanceof Money) 
            return (Money) source.reduce(this, to);
        Sum sum = (Sum) source;
        //int amount = sum.augend.amount + sum.addend.amount;
        //return Money.dollar(10);
        //return new Money(amount, to);
        return source.reduce(this, to);
    }

    int rate (String from, String to) {
        if (from.equals(to)) return 1;
        Integer rate = (Integer) rates.get(new Pair(from, to));
        return rate.intValue();
    }

    private Hashtable rates = new Hashtable();

    void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to), new Integer(rate));
    }
}