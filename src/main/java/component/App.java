package component;

public class App {

    public static void main(String[] args) {
        Component root = new NormalComponent("root");
        root.add(new LefComponent("lef a"));
        root.add(new LefComponent("lef b"));
        Component children = new NormalComponent("children");
        children.add(new LefComponent("child lef a"));
        root.add(children);
        root.display();
    }
}
