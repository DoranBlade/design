package openClosePrinciple;

public class Client2 {

    // 多变的位置抽象出来，方便扩充和修改
    private Compute compute;

    public Client2() {
    }

    public Client2(Compute compute) {
        this.compute = compute;
    }

    /**
     * 如果需要修改计算方式，则只需要修改该类的使用使用方，不需要修改本类
     */
    public void print() {
        System.out.println(compute.compute(2, 2));
    }

    public static void main(String[] args) {
        Client2 client2 = new Client2(new AddCompute());
        client2.print();
    }
}
