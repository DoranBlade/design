package decorator;

public class Person2 {

    public void show() {
        System.out.println("show body");
    }

    public static void main(String[] args) {
        // 添加功能只需要添加装饰器
        Person2 person = new Person2();
        PersonDecorator wearPersonDecorator = new WearPersonDecorator();
        TShirtPersonDecorator tShirtPersonDecorator = new TShirtPersonDecorator();
        wearPersonDecorator.decorator(person);
        tShirtPersonDecorator.decorator(wearPersonDecorator);
        tShirtPersonDecorator.show();
    }
}
