package demo1;

import java.util.Hashtable;

public class FlyweightFactory {

    private Hashtable flyweights = new Hashtable();

    public FlyweightFactory(){
        flyweights.put("x",new ConcreteFlyweight());
        flyweights.put("y",new ConcreteFlyweight());
        flyweights.put("z",new ConcreteFlyweight());
    }

    public Flyweight getFlyweight(String key){
        return ((Flyweight)flyweights.get(key));
    }
}
