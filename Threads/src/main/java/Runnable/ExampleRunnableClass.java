package Runnable;

public class ExampleRunnableClass implements Runnable {
    private Integer num;
    public ExampleRunnableClass(){
        this.num = 5;
    }
    public void displayNumber(){
        System.out.println("Num value: " + num);
    }
    public void run(){
        System.out.println(String.format("%s - START ",Thread.currentThread().getName()));
        System.out.println("Adding 5 to the existing value");
        this.num += 5;
        System.out.println("New value: " + num);
        System.out.println(String.format("%s - END ",Thread.currentThread().getName()));
    }
}
