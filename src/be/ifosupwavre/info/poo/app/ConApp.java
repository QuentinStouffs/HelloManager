package be.ifosupwavre.info.poo.app;

import be.ifosupwavre.info.poo.pojo.Recipe;

import java.util.HashSet;
import java.util.Set;

public class ConApp {
    public static void main(String[] args) {
        Set<Recipe> recipes = new HashSet<>();
        recipes.add(new Recipe("Omelette"));
        recipes.add(new Recipe("Burger"));

//        recipes.forEach(System.out::println);
        recipes.forEach(recipe ->
                        System.out.println("bla " + recipe)
                );
    }
}
