package demo1;

public class Test {
    public static void main(String[] args){

        Operation operation = OperationFactory.createOperate("+");
        operation.setNumberA(2);
        operation.setNumberB(4);
        double result = operation.getResult();
        System.out.println(result);

    }
}
