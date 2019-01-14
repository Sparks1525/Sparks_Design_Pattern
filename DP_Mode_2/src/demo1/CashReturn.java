package demo1;

public class CashReturn implements CashSuper{

    private double moneyCondition = 0.0d;
    private double moneyReturn = 0.0d;

    public CashReturn(double moneyCondition, double moneyReturn){
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if(money >= moneyCondition){
            result = money - money / moneyCondition * moneyReturn;
        }
        return 0;
    }
}
