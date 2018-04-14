package builder;

public class ChildrenBuilder extends Builder {

    @Override
    public Product buildWork() {
        product.add("not work");
        return product;
    }

    @Override
    public Product buildFun() {
        product.add("game");
        return product;
    }

    @Override
    public Product buildStudy() {
        product.add("read book");
        return product;
    }
}
