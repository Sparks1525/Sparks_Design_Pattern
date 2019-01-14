package demo1;

public class ConcreteDecoratorA extends Decorator{
    private String addedState;

    @Override
    public void operation() {
        super.operation();
        addedState = "New State";
    }
}
