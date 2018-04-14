package adapter;

public class App {

    public static void main(String[] args) {
        Operator operator = new OperatorAdapter(new Student());
        operator.reade();
        operator.write();
        Operator operator1 = new OperatorAdapter(new Coder());
        operator1.reade();
        operator1.write();
    }
}
