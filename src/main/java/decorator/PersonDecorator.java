package decorator;

public abstract class PersonDecorator extends Person2 {

    private Person2 component;

    public void decorator(Person2 component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (component != null) {
            component.show();
        }
    }
}
