package demo1;

public class OperationAdd extends Operation{
    @Override
    public double getResult() {
        return getNumberA() + getNumberB();
    }
}
