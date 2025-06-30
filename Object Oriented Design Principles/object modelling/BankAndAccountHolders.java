// Problem 2: Bank and Account Holders (Association)
import java.util.ArrayList;
import java.util.List;

class Account {
    private static int nextId = 1;
    private int id;
    private double balance;

    public Account() {
        this.id = nextId++;
        this.balance = 0.0;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}

class Customer {
    private String name;
    private List<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("Balances for " + name + ":");
        for (Account acc : accounts) {
            System.out.println("Account " + acc.getId() + ": $" + acc.getBalance());
        }
    }
}

class Bank {
    private String name;
    private List<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public void openAccount(Customer customer) {
        Account newAccount = new Account();
        customer.addAccount(newAccount);
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        System.out.println("Opened account " + newAccount.getId() + " for " + customer.getName() + " at " + name);
    }
}

public class BankAndAccountHolders {
    public static void main(String[] args) {
        Bank bank = new Bank("National Bank");
        Customer alice = new Customer("Alice");
        Customer bob = new Customer("Bob");

        bank.openAccount(alice);
        bank.openAccount(alice);
        bank.openAccount(bob);

        alice.viewBalance();
        bob.viewBalance();
    }
} 