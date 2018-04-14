package decorator;

public class WearShowDecorator extends ShowDecorator {

    @Override
    public void show() {
        System.out.println("show wear");
        super.show();
    }
}
