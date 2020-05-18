public class ApplyDiscount implements ApplyFunction {
    @Override
    public double apply(double rate, double price) {
        if (price > 100)
            return rate * price;
        else
            return 0;
    }
}
