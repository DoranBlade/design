package decorator;

public class TShirtPersonDecorator extends PersonDecorator {

    @Override
    public void show() {
        System.out.println("show TShirt");
        super.show();
    }
}
