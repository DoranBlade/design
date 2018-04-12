package proxy;

public class Proxy extends Real {

    private Real real;

    public Proxy() {
        this.real = new Real();
    }

    public Proxy(String name) {
        this.real = new Real(name);
    }

    @Override
    public void show() {
        System.out.println("proxy do something");
        real.show();
    }

    public static void main(String[] args) {
        new Proxy().show();
    }

}
