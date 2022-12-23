package sectionInheritance;

public class Animal {
    // protected to let any subclass access 'type' field
    protected String type;
    private String size;
    private double weight;

    // constructor
    public Animal() {

    }
    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    // method to print out information about the animal
    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }

    // methods indicating this class's behavior
    public void move(String speed) {
        System.out.println(type + " moves " + speed);
    }

    public void makeNoise() {
        System.out.println(type + " makes some kind of noise");
    }
}
