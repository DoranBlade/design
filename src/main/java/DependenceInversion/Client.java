package DependenceInversion;

public class Client {

    // 依赖抽象，面向接口
    private Computer computer;

    public Client(Computer computer) {
        this.computer = computer;
    }

    public void print() {
        System.out.println(computer.compute(2 ,2));
    }

}
