package demo3;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("eat bone");
    }

    @Override
    public void feature() {
        System.out.println("a dog");
    }
}
