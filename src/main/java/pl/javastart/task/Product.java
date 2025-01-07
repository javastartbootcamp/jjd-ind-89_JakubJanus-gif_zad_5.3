package pl.javastart.task;

public class Product {
    String name;
    String descritpion;
    double nettoPrice;
    String category;

    Product(String name, String descritpion, double nettoPrice, String category) {
        this.name = name;
        this.descritpion = descritpion;
        this.nettoPrice = nettoPrice;
        this.category = category;
    }

    public double getNettoPrice() {
        return nettoPrice;
    }

    public String getCategory() {
        return category;
    }
}