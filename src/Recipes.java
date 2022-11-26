
import lombok.Getter;
import lombok.Setter;
import java.util.Objects;
@Getter
@Setter
public class Recipes {
    private double MIN_PRICE = 0;
    private String nameRecipes;
    private double allPrices;
    private ProductServise productServise;

    public Recipes(String nameRecipes, double allPrices, ProductServise productServise) {

        this.nameRecipes = nameRecipes;
        this.productServise = productServise;
        for (Product product1 : productServise.getProducts()) {
            MIN_PRICE += product1.getAllcost();
        }
        this.allPrices = MIN_PRICE;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipes recipes = (Recipes) o;
        return Double.compare(recipes.allPrices, allPrices) == 0 && Objects.equals(nameRecipes, recipes.nameRecipes)
                && Objects.equals(productServise, recipes.productServise);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameRecipes);
    }
    @Override
    public String toString() {
        return productServise.toString().replace("[","").replace("]","");
    }

}
