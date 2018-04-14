package builder;

public class Director {

    private Builder builder;

    public void construct(Builder builder) {
        this.builder = builder;
    }

    public Product builder() {
        builder.buildStudy();
        builder.buildWork();
        return builder.buildFun();
    }
}
