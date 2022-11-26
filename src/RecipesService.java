
import lombok.Getter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
@Getter
public class RecipesService {
    private final Set<Recipes> resipesProduct = new HashSet<>();

    public boolean add(Recipes recipes) throws ProductException {
        if (resipesProduct.contains(recipes)) {
            throw new ProductException("Такой рецепт уже есть в списке!");
        } else {
            resipesProduct.add(recipes);
        } return true;
    }
    @Override
    public String toString() {
        String allProducts = null;
        for (Recipes recipes : this.resipesProduct) {
            allProducts = allProducts + recipes;
        }
        return allProducts;
    }
}
