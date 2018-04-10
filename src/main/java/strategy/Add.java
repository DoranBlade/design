package strategy;

public class Add implements Compute {
    @Override
    public int compute(int a, int b) {
        return a + b;
    }
}
