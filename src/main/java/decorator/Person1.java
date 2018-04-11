package decorator;

public class Person1 {

    public void show() {
        System.out.println("show body");
    }

    // 添加功能，需要更改类本身和调用客户端
    public void showWear() {
        System.out.println("show Wear");
    }

    public static void main(String[] args) {
        Person1 person1 = new Person1();
        person1.show();
        // 添加功能
        person1.showWear();
    }
}
