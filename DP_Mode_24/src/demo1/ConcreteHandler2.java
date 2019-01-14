package demo1;

public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(int request) {
        if(request >= 10 && request < 20){
            System.out.println("Done");
        } else if(successor != null){
            successor.handleRequest(request);
        }
    }
}
