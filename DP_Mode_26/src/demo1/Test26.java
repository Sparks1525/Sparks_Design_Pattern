package demo1;

public class Test26 {
    public static void main(String[] args){
        int extrinsicstate = 22;
        FlyweightFactory f = new FlyweightFactory();

        Flyweight fx = f.getFlyweight("x");

        fx.operation(--extrinsicstate);

        Flyweight fy = f.getFlyweight("y");
        fy.operation(--extrinsicstate);

        Flyweight fz = f.getFlyweight("z");
        fz.operation(--extrinsicstate);

        UnsharedConcreteFlyweight uf = new UnsharedConcreteFlyweight();
        uf.operation(--extrinsicstate);
    }
}
