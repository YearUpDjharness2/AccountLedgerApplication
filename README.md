Overview
The Accounting Ledger App is a simple command-line Java application designed to manage financial transactions,
specifically handling deposits and payments. The app reads transaction data from a CSV file (transactions.csv) and allows the user to perform various operations,
such as displaying all transactions, filtering transactions by vendor, and more.

Features
View All Transactions: Displays a complete list of transactions (payments, deposits) from the CSV file.
Filter by Vendor: Search for transactions related to a specific vendor.
View Deposits: List only the transactions where money has been deposited.
View Payments: List only the transactions where payments were made.
Error Handling: Graceful error handling when the CSV file is not found or other I/O issues occur.

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

Code Explanation
Main.java:

This class contains the entry point of the application and handles the user interface for displaying the menu options and collecting user input.
Transactions.java:

This class is responsible for reading the transactions.csv file and processing the data. It filters transactions based on the user's choice (all deposits, all payments, or by vendor).
AccountingLedgerApp.java:

Contains helper methods for reading, parsing, and filtering transactions from the CSV file.

Reading CSV:

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

