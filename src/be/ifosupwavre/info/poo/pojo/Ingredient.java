package be.ifosupwavre.info.poo.pojo;

public class Ingredient {
    private final Unit unit;
    private String Name;

    private float qty;

    private enum Unit{
        GRAMS("Grammes"),
        MILLILITERS("Millilitres"),
        PIECES("Pièces");

        Unit(String unit) {

        }
    }

    public Ingredient(String name, float qty, Unit unit) {
        Name = name;
        this.qty = qty;
        this.unit = unit;
    }

    public Ingredient() {}

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public float getQty() {
        return qty;
    }

    public void setQty(float qty) {
        this.qty = qty;
    }


}
