package demo2;

public class Woman extends Person {

    @Override
    public void accept(Action visitor) {
        visitor.getWomenConclusion(this);
    }
}
