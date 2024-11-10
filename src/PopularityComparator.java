import java.util.Comparator;

public class PopularityComparator implements Comparator<Product> {
    public int compare(Product p1, Product p2){
        int result = p1.getPopularity().compareTo(p2.getPopularity());
        return result;
    }
}
