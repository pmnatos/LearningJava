package Lambda;

public class ThreadLambda {
    public static void main(String[] args) {
        new Thread(() -> {

            System.out.println("Starting a new thread");
        },"Thread2").start();

        Runnable runnable = ()->{
            System.out.println("Starting a new thread via runnable object");
        };

        new Thread(runnable, "Thread2").start();
    }
}
