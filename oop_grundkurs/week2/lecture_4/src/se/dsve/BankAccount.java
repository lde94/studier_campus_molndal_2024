package se.dsve;

public class BankAccount {
    private double balance;

    public void getBalance(){
        System.out.println("Balance: " + balance);
    }

    public void deposit(double amount){
        if(amount > 0) {
            balance += amount;
            System.out.println("New balance: " + balance);
        }
        else {
            System.out.println("Deposit cant be negative.");
            getBalance();
        }
    }
    public void withdraw(double amount){
        /*if(balance < amount) {
            System.out.println("Not enough balance on account.");
            getBalance();
        } else if (amount < 0) {
            System.out.println("Withdraw cant be negative.");
        }
        else {
            balance -= amount;
        }*/
        if(balance < amount || amount < 0) {
            System.out.println("Not enough balance on account or you gave a " +
                    "negative number");
        }
        else {
            balance -= amount;
        }
        getBalance();
    }
}
