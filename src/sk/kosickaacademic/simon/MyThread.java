package sk.kosickaacademic.simon;

public class MyThread extends Thread{
    private String threadName;
    private int priority;
    private Thread t;

    public MyThread(String threadName, int priority) {
        this.threadName = threadName;
        this.priority = priority;
        System.out.println("Thread " +threadName +" created.");
    }

    @Override
    public void run() {
        System.out.println("Thread " +threadName +" started.");
        try{
            for(int i=1; i<=10; i++) {
                System.out.println(threadName +" Value: " +i);
                Thread.sleep(0);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Thread " +threadName +" ended.");
    }

    public void start() {
        System.out.println("Thread " +threadName +" is running.");
        if(t == null){
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
