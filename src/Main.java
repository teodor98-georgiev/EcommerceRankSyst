import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Product p1 = new Product (1, "shampoo", 2.40,4, "popolar");
        Product p2 = new Product (4, "pork sausages", 12.75,7, "very popolar");
        Product p3 = new Product (8, "lamb steak", 13.89,10, "very popolar");
        Product p4 = new Product (5, "apple", 0.78,9, "popolar");
        Product p5 = new Product (3, "oranges", 3.48,8, "popolar");
        Product p6 = new Product (2, "cucumber", 4.63,10, "popolar");
        Product p7 = new Product (6, "beans", 3.70,9, "very popolar");
        Product p8 = new Product (7, "salad", 2.33,8, "popolar");
        List<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);
        products.add(p6);
        products.add(p7);
        products.add(p8);
        ProductSortingService pss = new ProductSortingService(products);
        // sorted with comparator by price
        //pss.sortOfProducts();
        // sorted with comparable by id
        products.sort(null);
        for (Product element : products){
            System.out.println(element);
        }


    }
}