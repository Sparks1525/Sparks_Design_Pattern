package demo2;

public class Translator extends Player{

    private ForeignCenter wjzf = new ForeignCenter();

    public Translator(String name) {
        super(name);
    }

    @Override
    public void attack() {
        wjzf.jingong();
    }

    @Override
    public void defense() {
        wjzf.fangshou();
    }
}
