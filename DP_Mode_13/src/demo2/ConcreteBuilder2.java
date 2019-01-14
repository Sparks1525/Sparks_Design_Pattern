package demo2;

public class ConcreteBuilder2 extends Builder {

    private Product product = new Product();

    @Override
    public void buildPartA() {
        // TODO 部件X
    }

    @Override
    public void buildPartB() {
        // TODO 部件Y
    }

    @Override
    public Product getResult() {
        return product;
    }

}
