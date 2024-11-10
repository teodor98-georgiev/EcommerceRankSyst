import java.util.List;

public class User extends ProductSortingService{

    public User(List<Product> products) {
        super(products);
    }

    public static Product[] sortOfProductsByPrice(List<Product> products, PriceComparator prc){
        products.sort(prc);
        return products.toArray(new Product[0]);
    }
    public static Product[] sortOfProductsByRating(List<Product> products, RatingComparator rc){
        products.sort(rc);
        return products.toArray(new Product[0]);
    }
    public static Product[] sortOfProductsByPopularity(List<Product> products, PopularityComparator pc){
        products.sort(pc);
        return products.toArray(new Product[0]);
    }
}
