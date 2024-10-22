# Overview
The Accounting Ledger App is a simple command-line Java application designed to manage financial transactions,
specifically handling deposits and payments. The app reads transaction data from a CSV file (transactions.csv) and allows the user to perform various operations,
such as displaying all transactions, filtering transactions by vendor, and more.

 ## Features
View All Transactions: Displays a list of transactions (payments, deposits) from the CSV file.
Filter by Vendor: Searches for transactions related to a specific vendor.
View Deposits: Lists only the transactions where money has been deposited.
View Payments: Lists only the transactions where payments were made.


Ensure the transactions.csv file is placed in the resources folder: The CSV file should contain transaction data formatted 

When you run the application, a menu will be displayed in the console:
Your Ledger Account

Select an Option:
1) All Deposits
2) All Payments
3) Reports

Option 1: All Deposits
Displays all deposit transactions.

Option 2: All Payments
Displays all payment transactions.

Option 3: Reports
Allows you to filter transactions by a specific vendor.

Ensure the transactions.csv file follows these rules:

Date: The date must be in YYYY-MM-DD format.
Time: The time should be in HH:MM:SS format.
Description: This field provides the nature of the transaction 
Vendor: The name of the vendor or the person associated with the transaction.
Amount: The transaction amount should be in decimal format

## Code Explanation
Main.java:

This class contains the entry point of the application and handles the user interface for displaying the menu options and collecting user input.
Transactions.java:

This class is responsible for reading the transactions.csv file and processing the data. It filters transactions based on the user's choice (all deposits, all payments, or by vendor).
AccountingLedgerApp.java:

Contains helper methods for reading, parsing, and filtering transactions from the CSV file.

 ## Reading CSV:

The program reads the transactions.csv file using a BufferedReader in Transactions.java. Each line is split using a delimiter (|) to extract the date, description, vendor, and amount.
Data Filtering:

The program provides options to filter transactions:
Deposits: Displays only transactions labeled as "Deposit."
Payments: Displays only transactions with descriptions like "Invoice [X] paid."
Reports: Filters transactions by vendor name entered by the user.
Error Handling:

The program uses try-catch blocks to handle I/O exceptions, particularly when dealing with file reading and parsing.
CSV Parsing:

The application assumes that each line of the transactions.csv file is correctly formatted and splits each entry by the pipe (|) character into its corresponding fields.

## Screen Shots


![image](https://github.com/user-attachments/assets/1fd3c19c-6047-41e7-9361-b21de3acc288)

The first option inside the Account Ledger is to add a deposit, this will take your information about your deposit and add it to the ledger. 

![image](https://github.com/user-attachments/assets/13471169-cbe9-477d-bf0c-59ff43dd6ebd)

You could also add a payment to your ledger using "P".

![image](https://github.com/user-attachments/assets/32f2db46-da9c-4d16-be8b-2108841eaf1e)

From the Homescreen, pressing "L" will take you to your ledger. Here you can view all deposits, payments, and view the reports page for more info.


![image](https://github.com/user-attachments/assets/43af71fe-5ae8-4605-89f1-373b0cf5763a)

This is what the payment screen looks like, it displays only the payments you have made

![image](https://github.com/user-attachments/assets/57cfbc7e-5a7d-48d8-9f50-f8d279c3f3a3)

After selecting "R" you will be taken to the reports page where you can find more specific information for exmaple you can search by vendor name to see transactions only by the name searched



