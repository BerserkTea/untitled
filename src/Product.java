import java.util.Objects;

public class Product {
    String name;
    int price;
    Double rating;

    public Product(String name, int price, Double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return price == product.price && Objects.equals(name, product.name) && Objects.equals(rating, product.rating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, rating);
    }

    @Override
    public String toString() {
        return  name + " цена - " + price + ", рейтинг: " + rating ;
    }
}
