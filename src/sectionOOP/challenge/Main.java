package sectionOOP.challenge;

public class Main {
    public static void main(String[] args) {
        Account bobsAccount = new Account("12345", 1000.00, "Bobby", "bob@test.com", "(087) 123-4567");
        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());

        bobsAccount.withdrawFunds(100.0);
        bobsAccount.depositFunds(250);
    }
}
