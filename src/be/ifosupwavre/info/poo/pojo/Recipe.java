package be.ifosupwavre.info.poo.pojo;

public class Recipe {
    private String title;
    private String subtitle;
    private Category category;
    private Difficulty difficulty;
    private int time;
    private int expDay;
    private Ingredient[] ingredients;

    public Recipe(String title) {
        this.title = title;
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

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    private void setIngredients(Ingredient[] ingredients) {
        this.ingredients = ingredients;
    }
}
