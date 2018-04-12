package template;

public abstract class Template {

    public void show() {
        System.out.println("client show");
        call();
    }

    public abstract void call();

}
class ChildrenA extends Template {

    @Override
    public void call() {
        System.out.println("ChildrenA call");
    }
}

class ChildrenB extends Template {

    @Override
    public void call() {
        System.out.println("ChildrenB call");
    }
}
