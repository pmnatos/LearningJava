public class SimpleLambda {
    @java.lang.FunctionalInterface
    interface FunctionalInterface{
        public void calculate (Integer a, Integer b);
    }
    public static class DemoClass{
        public DemoClass(FunctionalInterface functionalInterface, Integer a, Integer b) {
            functionalInterface.calculate(a, b);
        }
    }
    public static void main(String[] args) {
        FunctionalInterface x1 = (a,b) -> {
            System.out.println(a+b);}; //Lambda expression
        FunctionalInterface x2 = (a,b) -> System.out.println(a+b); //Lambda expression
        x1.calculate(5, 10);
        x2.calculate(5, 10);
        new DemoClass((a,b) -> System.out.println(a+b), 5, 10);
    }
}
