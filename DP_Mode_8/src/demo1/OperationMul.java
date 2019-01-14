package demo1;

public class OperationMul extends Operation{
    @Override
    public double getResult() {
        return getNumberA() * getNumberB();
    }
}
