package strategy;

public class Minus implements Compute {

    @Override
    public int compute(int a, int b) {
        return a - b;
    }
}
