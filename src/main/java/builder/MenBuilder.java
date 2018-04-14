package builder;

public class MenBuilder extends Builder {

    @Override
    public Product buildWork() {
        product.add("code");
        return product;
    }

    @Override
    public Product buildFun() {
        product.add("watch tv");
        return product;
    }

    @Override
    public Product buildStudy() {
        product.add("write");
        return product;
    }
}
