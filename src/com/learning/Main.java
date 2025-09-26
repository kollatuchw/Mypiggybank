package com.learning;

// Class with the main method to test the PiggyBank
public class Main {
    public static void main(String[] args) {
        // Create an object of PiggyBank class
        PiggyBank piggyBank = new PiggyBank("Nong Pao Jai");

        // Show current balance (should be 0 initially)
        piggyBank.showMoney();

        // Add money to the piggy bank
        piggyBank.addMoney(20); // Add 20 baht
        piggyBank.addMoney(50); // Add 50 baht

        // Show the updated balance
        piggyBank.showMoney();
    }
}
