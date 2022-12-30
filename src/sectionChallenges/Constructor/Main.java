package sectionChallenges.Constructor;

public class Main {
    public static void main(String[] args) {

        // calls our 3 params constructor
        Customer customer1 = new Customer("Lola", 1000, "lols@test.com");
        System.out.println(customer1.getName());
        System.out.println(customer1.getCreditLimit());
        System.out.println(customer1.getEmailAddress());

        // calls our no params constructor
        Customer customer2 = new Customer();
        System.out.println(customer2.getName());
        System.out.println(customer2.getCreditLimit());
        System.out.println(customer2.getEmailAddress());

        // calls our 2 params constructor
        Customer customer3 = new Customer("Joe", "joe@test.com");
        System.out.println(customer3.getName());
        System.out.println(customer3.getCreditLimit());
        System.out.println(customer3.getEmailAddress());
    }
}
