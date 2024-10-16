package com.pluralsight;

import java.util.Scanner;  // Allows user input

public class AccountLedgerApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            showHomeScreen();  // Shows the menu options
            String option = scanner.nextLine().toUpperCase(); // Gets user input

            // Based on user input, a different action is triggered
            switch (option) {
                case "D":
                    addDeposit(scanner); // Calls the addDeposit method
                    break;
                case "P":
                    makePayment(scanner); // Calls the makePayment method
                    break;
                case "L":
                    showLedger(); // Calls the method to display the ledger
                    break;
                case "X":
                    exit = true; // Exits the program
                    System.out.println("Exiting application.");
                    break;
                default:
                    System.out.println("Invalid option. Try again."); // If the user input is incorrect
            }
        }
        scanner.close();  // Closes the scanner when exiting
    }

    // Methods
    public static void showHomeScreen() {
        System.out.println("==== Accounting Ledger Home Screen ====");
        System.out.println("D) Add Deposit");
        System.out.println("P) Make Payment (Debit)");
        System.out.println("L) View Ledger");
        System.out.println("X) Exit");
        System.out.print("Select an option: ");
    }

    public static void addDeposit(Scanner scanner) {
        System.out.println("Add Deposit - feature to be implemented.");
    }

    public static void makePayment(Scanner scanner) {
        System.out.println("Make Payment - feature to be implemented.");
    }

    public static void showLedger() {
        System.out.println("Ledger - feature to be implemented.");
    }
}