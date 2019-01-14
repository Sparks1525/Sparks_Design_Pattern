package demo1;

public class ConcreteHandler1 extends Handler {
    @Override
    public void handleRequest(int request) {
        if(request >= 0 && request < 10){
            System.out.println("Done");
        } else if(successor != null){
            successor.handleRequest(request);
        }
    }
}
