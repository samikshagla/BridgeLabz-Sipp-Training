package Encapsulation_Polymorphism_interface_Abstract_class;

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }
    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { if (balance >= amount) balance -= amount; }
    public abstract double calculateInterest();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }
    @Override
    public double calculateInterest() { return getBalance() * 0.04; }
    @Override
    public void applyForLoan(double amount) { System.out.println("Savings Account Loan Applied: " + amount); }
    @Override
    public boolean calculateLoanEligibility() { return getBalance() > 1000; }
}

class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }
    @Override
    public double calculateInterest() { return getBalance() * 0.02; }
    @Override
    public void applyForLoan(double amount) { System.out.println("Current Account Loan Applied: " + amount); }
    @Override
    public boolean calculateLoanEligibility() { return getBalance() > 5000; }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount[] accounts = {
            new SavingsAccount("SA123", "Alice", 5000),
            new CurrentAccount("CA456", "Bob", 10000)
        };
        for (BankAccount acc : accounts) {
            System.out.println(acc.getHolderName() + " | Interest: " + acc.calculateInterest());
            if (acc instanceof Loanable) {
                ((Loanable)acc).applyForLoan(2000);
                System.out.println("Loan Eligible: " + ((Loanable)acc).calculateLoanEligibility());
            }
            System.out.println();
        }
    }
} 