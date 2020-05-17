import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatePriceTest {

    @Test
    void calculate_total_price_when_price_greater_than_100() {
        double price = 110;
        double expected = 96.8;
        Assertions.assertEquals(expected, CalculatePrice.calculate(price));
    }

    @Test
    void calculate_total_price_when_price_equal_100() {
        double price = 100;
        double expected = 110;
        Assertions.assertEquals(expected, CalculatePrice.calculate(price));
    }

    @Test
    void calculate_total_price_when_price_less_than_100() {
        double price = 90;
        double expected = 99;
        Assertions.assertEquals(expected, CalculatePrice.calculate(price));
    }
}
