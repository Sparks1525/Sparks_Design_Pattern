package demo2;

public class Test {
    public static void main(String[] args){
        Person xc = new Person("xiaocai");

        Sneakers pqx = new Sneakers();
        BigTrouser kk = new BigTrouser();
        TShirts dtx = new TShirts();

        pqx.decorate(xc);
        kk.decorate(pqx);
        dtx.decorate(kk);

        dtx.show();
    }
}
