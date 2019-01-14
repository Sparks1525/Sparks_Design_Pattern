package demo1;

public class ConcreteHandler3 extends Handler {
    @Override
    public void handleRequest(int request) {
        if(request >= 20 && request < 30){
            System.out.println("Done");
        } else if(successor != null){
            successor.handleRequest(request);
        }
    }
}
