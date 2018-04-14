package decorator;

public abstract class ShowDecorator implements Shower {

    private Shower component;

    public void decorator(Shower component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (component != null) {
            component.show();
        }
    }
}
