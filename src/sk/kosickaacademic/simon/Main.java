package sk.kosickaacademic.simon;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main started.");
        MyThread thread1 = new MyThread("Thread 1", 10);
        MyThread thread2 = new MyThread("Thread 2", 1);
        //thread1.start();
        //thread2.start();
        PrimeNumberThread pnt = new PrimeNumberThread("ThreadPNT", 103);
        //pnt.start();

        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    System.out.println("Thread producer is running.");
                    synchronized (this) { wait(); }
                    System.out.println("Thread producer is running again.");
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }

            public void start(){ this.run(); }
        });
        Thread consumer = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    System.out.println("Thread consumer is running.");
                    Thread.sleep(5000);
                    //notify();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }

            public void start(){ this.run(); }
        });
        producer.start();
        consumer.start();

        System.out.println("Main ended.");
    }
}
