package com.pluralsight;
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class LedgerClass {

    private List<String> transactions;

    public LedgerClass() {
        transactions = new ArrayList<>();
        loadTransactions();
    }

    private void loadTransactions() {
        try (BufferedReader br = new BufferedReader(new FileReader("Transaction.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                transactions.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }

    public void displayMonthToDate() {
        LocalDate today = LocalDate.now();
        String currentMonth = today.format(DateTimeFormatter.ofPattern("YYYY/MM"));

        System.out.println("Month To Date Transactions");
        for (String transaction : transactions) {
            if (transaction.startsWith(currentMonth)) {
                System.out.println(transaction);
            }
        }
    }
    public void displayPastMonthsTransactions(){
        LocalDate currentDate = LocalDate.now();
        LocalDate pastMonth = currentDate.minusMonths(1);
        String pastMonthStr = pastMonth.format(DateTimeFormatter.ofPattern("YYYY/MM"));

        System.out.println("Transactions of Past Months:");
        for (String transaction : transactions){
            if (transaction.startsWith(pastMonthStr)) {
                System.out.println(transaction);
            }
        }
    }

    public void displayYearToDateTransactions(){
        LocalDate currentDate = LocalDate.now();
        String currentYear = currentDate.format(DateTimeFormatter.ofPattern("YYYY"));

        System.out.println("Transactions Year To Date");
        for (String transaction : transactions){
            if (transaction.startsWith(currentYear)){
                System.out.println(transaction);
            }
        }
    }
    public void displayPastYearTransactions(){
        LocalDate currentDate = LocalDate.now();
        LocalDate pastYear = currentDate.minusYears(1);
        String pastYearStr = pastYear.format(DateTimeFormatter.ofPattern("YYYY"));

        System.out.println("Past Year Transactions");
        for (String transaction : transactions){
            if (transaction.startsWith(pastYearStr)){
                System.out.println(transaction);
            }
        }
    }
    public void searchVendor(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Vendor Name");
        String vendorName = scanner.nextLine().toLowerCase();

        System.out.println("Transactions for Vendor: " + vendorName);
        for (String transaction :  transactions){
            if (transaction.toLowerCase().contains(vendorName)){
                System.out.println(transaction);
            }
        }
    }
    public void displayReports(){
        Scanner scanner = new Scanner(System.in);
        String option = "";

        while (!option.equalsIgnoreCase("H")){
            System.out.println("Reports Menu");
            System.out.println("1) Month to Date");
            System.out.println("2) Past Months");
            System.out.println("3) Year to Date");
            System.out.println("4) Past Year");
            System.out.println("5) Search Vendor");
            System.out.println("H) Home");
            System.out.println("Select an Option: ");
            option = scanner.nextLine();

            switch (option.toUpperCase()){
                case "1":
                    displayMonthToDate();
                    break;
                case "2":
                    displayPastMonthsTransactions();
                    break;
                case "3":
                    displayYearToDateTransactions();
                    break;
                case "4":
                    displayPastYearTransactions();
                    break;
                case "5":
                    searchVendor();
                    break;
                case "H":
                   System.out.println("Back to Home Page");
                   break;
                default:
                    System.out.println("Invalid");
            }

        }
    }


}
