package builder;

public class App {

    public static void main(String[] args) {
        Builder builder1 = new ChildrenBuilder();
        Builder builder2 = new MenBuilder();
        Director director = new Director();
        director.construct(builder1);
        Product product1 = director.builder();
        director.construct(builder2);
        Product product2 = director.builder();
        product1.show();
        product2.show();
    }
}
