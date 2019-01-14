package demo1;

public class OperationSub extends Operation{
    @Override
    public double getResult() {
        return getNumberA() - getNumberB();
    }
}
