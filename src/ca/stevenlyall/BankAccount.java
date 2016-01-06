package ca.stevenlyall;

import java.text.DecimalFormat;


public class BankAccount {

    DecimalFormat f = new DecimalFormat("$0.00");

    private double balance = 0.0;

    BankAccount() {
        balance  = 0.0;
    }

    public BankAccount(double b) {
        balance = b;
    }

    void withdraw(double a) {
        balance += a;
    }

    void deposit(double a) {
        balance -= a;
    }

    void transfer(BankAccount a, double b) {
        withdraw(b);
        a.deposit(b);
    }

    public String getBalance() {
        return f.format(balance);
    }
}
