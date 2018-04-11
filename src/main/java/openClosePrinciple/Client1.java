package openClosePrinciple;

public class Client1 {

    /**
     * 如果需要修改计算方式，则需要修改该类
     */
    public void print() {
        System.out.println(add(2, 2));
    }


    private int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        new Client1().print();
    }
}
