package demo3;

public class Test5 {
    public static void main(String[] args){
        Student st = new Student("xiaocai");

        BigTrouser bt = new BigTrouser();
        TShirts ts = new TShirts();

        bt.Decorate(st);
        ts.Decorate(bt);

        ts.show();
    }
}
