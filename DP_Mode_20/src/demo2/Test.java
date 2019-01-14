package demo2;

public class Test {
    public static void main(String[] args){
        ConcreteAggregate a = new ConcreteAggregate();
        a.set("a");
        a.set("b");

        Iterator iterator = a.createIterator();
        while (iterator.isDone()){
            iterator.next();
        }
    }
}
