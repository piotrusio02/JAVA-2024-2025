import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if( Double.compare(o1.price, o2.price) == 0){
            return Integer.compare(o1.id,o2.id);
        }
        else{
            return Double.compare(o1.price,o2.price);
        }
    }
}
