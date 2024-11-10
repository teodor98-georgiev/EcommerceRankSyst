import java.util.List;
import java.util.Scanner;

public class ProductSortingService implements ProductSorter {
    List<Product> products;
    PriceComparator prc = new PriceComparator();
    RatingComparator rc = new RatingComparator();
    PopularityComparator pc = new PopularityComparator();

    public ProductSortingService(List<Product> products) {
        this.products = products;
    }

    @Override
    public void sortOfProducts(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("how do you want to sort products?" + "%n" + "tap one between the following choices" + "%n" +
                "sort by price" + "%n" + "sort by rating" + "%n" + "sort by popularity" + "%n");
        String toConsole = sc.nextLine();
        if (toConsole.equals("sort by price")){
            User.sortOfProductsByPrice(products, prc);
            for (Product element : products){
                System.out.println(element);
            }
        }
        else if (toConsole.equals("sort by rating")){
            User.sortOfProductsByRating(products, rc);
            for (Product element : products){
                System.out.println(element);
            }
        }
        else if (toConsole.equals("sort by popularity")){
            User.sortOfProductsByPopularity(products, pc);
            for (Product element : products){
                System.out.println(element);
            }
        }
        else {
            System.out.println("invalid input, please enter 1 of three given choices");
        }
    }
}
