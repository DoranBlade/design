package proxy;

public class Real {

    private String name;

    public Real() {
    }

    public Real(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("real object show");
        System.out.println("name: " + name);
    }
}
