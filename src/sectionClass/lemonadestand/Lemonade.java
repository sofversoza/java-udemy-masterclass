package sectionClass.lemonadestand;

public class Lemonade {

    // These are our Fields
    // These Water, LemonJuice, Sugar variables store an object that will be of type water, lemonJuice, sugar
    LemonJuice lemonJuice;
    Sugar sugar;
    Water water;

    public Lemonade(LemonJuice lemonJuice, Sugar sugar, Water water) {
        this.lemonJuice = lemonJuice;
        this.sugar = sugar;
        this.water = water;
    }

    // overloading ^this constructor: creating a lemonade without sugar
    public Lemonade(LemonJuice lemonJuice, Water water) {
        this.lemonJuice = lemonJuice;
        this.water = water;
    }
}
