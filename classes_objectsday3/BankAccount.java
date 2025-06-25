
class BankAccount {
    private static String bankName = "ABC Bank";
    private static int totalAccounts = 0;
    private String accountHolderName;
    private final String accountNumber;

    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        }
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("John Doe", "12345");
        BankAccount acc2 = new BankAccount("Jane Smith", "67890");
        acc1.displayDetails();
        acc2.displayDetails();
        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());
    }
} 