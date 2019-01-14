package demo6;

public class AdjIce extends Adjunction{
    public AdjIce(Drink drink) {
        super(drink);
    }

    @Override
    public int price() {
        return 5 + drink.price();
    }

    @Override
    public String getName(){
        return "Ice " + drink.getName();
    }
}
