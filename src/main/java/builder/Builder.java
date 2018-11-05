package builder;

public abstract class Builder {

    protected Product product;

    public Builder() {
        product = new Product();
    }

    public abstract Product buildWork();

    public abstract Product buildFun();

    public abstract Product buildStudy();
}
