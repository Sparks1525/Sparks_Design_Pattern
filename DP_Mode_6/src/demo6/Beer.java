package demo6;

public class Beer extends Drink{

    public Beer(){
        super.setName("Beer");
    }

    @Override
    public int price() {
        return 50;
    }
}
