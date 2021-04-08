package Thread;

public class ExampleThreadClass extends Thread{
    Integer num = 5;

    ExampleThreadClass(String threadName){
        super(threadName);
    }

    @Override
    public void run() {
        System.out.println(String.format("%s - START ",Thread.currentThread().getName()));
        System.out.println("Adding 5 to the existing value");
        this.num += 5;
        System.out.println("New value: " + num);
        System.out.println(String.format("%s - END ",Thread.currentThread().getName()));
    }
}
