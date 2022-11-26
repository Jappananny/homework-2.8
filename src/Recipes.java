
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;
import java.util.Set;
@Getter
@Setter
public class Recipes {
    private static double MIN_PRICE = 0;
    private String nameRecipes;
    private double allPrices;
    private Set<Product> products;

    public Recipes(String nameRecipes, double allPrices, Set<Product> products) {

        this.nameRecipes = nameRecipes;
        this.products = products;
        for (Product product1 : products) {
            MIN_PRICE += allPrices;
        }
        this.allPrices = MIN_PRICE;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipes recipes = (Recipes) o;
        return Double.compare(recipes.allPrices, allPrices) == 0 && Objects.equals(nameRecipes, recipes.nameRecipes)
                && Objects.equals(products, recipes.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameRecipes);
    }
    @Override
    public String toString() {
        return "Продукт " + this.nameRecipes + ", стоит " + this.allPrices + " руб. и состоит из "
                + this.products + ".";
    }

}
