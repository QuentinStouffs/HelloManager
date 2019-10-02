package be.ifosupwavre.info.poo.pojo;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class RecipeManager {


    /*
    Set recipe

    addRecipe()
    removeRecipe()
    updateRecipe()
    containsRecipe()
    getRecipes()
    filterByTags()
    filterByTitle()
    filterByCategory()
    filterByDifficulty()
    filterByTime()
    filterBy...
     */

    private Set<Recipe> recipes = new HashSet<>();

    public RecipeManager(Set<Recipe> recipes) {
        this.recipes = recipes;
    }

    public void add(Recipe recipe) {
        this.recipes.add(recipe);
    }

    public void remove(Recipe recipe) {
        this.recipes.remove(recipe);
    }

    public Set<Recipe> filterByTags(String tag, Category category, Difficulty difficulty, int time) {
        if(!tag.isEmpty()){
            var tags = tag.split(" ");
            recipes.parallelStream().filter(Objects::nonNull).collect(Collectors.toSet());
            }
        }

    }

    public Recipe getRecipe(Recipe recipe){
        return this.recipes;
    }

    public boolean contains(Recipe recipe) {
        return this.recipes.contains(recipe);
    }

    public void update(Recipe recipe) {
        this.recipes;
    }

    public Set<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(Set<Recipe> recipes) {
        this.recipes = recipes;
    }


}
