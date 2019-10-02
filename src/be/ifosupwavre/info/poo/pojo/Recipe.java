package be.ifosupwavre.info.poo.pojo;

import java.util.HashSet;
import java.util.Set;

public class Recipe {
    private String title;
    private String subtitle;
    private Category category;
    private Difficulty difficulty;
    private int time;
    private int expDay;
    private Set<Ingredient> ingredients;

    /*
        hasIngredients()
        showIngredients(numberOfPersons)
        addIngredient()
        removeIngredient()
        updateIngredient()
     */

    public Recipe(String title) {
        this();
        this.title = title;
    }

    private Recipe(String title, String subtitle, Category category, Difficulty difficulty, int time, int expDay) {
        this();
        this.title=title;
        this.subtitle = subtitle;
        this.category = category;
        this.difficulty = difficulty;
        this.time = time;
        this.expDay = expDay;
    }

    private Recipe() {
        this.ingredients = new HashSet<>();
    }

    private static Recipe createRecipe(String title, String subtitle, Category category, Difficulty difficulty, int time, int expDay) {
        return new Recipe(title, subtitle, category, difficulty, time, expDay);
    }

    @Override
    public String toString() {
        return title + " " + subtitle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getExpDay() {
        return expDay;
    }

    public void setExpDay(int expDay) {
        this.expDay = expDay;
    }

    public Set<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public void addIngredient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
    }
    public class Builder {
        private Recipe recipe = new Recipe();
        public Builder putTitle(String title) {
            recipe.setTitle(title);
            return this;
        }

        public Builder putSubTitle(String subtitle) {
            recipe.setSubtitle(subtitle);
            return this;
        }

        public Builder putCategory(Category category) {
            recipe.setCategory(category);
            return this;
        }

        public Builder putDifficulty(Difficulty difficulty) {
            recipe.setDifficulty(difficulty);
            return this;
        }

        public Builder putTime(int time) {
            recipe.setTime(time);
            return this;
        }

        public Builder putExpDay(int day) {
            recipe.setExpDay(day);
            return this;
        }

        public Builder addIngredients(Ingredient... ingredients){
            for (var ingredient : ingredients) {
                recipe.addIngredient(ingredient);
            }
            return this;
        }

        public Recipe build() {
            return recipe;
        }
    }

}
