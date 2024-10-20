package task1;

public class MyThread extends Thread{
    private String threadName;
    public MyThread(String name){
        this.threadName = name;
    }
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(threadName + " is running " +
                    (i + 1));
        }
    }
}
