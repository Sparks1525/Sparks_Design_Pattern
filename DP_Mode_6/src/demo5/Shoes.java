package demo5;

public class Shoes extends Clothes{

    public Shoes(){
        super.setName("Shoes");
    }

    @Override
    public int price() {
        return 100;
    }
}
