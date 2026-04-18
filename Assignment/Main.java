public class Main {
    public static void main(String[] args) {

        // create 2 objects
        BankAccount b1 = new BankAccount(101, "Hari", 1000);
        BankAccount b2 = new BankAccount(102, "Gita", 2000);

        // operations
        b1.deposit(1000);
        b1.withdraw(300);

        b2.deposit(5000);
        b2.withdraw(1000);

        // display final balance
        b1.display();
        b2.display();
    }
}
