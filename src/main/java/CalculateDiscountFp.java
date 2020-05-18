import io.vavr.Function1;
import io.vavr.control.Option;

import java.math.BigDecimal;

public class CalculateDiscountFp {
    public static Function1<Option<BigDecimal>, Option<BigDecimal>> apply = (optionalPrice) -> {
        BigDecimal rate = BigDecimal.valueOf(0.2);

        if (!optionalPrice.isEmpty() && optionalPrice.get().compareTo(BigDecimal.valueOf(100)) > 0) {
            BigDecimal price = optionalPrice.get();
            return Option.of(price.subtract(price.multiply(rate)));
        } else
            System.out.println("You can't get discount because the optionalPrice is not greater than 100.");
            return optionalPrice;
    };
}
