package demo1;

public class Test24 {
    public static void main(String[] args){
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler1();
        Handler h3 = new ConcreteHandler1();

        h1.setSuccessor(h2);
        h2.setSuccessor(h3);

        int[] requests = {2, 5, 10, 22};

        for(int request : requests){
            h1.handleRequest(request);
        }
    }
}
