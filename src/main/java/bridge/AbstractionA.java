package bridge;

public class AbstractionA extends Abstraction {


    public AbstractionA(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        implementor.operate();
    }
}
