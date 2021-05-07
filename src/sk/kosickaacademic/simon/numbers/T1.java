package sk.kosickaacademic.simon.numbers;

public class T1 implements Runnable{
    private Number number;
    private Thread t;
    private int n;

    public T1(int n, Number number) {
        this.n = n;
        this.number = number;
        new Thread(this, "Multiply").start();
    }

    @Override
    public void run() {
        int check;
        while(true){
            check = number.multiply(n);
            if(check>10000) break;
        }
    }
}
