
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;
@Getter
@Setter
public class RecipesService {
    private final Set<Recipes> recipesProduct = new HashSet<>();

    public boolean add(Recipes recipes) throws ProductException {
        if (recipesProduct.contains(recipes)) {
            throw new ProductException("Такой рецепт уже есть в списке!");
        } else {
            recipesProduct.add(recipes);
        } return true;
    }
    public void remove(Recipes recipes){
        recipesProduct.remove(recipes);
        System.out.println("Рецепт " + recipes + " удален.");
    }

    @Override
    public String toString() {
        return recipesProduct.toString().replace("[","").replace("]","");
    }
}
