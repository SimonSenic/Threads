package sk.kosickaacademic.simon.chat;

public class T1 implements Runnable{
    private Chat chat;
    private Thread t;
    private String[] q = { "Sup","How u doin?","Bye" };

    public T1(Chat chat) {
        this.chat = chat;
        new Thread(this, "Question").start();
    }

    @Override
    public void run(){
        for(String question:q)
            chat.question(question);
    }
}
