package se.dsve;

public class BankAccount {
    int accountNumber;
    double balance;


    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void info() {
        System.out.println("Account number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public void transferFunds(BankAccount from, BankAccount to, double amount) {

        from.balance = from.balance - amount;
        to.balance = to.balance + amount;
    }
}
