package studyThread;

public class Excutor3 {
    public static void main(String[] args) {
        System.out.println("main thread 우선순위" + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(7);
        System.out.println("main thread 변경후 우선순위" + Thread.currentThread().getPriority());

        System.out.println(Thread.currentThread().getName());

        Thread th1 = new Thread(() -> {
            System.out.println("th1 thread 우선순위 : " + Thread.currentThread().getPriority());
            System.out.println(Thread.currentThread().getName());
        }, "th1");

        Thread th2 = new Thread(() -> {
            Thread.currentThread().setPriority(4);
            System.out.println("th1 thread 우선순위 : " + Thread.currentThread().getPriority());
            System.out.println(Thread.currentThread().getName());
        }, "th2");
        th1.start();
        th2.start();

    }

}
