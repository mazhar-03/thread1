package task4;
public class BankAccount {
    private int balance;
    public BankAccount(int initialBalance){
        this.balance = initialBalance;
    }
    public synchronized void deposit(int amount){
        balance += amount;
        System.out.println("Deposited " + amount + ", New Balance: " + balance);
        notify();
    }
    public synchronized void withdraw(int amount) throws InterruptedException {
        while (balance < amount) {
            System.out.println("Insufficient balance for withdrawal. Waiting for deposit...");
            wait();
        }
        balance -= amount;
        System.out.println("Withdrew " + amount + ", New Balance: " + balance);
    }
    public int getBalance() {
        return balance;
    }
}
