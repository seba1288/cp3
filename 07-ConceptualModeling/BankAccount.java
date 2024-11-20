public class BankAccount {
    private String accountNumber;
    private double balance;
    private String[] transactionsHistory = new String[3];
    private int transactionCount = 0;


    
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amount) {
        balance += amount;
        transactionsHistory[transactionCount] ="Deposit of " + String.valueOf(amount);
        transactionCount++;   
    }
    
    public void withdraw(double amount) {
        if (amount <= 500) {
            if(balance >= amount) {
            balance -= amount;
            transactionsHistory[transactionCount] ="Withdrawal of " + String.valueOf(amount); 
            transactionCount++;   

        }
        else {
            System.out.println("insufficent funds");
        }
        }
        else {
            System.out.println("You can only withdraw 500 at a time");
        }
    };

    public void history() {
        for (int i = 0; i < transactionCount; i++) {
            System.out.println(transactionsHistory[i]);
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("1234", 1000);
        account.deposit(500);
        account.withdraw(200);
        account.withdraw(600);
        account.withdraw(500);
        account.history();
    }
}
