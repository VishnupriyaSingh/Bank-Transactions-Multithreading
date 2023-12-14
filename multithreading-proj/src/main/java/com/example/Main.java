package com.example;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Simulating customers
        Customer customer1 = new Customer(bank, 1);
        Customer customer2 = new Customer(bank, 2);

        customer1.start();
        customer2.start();

        try {
            customer1.join();
            customer2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Printing final balances
        System.out.println("Final balance of account 1: " + bank.getBalance(1));
        System.out.println("Final balance of account 2: " + bank.getBalance(2));
    }
}