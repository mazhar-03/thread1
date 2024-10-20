package task4;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        BankAccount acc = new BankAccount(100);

        DepositThread depositThread = new DepositThread(acc, 40);
        WithdrawThread withdrawThread = new WithdrawThread(acc, 65);

        depositThread.start();
        withdrawThread.start();

        depositThread.join();
        withdrawThread.join();

        System.out.println("Final Balance: " + acc.getBalance());

    }
}
