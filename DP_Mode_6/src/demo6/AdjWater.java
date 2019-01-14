package demo6;

public class AdjWater extends Adjunction{
    public AdjWater(Drink drink) {
        super(drink);
    }

    @Override
    public int price() {
        return 50 + drink.price();
    }

    @Override
    public String getName(){
        return "Water " + drink.getName();
    }
}
