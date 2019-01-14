package demo5;

public abstract class Decoration extends Clothes{

    protected Clothes clothes;
    public Decoration(Clothes clothes){
        this.clothes = clothes;
    }

}
