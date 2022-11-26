import java.util.HashSet;
import java.util.Set;

public class ProductS {
    private final Set<Product> products = new HashSet<>();

    public boolean add(Product product){
        if (!products.add(product)) {
            throw new IllegalArgumentException("Этот продукт уже есть в списке");
        }
        product.buy();
        return true;
    }
    public void remove(Product d) {
        products.remove(d);
    }

    @Override
    public String toString() {
        for (Product product : this.products) {
            System.out.println(product);
        }
        return null;
    }
}
