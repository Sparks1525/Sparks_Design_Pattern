package demo4;

public class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("eat fish");
    }

    @Override
    public void feature() {
        System.out.println("a cat");
    }
}
