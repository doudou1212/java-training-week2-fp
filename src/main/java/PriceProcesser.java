import io.vavr.Function1;

import java.math.BigDecimal;

public class PriceProcesser {
    public double calculate(double money) {
        Function1<Double, Double> calculateDiscount = (price) -> {
            Double rate = 0.2;
            if (price > 100) {
                BigDecimal originalPrice = new BigDecimal(price);
                BigDecimal originalRate = new BigDecimal(rate);
                double priceAfterDiscount = originalPrice.multiply(originalRate).doubleValue();
                return price - priceAfterDiscount;
            }
            else
                return price;
        };

        Function1<Double, Double> calculateTax = (price) -> {
            Double rate = 0.1;
            BigDecimal originalPrice = new BigDecimal(price);
            BigDecimal originalRate = new BigDecimal(rate);

            return originalPrice.multiply(originalRate).doubleValue() + price;
        };

        Function1<Double, Double> calculatePrice = calculateDiscount.andThen(calculateTax);
        return calculatePrice.apply(money);
    }
}
