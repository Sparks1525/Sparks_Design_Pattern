package demo2;

public class ConcreteBuilder1 extends Builder{

    private Product product = new Product();

    @Override
    public void buildPartA() {
        // TODO 部件A
    }

    @Override
    public void buildPartB() {
        // TODO 部件B
    }

    @Override
    public Product getResult() {
        return product;
    }
}
