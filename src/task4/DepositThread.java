package task4;

public class DepositThread extends Thread{
    private BankAccount account;
    private int depositAmount;

    public DepositThread(BankAccount account, int depositAmount) {
        this.account = account;
        this.depositAmount = depositAmount;
    }
    public void run(){
        for (int i = 0; i < 5; i++) {
            account.deposit(depositAmount);
            try {
                Thread.sleep(1000); // Simulate time delay for deposits
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
