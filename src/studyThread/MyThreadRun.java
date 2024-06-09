package studyThread;

public class MyThreadRun implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

}
