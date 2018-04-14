package decorator;

public class TShirtShowDecorator extends ShowDecorator {

    @Override
    public void show() {
        System.out.println("show TShirt");
        super.show();
    }
}
