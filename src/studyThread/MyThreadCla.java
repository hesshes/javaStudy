package studyThread;

public class MyThreadCla extends Thread {

    public void run() {
        System.out.println("this.getName : " + this.getName());
    }

}
