package sectionClassAndObject.lemonadestand;

public class Water {
    private int amount;
    private String unit;

    public Water(int amount, String unit) {
        this.amount = amount;
        this.unit = unit;
    }

    // define an action or method that all type Water object can use
    public void drink(int amount) {
        if (this.amount < amount) {
            throw new IllegalArgumentException("You cant drink more water than is available. Amount of water available: " + this.amount);
        } else {
            this.amount -= amount;
        }
    }
}
