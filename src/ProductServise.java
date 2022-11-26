
import lombok.Getter;

import java.util.HashSet;
import java.util.Set;
@Getter
public class ProductServise {
    private final Set<Product> products = new HashSet<>();

    public boolean add(Product product) throws ProductException {
        if (!products.add(product)) {
            throw new ProductException("Этот продукт уже есть в списке");
        }
        product.checkBuy();
        return true;
    }
    public void remove(Product d) {
        products.remove(d);
    }

    @Override
    public String toString() {
        String allProducts = "";
        for (Product product : products){
            allProducts = allProducts + product;
        }
        return allProducts;
    }
}
