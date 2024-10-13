// BankingSystem.java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Class to represent a transaction
class Transaction {
    private String type;
    private double amount;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public String getTransactionDetails() {
        return type + ": $" + amount;
    }
}

// Class to represent a bank account
class Account {
    private String accountNumber;
    private String owner;
    private double balance;
    private List<Transaction> transactions;

    public Account(String accountNumber, String owner) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add(new Transaction("Deposit", amount));
            System.out.println("Successfully deposited $" + amount);
        } else {
            System.out.println("Invalid amount for deposit!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactions.add(new Transaction("Withdrawal", amount));
            System.out.println("Successfully withdrew $" + amount);
        } else {
            System.out.println("Invalid amount or insufficient balance for withdrawal!");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Owner: " + owner);
        System.out.println("Balance: $" + balance);
        System.out.println("Transaction History: ");
        if (transactions.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            for (Transaction transaction : transactions) {
                System.out.println(transaction.getTransactionDetails());
            }
        }
    }
}

// Class to represent a bank customer
class Customer {
    private String name;
    private String customerID;
    private List<Account> accounts;

    public Customer(String name, String customerID) {
        this.name = name;
        this.customerID = customerID;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getCustomerID() {
        return customerID;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void createAccount(String accountNumber) {
        accounts.add(new Account(accountNumber, name));
        System.out.println("Account created successfully for customer " + name);
    }

    public void displayCustomerInfo() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer ID: " + customerID);
        System.out.println("Number of Accounts: " + accounts.size());
        if (!accounts.isEmpty()) {
            for (Account account : accounts) {
                account.displayAccountInfo();
            }
        } else {
            System.out.println("No accounts associated with this customer.");
        }
    }
}

// Class to represent the bank
class Bank {
    private String bankName;
    private List<Customer> customers;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public Customer getCustomerByID(String customerID) {
        for (Customer customer : customers) {
            if (customer.getCustomerID().equals(customerID)) {
                return customer;
            }
        }
        return null;
    }

    public void displayAllCustomers() {
        if (customers.isEmpty()) {
            System.out.println("No customers found.");
        } else {
            for (Customer customer : customers) {
                customer.displayCustomerInfo();
            }
        }
    }
}

// Main class that handles the banking system
public class BankingSystem {
    private static Bank bank = new Bank("MyBank");
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println("\n===== Banking System Menu =====");
            System.out.println("1. Add Customer");
            System.out.println("2. Create Account for Customer");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Display Customer Information");
            System.out.println("6. Display All Customers");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    addCustomer();
                    break;
                case 2:
                    createAccount();
                    break;
                case 3:
                    depositMoney();
                    break;
                case 4:
                    withdrawMoney();
                    break;
                case 5:
                    displayCustomerInfo();
                    break;
                case 6:
                    displayAllCustomers();
                    break;
                case 7:
                    running = false;
                    System.out.println("Exiting the banking system.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private static void addCustomer() {
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter customer ID: ");
        String customerID = scanner.nextLine();
        Customer customer = new Customer(name, customerID);
        bank.addCustomer(customer);
        System.out.println("Customer added successfully.");
    }

    private static void createAccount() {
        System.out.print("Enter customer ID: ");
        String customerID = scanner.nextLine();
        Customer customer = bank.getCustomerByID(customerID);
        if (customer != null) {
            System.out.print("Enter new account number: ");
            String accountNumber = scanner.nextLine();
            customer.createAccount(accountNumber);
        } else {
            System.out.println("Customer not found.");
        }
    }

    private static void depositMoney() {
        System.out.print("Enter customer ID: ");
        String customerID = scanner.nextLine();
        Customer customer = bank.getCustomerByID(customerID);
        if (customer != null) {
            System.out.print("Enter account number: ");
            String accountNumber = scanner.nextLine();
            Account account = findAccount(customer, accountNumber);
            if (account != null) {
                System.out.print("Enter amount to deposit: ");
                double amount = scanner.nextDouble();
                account.deposit(amount);
            } else {
                System.out.println("Account not found.");
            }
        } else {
            System.out.println("Customer not found.");
        }
    }

    private static void withdrawMoney() {
        System.out.print("Enter customer ID: ");
        String customerID = scanner.nextLine();
        Customer customer = bank.getCustomerByID(customerID);
        if (customer != null) {
            System.out.print("Enter account number: ");
            String accountNumber = scanner.nextLine();
            Account account = findAccount(customer, accountNumber);
            if (account != null) {
                System.out.print("Enter amount to withdraw: ");
                double amount = scanner.nextDouble();
                account.withdraw(amount);
            } else {
                System.out.println("Account not found.");
            }
        } else {
            System.out.println("Customer not found.");
        }
    }

    private static void displayCustomerInfo() {
        System.out.print("Enter customer ID: ");
        String customerID = scanner.nextLine();
        Customer customer = bank.getCustomerByID(customerID);
        if (customer != null) {
            customer.displayCustomerInfo();
        } else {
            System.out.println("Customer not found.");
        }
    }

    private static void displayAllCustomers() {
        bank.displayAllCustomers();
    }

    private static Account findAccount(Customer customer, String accountNumber) {
        for (Account account : customer.getAccounts()) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
}
