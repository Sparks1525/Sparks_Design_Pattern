package demo5;

public class TShirts extends Clothes{

    public TShirts(){
        super.setName("TShirts");
    }

    @Override
    public int price() {
        return 500;
    }
}
