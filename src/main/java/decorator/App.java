package decorator;

public class App {

    public static void main(String[] args) {
        // 添加功能只需要添加装饰器
        Shower shower = new Person();
        ShowDecorator wearShowDecorator = new WearShowDecorator();
        TShirtShowDecorator tShirtPersonDecorator = new TShirtShowDecorator();
        wearShowDecorator.decorator(shower);
        tShirtPersonDecorator.decorator(wearShowDecorator);
        tShirtPersonDecorator.show();
    }
}
