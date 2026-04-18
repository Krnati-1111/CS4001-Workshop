
public class BankAccount {

    int accNo;
    String name;
    double balance;

    // constructor
    BankAccount(int an, String n, double b) {
        accNo = an;
        name = n;
        balance = b;
    }

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        balance = balance - amount;
    }

    void display() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
        System.out.println();
    }
}