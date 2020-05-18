import io.vavr.control.Option;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class CalculateTaxFpTest {
    @Test
    void should_calculate_tax_if_have_price() {
        BigDecimal price = BigDecimal.valueOf(100);
        BigDecimal expected = BigDecimal.valueOf(110);
        Assertions.assertEquals(expected.doubleValue(), CalculateTaxFp.apply.apply(Option.of(price)).get().doubleValue());
    }

    @Test
    void should_not_calculate_tax_if_have_no_price() {
        Assertions.assertEquals(Option.none(), CalculateTaxFp.apply.apply(Option.none()));
    }
}
