public class CalculatePrice {
    static Double calculate(Double price) {
        Double discount = Discoun.calculate(price);
        Double tax = Tax.calculate((price - discount));
        return price - discount + tax;
    }
}