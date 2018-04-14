package template;

public class App {

    public static void main(String[] args) {
        Template templateA = new ChildrenA();
        Template templateB = new ChildrenB();
        templateA.show();
        templateB.show();
    }
}
