package demo6;

public class Cola extends Drink{

    public Cola(){
        super.setName("Cola");
    }

    @Override
    public int price() {
        return 20;
    }
}
