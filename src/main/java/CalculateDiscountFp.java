import io.vavr.Function1;
import io.vavr.control.Option;
import java.math.BigDecimal;
import static io.vavr.API.*;

public class CalculateDiscountFp {
    public static Function1<Option<BigDecimal>, Option<BigDecimal>> apply = (optionalPrice) -> {

        if(optionalPrice.isEmpty())
            return Option.none();

        BigDecimal rate = BigDecimal.valueOf(0.2);
        BigDecimal threshold = BigDecimal.valueOf(100);
        return Match(optionalPrice.get().compareTo(threshold)).of(
                Case($(1), i -> {
                    BigDecimal price = optionalPrice.get();
                    return Option.of(price.subtract(price.multiply(rate)));
                }),
                Case($(), i -> {
                    System.out.println("You can't get discount because the optionalPrice is not greater than 100.");
                    return optionalPrice;
                })
        );
    };
}
