import java.util.*;
public class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
    }
    public void displayBalance() {
        System.out.println(balance);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String holder = sc.nextLine();
        String accNum = sc.nextLine();
        double bal = sc.nextDouble();
        BankAccount acc = new BankAccount(holder, accNum, bal);
        acc.deposit(sc.nextDouble());
        acc.withdraw(sc.nextDouble());
        acc.displayBalance();
    }
} 