package DependenceInversion;

public class Client2 {

    // 依赖抽象，面向接口
    private Computer computer;

    public Client2(Computer computer) {
        this.computer = computer;
    }

    public void print() {
        System.out.println(computer.compute(2 ,2));
    }

    public static void main(String[] args) {
        new Client2(new AddComputer()).print();
        new Client2(new MinusComputer()).print();
    }
}
