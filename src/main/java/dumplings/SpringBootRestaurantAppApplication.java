package dumplings;

import dumplings.data.IngredientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootRestaurantAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRestaurantAppApplication.class, args);
    }


}
