import io.vavr.Function1;
import io.vavr.control.Option;

import java.math.BigDecimal;

public class CalculateTaxFp {
    public static Function1<Option<BigDecimal>, Option<BigDecimal>> apply = (optionalPrice) -> {
        BigDecimal rate = BigDecimal.valueOf(0.1);

        if(!optionalPrice.isEmpty()) {
            BigDecimal price = optionalPrice.get();
            return Option.of(price.multiply(rate).add(price));
        }

        return Option.none();
    };
}
