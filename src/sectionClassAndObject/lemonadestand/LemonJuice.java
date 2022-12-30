package sectionClassAndObject.lemonadestand;

public class LemonJuice {

    // These are our Fields
    private int amount;
    private String unit;


    // this is the default constructor for this class, which is an empty object: public LemonJuice() {}
    // we have to define a constructor unless we want the default value that a default constructor provides
    // meaning for us to be able to use our declared fields, we need to create a constructor
    public LemonJuice(int amount, String unit) {
        this.amount = amount;
        this.unit = unit;
    }


    // we used the keyword "this." before our variables because of variable shadowing
    // shadowing is having a parameter with the same name as our fields
    // if we hadn't added the keyword, it will take in the parameters not the fields we declared outside the constructor
    // basically we need the keyword to be able to use variables outside the scope we are in
}
