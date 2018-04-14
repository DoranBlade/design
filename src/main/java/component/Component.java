package component;

public abstract class Component {

    protected String name;

    public Component(String name) {
        this.name = name;
    }

    abstract void add(Component component);

    abstract void remove(Component component);

    abstract void display();
}
