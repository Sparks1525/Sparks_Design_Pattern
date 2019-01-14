package demo2;

public class USA extends Country{
    public USA(UnitedNations mediator) {
        super(mediator);
    }
    public void declare(String message){
        mediator.declare(message,this);
    }

    public void getMessage(String message){
        System.out.println();
    }
}
