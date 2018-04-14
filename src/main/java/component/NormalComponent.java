package component;

import java.util.ArrayList;
import java.util.List;

public class NormalComponent extends Component {

    private List<Component> components = new ArrayList<>();

    public NormalComponent(String name) {
        super(name);
    }

    @Override
    void add(Component component) {
        components.add(component);
    }

    @Override
    void remove(Component component) {
        component.remove(component);
    }

    @Override
    void display() {
        System.out.println("component children size: " + components.size());
    }
}
