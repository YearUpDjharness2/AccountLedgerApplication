package com.pluralsight;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
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

    public void displayAll() {
        System.out.println("All transaction");
        for (String transaction : transactions) {
            System.out.println(transaction);
        }
    }
    public void addDeposit

}
