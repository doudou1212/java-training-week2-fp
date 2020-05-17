import java.util.Optional;

public class Discoun {
    private static final double discount = 0.2;
    private static final int threshold = 100;

    static Double calculate(Double price) {
        if(price.compareTo(Double.valueOf(threshold)) > 0) {
            return price * discount;
        } else {
            System.out.println("You can't get discount because the price is not greater than 100.");
            return 0.0;
        }
    }
}
