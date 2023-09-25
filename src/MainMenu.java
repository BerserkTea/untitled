import java.util.*;

public class MainMenu {
    public static Map menu(){
        List<Category> allProducts = new ArrayList<>();
        allProducts.add();
        allProducts.add();
        allProducts.add();
        allProducts.add();
        boolean checker = true;
        while (checker){
            System.out.println("Список продуктов");
            System.out.println("0 - Завершение ввода критерия и сортировака по заданных параметрам");
            Scanner scanner = new Scanner(System.in);
            int item = scanner.nextInt();
            switch (item){
                case 1:
                    System.out.println("Доступны следующие параметры RAM, введите параметр вручную и нажмите Enter");
                    customerChoise.put("ram", choiseLine());
                    break;
                case 2:
                    System.out.println("Доступны следующие параметры Объем SSD, введите параметр вручную и нажмите Enter");
                    customerChoise.put("ssd", choiseLine());
                    break;
                case 3:
                    System.out.println("Доступны следующие параметры Операционная система, введите параметр вручную и нажмите Enter");
                    customerChoise.put("os", choiseLine());
                    break;
                case 4:
                    System.out.println("Доступны следующие параметры Цвет, введите параметр вручную и нажмите Enter");

                    return
                    break;
                default:
                    checker=false;
                    break;
            }
        }
        return "BeP";
    }

}
