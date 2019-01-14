package demo4;

public class Beer extends Drink{
    public Beer(){
        name = "Beer";
    }

    @Override
    public int price() {
        return 3;
    }
}
