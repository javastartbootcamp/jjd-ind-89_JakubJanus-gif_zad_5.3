package pl.javastart.task;

public class BruttoCalculator {

    public double productPrice(Product product) {
        double vatRate = switch (product.getCategory()) {
            case "Food" -> 0.11;
            case "Electronics" -> 0.31;
            case "Construction" -> 0.42;
            default -> 0.10;
        };
        return product.getNettoPrice() *  vatRate;
    }
}