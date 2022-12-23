package sectionInheritance;

public class Dog extends Animal {

    private String earShape;
    private String tailShape;

    // call to Animal constructor class, passing its fields as args in super()
    public Dog() {
        super("mutt", "big", 50);
    }

    // Dog constructor
    public Dog(String type, double weight) {
        this(type, weight, "Perky", "Curled");
    }


    // this constructor has a combination of Dog & Animal fields in its args list
    // Animal's size field is removed from the params, passing it to the super() call instead to create new instance of Dog faster
    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    // this method has the same signature as the makeNoise method on Animal, this is method overriding
    // we overrode the method by making it unique to the Dog class by calling the bark() method
    public void makeNoise() {
        // were able to use 'type' field from Animal class bc we set it from private to protected
        if (type == "Wolf") {
            System.out.println("AAA WOOOOOOO!");
        }
        bark();
        System.out.println();
    }

    // overriding the superclass method by adding a new behavior
    @Override
    public void move(String speed) {
        super.move(speed);
        // System.out.println("Dogs walk, run and wag their tail");
        if (speed == "slow") {
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
        System.out.println();
    }

    // methods specifically unique for Dog class
    // private bc we'll call it from the move method^
    private void bark() {
        System.out.println("Woof!!!!");
    }

    private void run() {
        System.out.println("Dog Running!");
    }

    private void walk() {
        System.out.println("Dog Walking!");
    }

    private void wagTail() {
        System.out.println("Tail Wagging!");
    }
}
