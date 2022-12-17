package sectionClassAndObject.lemonadestand;

public class Lemonade {

    // These are our Fields
    // These Water, LemonJuice, Sugar variables store an object that will be of type water, lemonJuice, sugar
    private LemonJuice lemonJuice;
    private Sugar sugar;
    private Water water;

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

    // getter & setters: methods that lets us access private fields
    // getters lets u get the value of the field
    // setters lets u to set the field
    public LemonJuice getLemonJuice() {
        return lemonJuice;
    }
    public void setLemonJuice(LemonJuice lemonJuice) {
        this.lemonJuice = lemonJuice;
    }

    public Sugar getSugar() {
        return sugar;
    }
    public void setSugar(Sugar sugar) {
        this.sugar = sugar;
    }

    public Water getWater() {
        return water;
    }
    public void setWater(Water water) {
        this.water = water;
    }
}
