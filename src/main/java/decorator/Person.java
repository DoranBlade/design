package decorator;

public class Person implements Shower {

    @Override
    public void show() {
        System.out.println("show body");
    }

}
