package task3;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        CounterThread t1 = new CounterThread(counter);
        CounterThread t2 = new CounterThread(counter);

        t1.run();
        t2.run();

        System.out.println("Final count: " + counter.getCount());
    }
}
