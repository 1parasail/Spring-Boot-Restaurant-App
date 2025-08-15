package dumplings.data;

import org.springframework.data.repository.CrudRepository;
import dumplings.Ingredient;
public interface IngredientRepository
        extends CrudRepository<Ingredient, String> {
}