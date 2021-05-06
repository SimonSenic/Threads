package sk.kosickaacademic.simon.chat;

public class T2 implements Runnable{
    private Chat chat;
    private Thread t;
    private String[] a = { "Ey","Im doin' good, man..","Goodbye" };

    public T2(Chat chat) {
        this.chat = chat;
        new Thread(this, "Answer").start();
    }

    @Override
    public void run(){
        for(String answer:a)
            chat.answer(answer);
    }
}
