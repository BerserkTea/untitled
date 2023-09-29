import java.util.ArrayList;
import java.util.List;

public class Catalog {
    List<Category> catalog = new ArrayList<>();

    String nameCatalog;


    public Catalog(String nameCatalog) {
        this.nameCatalog = nameCatalog;
    }
    public void addToCatalog(Category category){
        catalog.add(category);
    }
    public void showCatalog(){
        for (Category category : this.catalog) {
            System.out.println(category);
        }
    }

    public void removeFromCatalog(Product productToRemove){
        for (Category category : this.catalog) {
            category.removeProduct(productToRemove);
        }
    }

    public boolean findProduct (Product productToFind){
        boolean resultFing=false;
        for (Category category : this.catalog) {
            if(category.findProduct(productToFind)){
                resultFing = true;
            }else resultFing = false;
        }
    return resultFing;
    }

    @Override
    public String toString() {
        return "Список продуктов магазина \n "+ catalog;
    }
}
