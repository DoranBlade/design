package template;

public abstract class Template {

    public void show() {
        System.out.println("client show");
        call();
    }

    public abstract void call();

}


