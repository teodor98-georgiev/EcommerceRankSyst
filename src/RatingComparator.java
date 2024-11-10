import java.util.Comparator;

public class RatingComparator implements Comparator<Product> {
    public int compare(Product p1, Product p2){
        int result = Integer.compare(p1.getRating(),p2.getRating());
        return result;
    }
}
