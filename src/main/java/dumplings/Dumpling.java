package dumplings;

import lombok.Data;

import java.util.List;

@Data
public class Dumpling {
    private String name;
    private List<Ingredient> ingredients;
}
