package demo4;

public class AddWater extends Kind {
    public AddWater(Drink drink) {
        super(drink);
    }

    @Override
    public int price() {
        return 2 + drink.price();
    }

    public void addWater(){
        System.out.println("饮料兑水....尴尬不老铁...");
    }

    @Override
    public String getName() {
        addWater();
        return "兑水了的" + drink.getName();
    }

}
