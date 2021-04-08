package Runnable;

public class RunnableExample {
    public static void main(String[] args) {

        RunnableExample runnableExample = new RunnableExample();
        System.out.println("***************** Multiple Instance Threads Not Joined ****************************");
        runnableExample.differentThreadsOperatingOnDifferentInstancesOfExampleRunnableClassThreadsNotJoined();

        System.out.println("***************** Multiple Instance Threads Joined ****************************");
        runnableExample.differentThreadsOperatingOnDifferentInstancesOfExampleRunnableClassThreadsJoined();

        System.out.println("***************** Single Instance Threads Not Joined ****************************");
        runnableExample.differentThreadsOperatingOnSingleInstanceOfExampleRunnableClassWithThreadsNotJoined();

        System.out.println("***************** Single Instance Threads Joined ****************************");
        runnableExample.differentThreadsOperatingOnSingleInstanceOfExampleRunnableClassWithThreadsJoined();

    }

    public void differentThreadsOperatingOnDifferentInstancesOfExampleRunnableClassThreadsJoined(){
        for (Integer i=0;i<4;i++) {
            Thread thread = new Thread(new ExampleRunnableClass(), "MI_TJ" + i);
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                System.out.println("Unable to join the thread : MI_TJ" + i);
            }

        }
    }

    public void differentThreadsOperatingOnDifferentInstancesOfExampleRunnableClassThreadsNotJoined(){
        for (Integer i=0;i<4;i++) {
            Thread thread = new Thread(new ExampleRunnableClass(), "MI_TNJ" + i);
            thread.start();
        }
    }

    public void differentThreadsOperatingOnSingleInstanceOfExampleRunnableClassWithThreadsNotJoined(){
        ExampleRunnableClass exampleRunnableClass = new ExampleRunnableClass();
        for (Integer i=0;i<4;i++){
            Thread thread = new Thread(exampleRunnableClass, "SI_TNJ" + i);
            thread.start();
        }
    }

    public void differentThreadsOperatingOnSingleInstanceOfExampleRunnableClassWithThreadsJoined(){
        ExampleRunnableClass exampleRunnableClass = new ExampleRunnableClass();
        for (Integer i=0;i<4;i++){
            Thread thread = new Thread(exampleRunnableClass, "SI_TJ" + i);
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                System.out.println("Unable to join the thread : SI_TJ" + i);
            }
        }
    }
}
