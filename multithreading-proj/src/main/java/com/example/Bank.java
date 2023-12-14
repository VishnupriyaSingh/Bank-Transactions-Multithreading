package com.example;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private final Map<Integer, Integer> accounts = new HashMap<>();

    // Synchronized method to deposit amount
    public synchronized void deposit(int accountNumber, int amount) {
        accounts.put(accountNumber, accounts.getOrDefault(accountNumber, 0) + amount);
        System.out.println("Deposited " + amount + " to account " + accountNumber);
    }

    // Synchronized method to withdraw amount
    public synchronized void withdraw(int accountNumber, int amount) {
        if (accounts.getOrDefault(accountNumber, 0) >= amount) {
            accounts.put(accountNumber, accounts.get(accountNumber) - amount);
            System.out.println("Withdrew " + amount + " from account " + accountNumber);
        } else {
            System.out.println("Insufficient funds for account " + accountNumber);
        }
    }

    // Method to get balance
    public synchronized int getBalance(int accountNumber) {
        return accounts.getOrDefault(accountNumber, 0);
    }
}
