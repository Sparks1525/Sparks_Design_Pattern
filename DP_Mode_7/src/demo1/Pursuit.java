package demo1;

public class Pursuit implements GiveGift{

    SchoolGirl mm;
    public Pursuit(SchoolGirl mm){
        this.mm = mm;
    }

    @Override
    public void giveDolls() {
        System.out.println(mm.getName() + ",giveDolls");
    }

    @Override
    public void giveFlowers() {
        System.out.println(mm.getName() + ",giveFlowers");
    }

    @Override
    public void giveChocolate() {
        System.out.println(mm.getName() + ",giveChocolate");
    }
}
