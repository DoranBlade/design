package bridge;

public class App {

    public static void main(String[] args) {
        Abstraction abstraction = new AbstractionA(new ImplementorA());
        Abstraction abstraction1 = new AbstractionA(new ImplementorB());
        abstraction.operation();
        abstraction1.operation();
    }
}
