public class Product implements Comparable<Product>{
    int id;
    String name;
    double price;
    int rating;
    String popularity;

    public Product(int id, String name, double price, int rating, String popularity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.popularity = popularity;
    }
    public int getId(){
        return this.id;
    }
    public double getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }

    public String getPopularity() {
        return popularity;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                ", popularity='" + popularity + '\'' +
                '}';
    }

    @Override
    public int compareTo(Product product){
        return Integer.compare(this.id,product.getId());
    }
}
