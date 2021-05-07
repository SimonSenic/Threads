package sk.kosickaacademic.simon.numbers;

public class Number {
    boolean flag = false;
    int res;
    int count = 1;

    public synchronized int multiply(int n){
        if(flag){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        if(count==1) res=n;
        res*=2;
        System.out.println(res);
        flag = true;
        count++;
        notify();
        return res;
    }

    public synchronized int sum(){
        if(!flag){
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        res+=3;
        System.out.println(res);
        flag = false;
        notify();
        return res;
    }
}
