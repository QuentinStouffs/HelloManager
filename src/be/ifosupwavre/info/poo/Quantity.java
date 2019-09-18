package be.ifosupwavre.info.poo;

import java.lang.reflect.Constructor;

public class Quantity {

    private float qty;
    private enum Unit{
        GRAMS("Grammes"),
        MILLILITERS("Millilitres"),
        PIECES("Pièces");

        Unit(String unit) {

        }
    }

    public float getQty() {
        return qty;
    }

    public void setQty(float qty) {
        this.qty = qty;
    }

}
