package be.ifosupwavre.info.poo;

import java.util.Map;

public class Recipe {
    private String title;
    private String subtitle;
    private Category category;
    private Difficulty difficulty;
    private int time;
    private int expDay;
    private Map<String, Quantity> ingredients;

    public Recipe(String title, String subtitle, Category category, Difficulty difficulty, int time, int expDay, Map<String, Quantity> ingredients) {
        this.title = title;
        this.subtitle = subtitle;
        this.category = category;
        this.difficulty = difficulty;
        this.time = time;
        this.expDay = expDay;
        this.ingredients = ingredients;
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

    public Map<String, Quantity> getIngredients() {
        return ingredients;
    }

    private void setIngredients(Map<String, Quantity> ingredients) {
        this.ingredients = ingredients;
    }
}
