import io.vavr.Function1;
import io.vavr.control.Option;

import java.math.BigDecimal;

public class PriceProcesser {
    public Option<BigDecimal> calculate(double price) {
        Function1<Option<BigDecimal>, Option<BigDecimal>> calculatePrice = CalculateDiscountFp.apply.andThen(CalculateTaxFp.apply);

        return calculatePrice.apply(Option.of(BigDecimal.valueOf(price)));
    }
}
