package demo4;

public class AddIce extends Kind{
    public AddIce(Drink drink) {
        super(drink);
    }

    @Override
    public int price() {
        return 5 + drink.price();
    }


    public void addIce(){
        System.out.println("饮料加冰");
    }

    @Override
    public String getName() {
        addIce();
        return "加冰了的" + drink.getName();
    }


}
