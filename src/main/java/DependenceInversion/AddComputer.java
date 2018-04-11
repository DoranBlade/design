package DependenceInversion;

public class AddComputer implements Computer {

    @Override
    public int compute(int a, int b) {
        return a + b;
    }
}
