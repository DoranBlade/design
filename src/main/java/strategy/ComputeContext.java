package strategy;

import java.util.Optional;

public class ComputeContext {

    private Compute compute;

    private ComputeContext(Compute compute) {
        this.compute = compute;
    }

    public static Optional<ComputeContext> create(String type) {
        switch (type) {
            case "add":
                return Optional.of(new ComputeContext(new Add()));
            case "minus":
                return Optional.of(new ComputeContext(new Minus()));
        }
        return Optional.empty();
    }

    public int getResult(int a, int b) {
        return compute.compute(a, b);
    }
}
