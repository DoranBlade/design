package DependenceInversion;

public class App {

    public static void main(String[] args) {
        new Client(new AddComputer()).print();
        new Client(new MinusComputer()).print();
    }

}
