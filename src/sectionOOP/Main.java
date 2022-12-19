package sectionOOP;

public class Main {
    public static void main(String[] args) {
        // create an object or new instance based on class Car
        Car car = new Car();

        // setter method to update an attribute on class Car
        car.setMake("Porsche");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("black");

        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();

        // another instance of class Car
        Car targa = new Car();
        targa.setMake("Porsche");
        targa.setModel("Targa");
        targa.setDoors(2);
        targa.setConvertible(false);
        targa.setColor("red");

        targa.describeCar();
    }
}
