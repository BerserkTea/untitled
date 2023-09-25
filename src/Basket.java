import java.util.ArrayList;
import java.util.List;

public class Basket {
    List<Product> productBuy;

    public Basket(Product productToBuy) {
        this.productBuy = new ArrayList<Product>();

    }

    @Override
    public String toString() {
        return "Basket{" + "productBuy=" + productBuy +'}';
    }
}
