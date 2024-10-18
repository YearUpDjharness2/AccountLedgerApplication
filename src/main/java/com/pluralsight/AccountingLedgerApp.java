package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class AccountingLedgerApp {
    public static void main (String[] args){
        displayHomeScreenMenu();
    }
    public static void displayHomeScreenMenu(){
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while (run){
            System.out.println("=====Welcome to Your Account Ledger");
            System.out.println("Select an Option");
            System.out.println("D) Make a Deposit");
            System.out.println("P) Make a Payment");
            System.out.println("L) View Ledger");
            System.out.println("E) Exit");

            String choice = scanner.nextLine().toUpperCase();
            if (choice.equals("D")){
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
    public static void addDeposit (Scanner scanner){
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

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("transactions.csv", true))){
            
        }

    }

}
