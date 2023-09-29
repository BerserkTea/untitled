public class User {
    String login;
    String password;
    Basket userBasket;

    public User(String login, String password, Basket basket) {
        this.login = login;
        this.password = password;
        this.userBasket = basket;
    }

    public Product buyProduct(Product productToBuy) {
        this.userBasket.addToBasket(productToBuy);
        System.out.println("Товар " + productToBuy + " добавлен в корзину пользователя: " + this.login);
        return productToBuy;
    }

    public void showBasket() {
        System.out.println(this.login + " " + this.password + " " + this.userBasket);
    }

    @Override
    public String toString() {
        return login + " " + " " + password + " " + userBasket;
    }
}
