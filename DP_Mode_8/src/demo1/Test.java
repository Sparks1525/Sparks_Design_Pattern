package demo1;

public class Test {
    public static void main(String[] args){
        IFactory operFactory = new AddFactory();
        Operation oper = operFactory.createOperation();
        oper.setNumberA(2);
        oper.setNumberB(3);
        double result = oper.getResult();
    }
}
