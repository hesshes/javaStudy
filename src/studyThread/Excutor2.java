package studyThread;

public class Excutor2 {
    public static void main(String[] args) {

        Thread th = new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("익명 클래스로 스레드 생성");
            }
        });
        th.start();

        Thread th2 = new Thread(() -> {
            System.out.println("Lamda Thread 생성");
        });
        th2.start();

    }

}
