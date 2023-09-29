import java.util.ArrayList;
import java.util.List;

class Category {

    String name;

    List<Product> arrayCategory = new ArrayList<>();

    public Category(String name, Product product) {
        this.name = name;
        arrayCategory.add(product);
    }

    public Category(String name) {
        this.name = name;
    }

    public void addCatProd(Product addProd) {
        arrayCategory.add(addProd);
    }

    @Override
    public String toString() {
        return "Список продуктов категории " + name + " : " + "\n" +  arrayCategory;
    }

    public void removeProduct(Product productToRemove) {
        for (Product product : this.arrayCategory) {
            if (product.equals(productToRemove)){
                this.arrayCategory.remove(product);
                break;
            }
        }
    }

    public boolean findProduct(Product productToFind) {
        boolean resultToFind = false;
        for (Product product : this.arrayCategory) {
            if (product.equals(productToFind)){
                resultToFind = true;
            }else resultToFind = false;
        }
        return resultToFind;
    }
}
