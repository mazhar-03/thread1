package task4;
class WithdrawThread extends Thread {
    private BankAccount account;
    private int withdrawAmount;

    public WithdrawThread(BankAccount account, int withdrawAmount) {
        this.account = account;
        this.withdrawAmount = withdrawAmount;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                account.withdraw(withdrawAmount);
                Thread.sleep(1500); // Simulate time delay for withdrawals
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}