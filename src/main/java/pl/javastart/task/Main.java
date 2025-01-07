package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product("Chleb", "Prosto z pieca", 8.20, "Food");
        Product product2 = new Product("Klawiatura", "mechaniczna gamingowa", 750.99, "Electronics");
        Product product3 = new Product("Cegła", "Ozdobna do ogrodzenia", 15.99, "Construction");
        Product product4 = new Product("Przedmiot ogólny", "Nieznany produkt", 20.0, "Nieznana");

        BruttoCalculator calculator = new BruttoCalculator();

        System.out.println("Cena brutto bochenka chleba: " + calculator.productPrice(product1));
        System.out.println("Cena brutto klawiatury: " + calculator.productPrice(product2));
        System.out.println("Cena brutto jednej cegły: " + calculator.productPrice(product3));
        System.out.println("Cena brutto nieznanego produktu: " + calculator.productPrice(product4));
    }
}
