package sk.kosickaacademic.simon.numbers;

public class T2 implements Runnable{
    private Number number;
    private Thread t;
    private int n;

    public T2(Number number) {
        this.n = n;
        this.number = number;
        new Thread(this, "Sum").start();
    }

    @Override
    public void run() {
        int check;
        while(true){
            check = number.sum();
            if(check>10000) break;
        }
    }
}
