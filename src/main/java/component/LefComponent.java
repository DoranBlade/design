package component;

public class LefComponent extends Component {

    public LefComponent(String name) {
        super(name);
    }

    @Override
    void add(Component component) {
        System.out.println("lef component not support add");
    }

    @Override
    void remove(Component component) {
        System.out.println("lef component not support remove");
    }

    @Override
    void display() {
        System.out.println("lef component: " + name);
    }
}
