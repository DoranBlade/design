package DependenceInversion;

public class Client1 {

    // 依赖了实现细节，后续调整需要调整类本身
    private AddComputer computer;

    public Client1(AddComputer computer) {
        this.computer = computer;
    }

    public void print() {
        System.out.println(computer.compute(2, 2));
    }

    public static void main(String[] args) {
        new Client1(new AddComputer()).print();
        // 无法调整
//        new Client1(new MinusComputer()).print();
    }
}
