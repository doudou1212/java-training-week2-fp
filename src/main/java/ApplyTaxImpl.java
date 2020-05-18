public class ApplyTaxImpl implements ApplyFunction {
    @Override
    public double apply(double rate, double price) {
        return rate * price;
    }
}
