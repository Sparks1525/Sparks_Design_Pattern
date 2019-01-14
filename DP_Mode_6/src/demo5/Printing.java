package demo5;

public class Printing extends Decoration{
    public Printing(Clothes clothes) {
        super(clothes);
    }

    @Override
    public int price() {
        return 50 + clothes.price();
    }

    @Override
    public String getName() {
        return "Printing " + clothes.getName();
    }
}
