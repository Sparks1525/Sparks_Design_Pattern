package demo1;

public abstract class Handler {
    protected Handler successor;
    public void setSuccessor(Handler successor){
        this.successor = successor;
    }

    public abstract void handleRequest(int request);

}
