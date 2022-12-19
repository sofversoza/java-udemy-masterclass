package sectionOOP.challenge;

public class Account {
    private String number = "121212";
    private double balance = 50.55;
    private String name = "Sofia";
    private String email = "sof@gmail.com";
    private String phoneNumber = "6026863882";

    // constructor
    public Account() {
        System.out.println("Empty constructor called");
    }

    public Account(String number, double balance, String name, String email, String phone) {
        System.out.println("Account constructor with params called");
        this.number = number;
        this.balance = balance;
        this.name = name;
        this.email = email;
        phoneNumber = phone;
    }


    // deposit funds method
    public void depositFunds(double depositAmount) {
        balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount +
                " made. New balance is $" + balance);
    }

    // withdrawing funds method
    // shouldn't allow to withdraw if the withdrawal takes the balance to negative
    public void withdrawFunds(double withdrawalAmount) {
        if (balance - withdrawalAmount < 0) {
            System.out.println("Insufficient funds! You only have $" +
                    balance + " in your account.");
        } else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal of $" + withdrawalAmount +
                    " processed, Remaining balance = $" + balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
