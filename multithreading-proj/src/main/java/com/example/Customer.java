package com.example;

public class Customer extends Thread {
    private final Bank bank;
    private final int accountNumber;

    public Customer(Bank bank, int accountNumber) {
        this.bank = bank;
        this.accountNumber = accountNumber;
    }

    @Override
    public void run() {
        // Transactions
        bank.deposit(accountNumber, 100);
        bank.withdraw(accountNumber, 50);
    }
}
