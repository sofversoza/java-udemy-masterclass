package sectionClassAndObject;

import sectionClassAndObject.lemonadestand.LemonJuice;
import sectionClassAndObject.lemonadestand.Lemonade;
import sectionClassAndObject.lemonadestand.Sugar;
import sectionClassAndObject.lemonadestand.Water;

public class Main {

    // start creating objects of type LemonJuice, Sugar, Water, Lemonade
    public static void main(String[] args) {

        LemonJuice lemonJuice = new LemonJuice(5, "ounces");
        Sugar sugar = new Sugar(12, "tsp");
        Water water = new Water(3, "cups");

        Lemonade lemonade = new Lemonade(lemonJuice, sugar, water);

    }
}
