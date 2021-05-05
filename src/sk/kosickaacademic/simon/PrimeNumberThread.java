package sk.kosickaacademic.simon;

public class PrimeNumberThread implements Runnable {
    private String threadName;
    private int base;
    private Thread t;

    public PrimeNumberThread(String threadName, int base) {
        this.threadName = threadName;
        this.base = base;
    }

    @Override
    public void run() {
        int n=base+1;
        while(true){
            int count=0;
            for(int i=2; i<n; i++) if(n%i==0) count++;
            if(count==0){
                System.out.println("Number " +n +" is a prime number.");
                break;
            }
            n++;
        }
    }

    public void start(){
        if(t == null){
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
