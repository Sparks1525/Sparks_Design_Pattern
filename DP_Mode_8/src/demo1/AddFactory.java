package demo1;

public class AddFactory implements IFactory{
    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
