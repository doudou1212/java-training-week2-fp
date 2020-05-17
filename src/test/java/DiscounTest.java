import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DiscounTest {

    @Test
    void should_calculate_discount_when_price_greater_than_100() {
        double price = 110;
        double expect = 22;
        Assertions.assertEquals(expect, Discoun.calculate(price));
    }

    @Test
    void should_not_calculate_discount_when_price_not_greater_than_100() {
        double price = 90;
        Assertions.assertEquals(0.0, Discoun.calculate(price));
    }

    @Test
    void should_not_calculate_discount_when_price_equal_100() {
        double price = 100;
        Assertions.assertEquals(0.0, Discoun.calculate(price));
    }
}
