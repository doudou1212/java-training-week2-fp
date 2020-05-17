import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaxTest {
    @Test
    void should_calculate_tax() {
        double price = 25.0;
        double expect = 2.5;
        Assertions.assertEquals(expect, Tax.calculate(price));
    }
}
