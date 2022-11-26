import lombok.Getter;
import java.util.HashSet;
import java.util.Set;
@Getter
public class ProductS {
    private final Set<Product> products = new HashSet<>();

    public boolean add(Product product) throws ProductException {
        if (!products.add(product)) {
            throw new ProductException("Этот продукт уже есть в списке");
        }
        product.buy();
        return true;
    }
    public void remove(Product d) {
        products.remove(d);
    }

    @Override
    public String toString() {
        String allProducts = null;
        for (Product product : this.products) {
            allProducts = allProducts + product;
        }
        return allProducts;
    }
}
