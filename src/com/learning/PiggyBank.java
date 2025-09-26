package com.learning;

// Class for PiggyBank
public class PiggyBank {
    // Fields
    String ownerName;
    double money;

    // Constructor
    public PiggyBank(String ownerName) {
        this.ownerName = ownerName;
        this.money = 0.0; // Initially, there is no money
    }

    // Method to add money to the piggy bank
    public void addMoney(double amount) {
        if (amount > 0) {
            this.money += amount; // Add the given amount to the piggy bank
            System.out.println("Added " + amount + " baht to the piggy bank.");
        } else {
            System.out.println("Amount must be greater than 0.");
        }
    }

    // Method to show the current amount of money in the piggy bank
    public void showMoney() {
        System.out.println("Current balance in " + ownerName + "'s piggy bank: " + money + " baht.");
    }
}

