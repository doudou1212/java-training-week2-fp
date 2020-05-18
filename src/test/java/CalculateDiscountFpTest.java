import io.vavr.control.Option;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class CalculateDiscountFpTest {
    @Test
    void should_calculate_discount_if_price_greater_than_100() {
        BigDecimal price = BigDecimal.valueOf(110);
        BigDecimal expected = BigDecimal.valueOf(88);
        Assertions.assertEquals(expected.doubleValue(), CalculateDiscountFp.apply.apply(Option.of(price)).get().doubleValue());
    }

    @Test
    void should_not_calculate_discount_if_price_equals_to_100() {
        BigDecimal price = BigDecimal.valueOf(100);
        BigDecimal expected = BigDecimal.valueOf(100);
        Assertions.assertEquals(expected.doubleValue(), CalculateDiscountFp.apply.apply(Option.of(price)).get().doubleValue());
    }

    @Test
    void should_not_calculate_discount_if_have_no_price() {
        Assertions.assertEquals(Option.none(), CalculateDiscountFp.apply.apply(Option.none()));
    }
}
