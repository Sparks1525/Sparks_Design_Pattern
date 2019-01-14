package demo3;

public class CashRebate implements CashSuper {

    private double moneyRebate = 1L;

    public CashRebate(double moneyRebate){
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return moneyRebate * money;
    }
}
