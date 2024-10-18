package com.pluralsight;

import java.io.*;
import java.util.Scanner;

public class AccountingLedgerApp {
    public static void main(String[] args) {
        displayHomeScreenMenu();
    }

    public static void displayHomeScreenMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("=====Welcome to Your Account Ledger=====");
            System.out.println("D) Make a Deposit");
            System.out.println("P) Make a Payment");
            System.out.println("L) View Ledger");
            System.out.println("E) Exit");
            System.out.println("Select an Option: ");
            String choice = scanner.nextLine().toUpperCase();
            if (choice.equals("D")) {
                addDeposit(scanner);
            } else if (choice.equals("E")) {
                run = false;
                System.out.println("Exiting");
            } else if (choice.equals("P")) {
                makePayment(scanner);
            } else if (choice.equals("L")) {
                displayLedgerMenu();
            } else {
                System.out.println("Invalid Response");

            }
        }
    }

    public static void addDeposit(Scanner scanner) {
        System.out.println("Add a New Deposit");
        System.out.println("Enter Date of Deposit (Ex. YYYY/MM/DD)");
        String date = scanner.nextLine();
        System.out.println("Time of Deposit (Ex. HH:MM:SS)");
        String time = scanner.nextLine();
        System.out.println("Deposit Description?");
        String description = scanner.nextLine();
        System.out.println("Name of Vendor?");
        String vendor = scanner.nextLine();
        System.out.println("Deposit Amount?");
        String amount = scanner.nextLine();
        String transaction = date + "|" + time + "|" + description + "|" + vendor + "|" + amount + "\n";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("transactions.csv", true))) {
            writer.write(transaction);
            System.out.println("Your Deposit Has Been Added");
        } catch (IOException e) {
            System.out.println("Error, Try Again" + e.getMessage());
        }
    }

    public static void makePayment(Scanner scanner) {
        System.out.println("Make a Payment (Debit)");
        System.out.println("Payment Date (YYYY/MM/DD");
        String date = scanner.nextLine();
        System.out.println("Time of Payment? (Ex. HH:MM:SS)");
        String time = scanner.nextLine();
        System.out.println("Description of Payment?");
        String description = scanner.nextLine();
        System.out.println("Vendor Name?");
        String vendor = scanner.nextLine();
        System.out.println("Payment Amount?");
        String amount = scanner.nextLine();
        String transaction = date + "|" + time + "|" + description + "|" + vendor + "|" + amount + "\n";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("transactions.csv", true))) {
            writer.write(transaction);
            System.out.println("Your Payment Has Been Added");
        } catch (IOException e) {
            System.out.println("Error, Try Again" + e.getMessage());
        }
    }

    public static void displayLedgerMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("Your Ledger Account");
            System.out.println("Select an Option: ");
            System.out.println("A) All Deposits");
            System.out.println("P) All Payments");
            System.out.println("R) Reports");
            String choice = scanner.nextLine();
            if (choice.equals("A")) {
                displayAllLedgerInfo();
            } else if (choice.equals("P")) {
                displayPayments();
            } else if (choice.equals("R")) {
                displayReports();
            }
        }
        String choice = scanner.nextLine().toUpperCase();
    }

    public static void displayAllLedgerInfo() {
        System.out.println("All Ledger Info");

        try (BufferedReader reader = new BufferedReader(new FileReader("transaction.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error, Try again: " + e.getMessage());
        }
    }

    public static void displayPayments() {
        try (BufferedReader reader = new BufferedReader(new FileReader("transaction.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");
                if (parts.length == 5) {
                    String amountStr = parts[4].trim();
                    try {
                        double amount = Double.parseDouble(amountStr);
                        if (amount < 0 ){
                            System.out.println(line);
                        }
                    } catch (NumberFormatException e){
                        System.out.println("Error" + amountStr + "Line: " + line);
                    }
                }
            }
        } catch (IOException e){
            System.out.println("Error, Try Again" + e.getMessage());
        }
    }
    public static void displayReports(){
        Scanner scanner = new Scanner(System.in);
    }
}

