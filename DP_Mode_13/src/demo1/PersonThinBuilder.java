package demo1;

public class PersonThinBuilder extends PersonBuilder{
    public PersonThinBuilder(Graphics g, Pen p) {
        super(g, p);
    }

    @Override
    public void buildHead() {
        g.drawRectangle(p,1,1,1,1);
    }

    @Override
    public void buildBody() {
        g.drawRectangle(p,1,1,1,1);
    }

    @Override
    public void buildArmLeft() {
        g.drawRectangle(p,1,1,1,1);
    }

    @Override
    public void buildArmRight() {
        g.drawRectangle(p,1,1,1,1);
    }

    @Override
    public void buildLegLeft() {
        g.drawRectangle(p,1,1,1,1);
    }

    @Override
    public void buildLegRight() {
        g.drawRectangle(p,1,1,1,1);
    }
}
