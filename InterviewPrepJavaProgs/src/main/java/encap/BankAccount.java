package encap;

public class BankAccount {
    private int balance = 1000; // HIDDEN from outside

    public int getBalance() {
        return balance; // only show if asked
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount; // only add valid amount
        }
    }

    public static void main(String[] args) {
        BankAccount b1= new BankAccount();
        b1.deposit(1000);
        System.out.println(b1.getBalance());
    }
}
