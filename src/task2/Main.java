package task2;

public class Main {
    public static void main(String[] args) {
        MyRunnable runnable1= new MyRunnable();
        Thread thread1 = new Thread(runnable1);

        MyRunnable runnable2= new MyRunnable();
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();
    }
}
