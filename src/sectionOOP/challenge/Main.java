package sectionOOP.challenge;

public class Main {
    public static void main(String[] args) {
         Account bobsAccount = new Account("12345", 1000.00, "Bobby", "bob@test.com", "(087) 123-4567");
        // Account bobsAccount = new Account();

        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());

        bobsAccount.withdrawFunds(100.0);
        bobsAccount.depositFunds(250);

        Account timsAccount = new Account("Tim", "tim@test.com", "123456");
        System.out.println("AccountNo: " + timsAccount.getNumber() +
                "; name " + timsAccount.getName());
    }
}
