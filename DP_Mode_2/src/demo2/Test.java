package demo2;

public class Test {
    public static void main(String[] args){
        Context context;
        context = new Context(new ConcreteStrateyA());
        context.ContextInterface();
    }
}
