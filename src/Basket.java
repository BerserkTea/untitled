import java.util.ArrayList;
import java.util.List;

public class Basket {
    ArrayList<Product> basket;

    public Basket() {
        this.basket = new ArrayList<Product>();

    }
    public void addToBasket(Product product){
        this.basket.add(product);

    }

    @Override
    public String toString() {
        return "Ваша корзина = " + basket;
    }
}
