package demo5;

public class Leather extends Decoration{
    public Leather(Clothes clothes) {
        super(clothes);
    }

    @Override
    public int price() {
        return 100 + clothes.price();
    }

    @Override
    public String getName() {
        return "Leather " + clothes.getName();
    }
}
