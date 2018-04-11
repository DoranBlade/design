package decorator;

public class WearPersonDecorator extends PersonDecorator {

    @Override
    public void show() {
        System.out.println("show wear");
        super.show();
    }
}
