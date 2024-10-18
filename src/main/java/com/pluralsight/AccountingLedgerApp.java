package com.pluralsight;

import java.util.Scanner;

public class AccountingLedgerApp {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        LedgerClass ledger = new LedgerClass();
        boolean exit = false;

        while (!exit){
            showHomeScreen();
            String option = scanner.nextLine().toUpperCase();

            switch (option){
                case "D":
                    System.out.println("Adding a deposit.");
                    break;
                case "P":
                    System.out.println("Making a payment.");
                case "L":
                    ledger.displayAll();
                    break;
                case "R":
                    System.out.println("Reports");
                    break;
                case "X":
                    exit = true;
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid");
            }
        }
        scanner.close();
    }
    public static void showHomeScreen(){
        System.out.println("Ledger Home Screen");
        System.out.println("D) Add Deposit");
        System.out.println("P) Make a Payment");
        System.out.println("L) View Ledger");
        System.out.println("X) Exit");
        System.out.println("Select an option: ");
    }
    public static void showReports(Scanner scanner){
        boolean back = false;

        while (!back){
            System.out.println("Reports Menu");
            System.out.println("1) Months to Date");
            System.out.println("2) Past Months");
            System.out.println("3) Year to Date");
            System.out.println("4) Past Years");
            System.out.println("5) Search Vendor");
            System.out.println("0) Home Screen");
            System.out.println("Select an Option");

            String option = scanner.nextLine();
            switch (option){
                case "1":
                    System.out.println("Month to Date");
                case "2":
                    System.out.println("Previous Month");
                case "3":
                    System.out.println("Year to Date");
                case "4"

            }

        }
    }

            }

