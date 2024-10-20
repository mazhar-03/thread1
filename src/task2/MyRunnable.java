package task2;

public class MyRunnable implements Runnable{
    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println(" prints: " + i);
        }
    }
}
