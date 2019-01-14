package demo1;

public class ConcreteStateB extends State{
    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateA());
    }
}
