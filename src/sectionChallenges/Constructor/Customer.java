package sectionChallenges.Constructor;

public class Customer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    // 1st constructor for all 3 fields which should assign the arguments
    // directly to the instance fields
    public Customer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    // 2nd no args constructor that calls another constructor
    // passing some literal values for each argument
    public Customer() {
        // we could've done it this way, setting a default literal value
        // this("Anon", 700, "anon@test.com");

        // but we did it this way, calling the 3rd constructor with a default lit value already assigned
        this("Anon", "anon@test.com");
    }

    // 3rd constructor with just the name & email params
    // which also calls another constructor
    public Customer(String name, String emailAddress) {
        this(name, 800, emailAddress);
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
