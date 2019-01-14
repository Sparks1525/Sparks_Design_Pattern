package demo1;

public class SubFactory implements IFactory{
    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}
