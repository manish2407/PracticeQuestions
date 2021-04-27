package RunnableBankProgram;

public class BankApp {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(100.0);
        System.out.println("before transation");
        b1.display();
        b1.deposit(50.0);
        System.out.println("After deposit");
    }
}
