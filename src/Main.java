public class Main {
    public static void main(String[] args){
        Product toster = new Product("Toster", 20, 5.0);
        Product toster2 = new Product("Toster1", 21, 4.0);
        Product toilet = new Product("toilet", 22, 3.0);
        Product toilet2= new Product("toilet2", 23, 2.0);
        Product car1= new Product("car", 500, 1.0);
        Product car2= new Product("car2", 4000, 4.9);
        Product knife1= new Product("knife1", 10, 1.0);
        Product knife2= new Product("knife2", 230, 5.0);
        System.out.println(toster);
        System.out.println(toster2);
        System.out.println(toilet);
        System.out.println(toilet2);

        Category catTosters = new Category("Tosters");
        Category catToilets = new Category("Toilets");
        Category catCars = new Category("Cars");
        Category catKnifes = new Category("Knifes");
        catTosters.array.add(toster);
        catTosters.array.add(toster2);
        catToilets.array.add(toilet);
        catToilets.array.add(toilet2);
        catCars.array.add(car1);
        catCars.array.add(car2);
        catKnifes.array.add(knife1);
        catKnifes.array.add(knife2);

        System.out.println(catTosters.array);
        System.out.println(catToilets.array);
        System.out.println(catCars.array);
        System.out.println(catKnifes.array);

    }

}