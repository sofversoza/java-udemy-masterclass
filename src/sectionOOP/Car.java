package sectionOOP;

public class Car {
    // the state or fields, which are the characteristics of the car class
    // when we create an object from this class, the values we assign to these fields represents the state of the object
    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;


    // getter methods
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }


    // setter methods with validations
    public void setMake(String make) {
        if (make == null) make = "Unknown";
        String lowercaseMake = make.toLowerCase();

        // were supporting only these 3 manufacturers
        switch (lowercaseMake) {
            case "holden", "porsche", "tesla" -> this.make = make;
            default -> {
                this.make = "Unsupported";
            }
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    // this method is not-static bc were accessing instance fields on the class
    public void describeCar() {
        System.out.println(doors + "-Door " +
                color + " " +
                make + " " +
                model + " " +
                (convertible ? "Convertible" : ""));
    }
}
