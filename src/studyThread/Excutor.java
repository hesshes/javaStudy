package studyThread;

public class Excutor {

    public static void main(String[] args) {
        new MyThreadCla().run(); // 클래스 상송 받은 스레드
        Runnable t2 = new MyThreadRun(); // 인터페이스 구현한 스레드
        new Thread(t2).start();   
    }

}
