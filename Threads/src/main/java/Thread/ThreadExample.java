package Thread;

public class ThreadExample {

    public static void main(String[] args) {

        ThreadExample threadExample = new ThreadExample();
        System.out.println("***************** Multiple Instance Threads Not Joined ****************************");
        threadExample.differentThreadsOperatingOnDifferentInstancesOfExampleRunnableClassThreadsNotJoined();

        System.out.println("***************** Multiple Instance Threads Joined ****************************");
        threadExample.differentThreadsOperatingOnDifferentInstancesOfExampleRunnableClassThreadsJoined();

        System.out.println("***************** Single Instance Threads Not Joined ****************************");
        threadExample.differentThreadsOperatingOnSingleInstanceOfExampleRunnableClassWithThreadsNotJoined();


        System.out.println("***************** Single Instance Threads Joined ****************************");
        threadExample.differentThreadsOperatingOnSingleInstanceOfExampleRunnableClassWithThreadsJoined();

        System.out.println("***************** All Threads Finished ****************************");

    }

    public void differentThreadsOperatingOnDifferentInstancesOfExampleRunnableClassThreadsJoined(){
        for (Integer i=0;i<4;i++) {
            ExampleThreadClass exampleThreadClass = new ExampleThreadClass("MI_TJ" + i);
            exampleThreadClass.start();
            try {
                exampleThreadClass.join();
            } catch (InterruptedException e) {
                System.out.println("Unable to join the thread : MI_TJ" + i);
            }

        }
    }

    public void differentThreadsOperatingOnDifferentInstancesOfExampleRunnableClassThreadsNotJoined(){
        for (Integer i=0;i<4;i++) {
            ExampleThreadClass exampleThreadClass = new ExampleThreadClass("MI_TNJ" + i);
            exampleThreadClass.start();
        }
    }

    public void differentThreadsOperatingOnSingleInstanceOfExampleRunnableClassWithThreadsNotJoined(){
        ExampleThreadClass exampleThreadClass = new ExampleThreadClass("SI_TNJ");
        exampleThreadClass.start();
    }

    public void differentThreadsOperatingOnSingleInstanceOfExampleRunnableClassWithThreadsJoined(){
        ExampleThreadClass exampleThreadClass = new ExampleThreadClass("SI_TJ");
        exampleThreadClass.start();
        try {
            exampleThreadClass.join();
        } catch (InterruptedException e) {
            System.out.println("Unable to join the thread : SI_TJ");
        }
    }

}
