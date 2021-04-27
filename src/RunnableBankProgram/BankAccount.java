package RunnableBankProgram;

public class BankAccount {
    private double balance;                        //for account balance
    public BankAccount(double openingBalance)      //Constructor
    {
        balance = openingBalance;
    }
    public void deposit(double amount)             // deposit function
    {
        balance = balance + amount;
    }
    public void withdraw(double amount)           // withdrawal function
    {
        balance = balance - amount;
    }
    public void display()                         // display function
    {
        System.out.println("remaining balance is="+ balance);
    }

}
