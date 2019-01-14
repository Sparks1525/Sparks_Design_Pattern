package demo1;

public class Test {
    public static void main(String[] args){
        CashSuper cashSuper = CashFactory.createCashAccept("打8折");
        cashSuper.acceptCash(1000);
    }
}
