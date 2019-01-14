package demo1;

public class Test20 {
    public static void main(String[] args){
        List list = new ConcreteAggregate();
        list.add("a");
        list.add("b");
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
