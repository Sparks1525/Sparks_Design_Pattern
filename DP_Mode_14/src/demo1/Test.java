package demo1;

public class Test {
    public static void main(String[] args){

        Boss boss = new Boss();

        StockObserver tongshi1 = new StockObserver("wei",boss);

        NBAObserver tongshi2 = new NBAObserver("yi",boss);

        boss.attach(tongshi1);
        boss.attach(tongshi2);

        boss.detach(tongshi1);

        boss.setSubjectState("come");

        boss.myNotify();
    }
}
