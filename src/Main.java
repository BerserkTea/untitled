public class Main {
    public static void main(String[] args){
        Product toster = new Product("Toster", 20, 5.0);
        Product toster2 = new Product("Toster1", 21, 4.0);
        Product toilet = new Product("toilet", 22, 3.0);
        Product toilet2= new Product("toilet2", 23, 2.0);
        Product car1= new Product("car", 500, 1.0);
        Product car2= new Product("car2", 4000, 4.9);
        Product knife23= new Product("knife1", 10, 1.0);
        Product knife1= new Product("knife1", 10, 1.0);
        Product knife2= new Product("knife2", 230, 5.0);

        Category tosters = new Category("Tosters");
        tosters.addCatProd(toster);
        tosters.addCatProd(toster2);
        Category toilets = new Category("Toilets",toilet2);
        toilets.addCatProd(toilet);
        Category cars = new Category("Cars",car1);
        cars.addCatProd(car2);
        Category knifes = new Category("Knifes",knife1);
        knifes.addCatProd(knife2);
        knifes.addCatProd(knife23);

        Catalog catalog = new Catalog("Catalog");
        catalog.addToCatalog(tosters);
        catalog.addToCatalog(toilets);
        catalog.addToCatalog(cars);
        catalog.addToCatalog(knifes);

        catalog.showCatalog();

        catalog.removeFromCatalog(knife1);
        catalog.showCatalog();

        User user1 = new User("nagibator3000","dedmoped", new Basket());
        User user2 = new User("gruz200","dedmoped", new Basket());
        User user3= new User("Sid","dedmoped", new Basket());
        User user4 = new User("BerTea","dedmoped", new Basket());

        //Совершил покупки, но тут прям что-то сложно пошло, мне прям непойму как один каталог для всех.
        catalog.removeFromCatalog(user1.buyProduct(toilet2));
        catalog.removeFromCatalog(user2.buyProduct(toster2));
        catalog.removeFromCatalog(user3.buyProduct(car2));
        catalog.removeFromCatalog(user4.buyProduct(knife23));

        catalog.showCatalog();

        user1.showBasket();
        user2.showBasket();
        user3.showBasket();
        user4.showBasket();
    }
}