public class Tax {
    private static final double tax = 0.1;

    static Double calculate(Double price) {
        return price * tax;
    }
}
