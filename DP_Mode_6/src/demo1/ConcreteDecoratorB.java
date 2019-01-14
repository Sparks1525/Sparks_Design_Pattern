package demo1;

public class ConcreteDecoratorB extends Decorator{
    @Override
    public void operation() {
        super.operation();
        addedBehavior();
    }

    private void addedBehavior(){

    }
}
