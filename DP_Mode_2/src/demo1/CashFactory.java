package demo1;

public class CashFactory {
    public static CashSuper createCashAccept(String type) {
        CashSuper cs = null;
        switch (type) {
            case "正常收费":
                cs = new CashNormal();
                break;
            case "满300减100":
                cs = new CashReturn(300, 100);
                break;
            case "打8折":
                cs = new CashRebate(0.8);
                break;
            case "打5折":
                cs = new CashRebate(0.5);
                break;
            case "满500送200":
                cs = new CashReturn(500,200);
                break;
            default:
                break;
        }
        return cs;
    }
}
