package demo3;

public class Boss implements Subject{

    public EventHandler update;

    private String action;

    @Override
    public void myNotify() {
        update.update();
    }

    @Override
    public String getSubjectState() {
        return action;
    }

    @Override
    public void setSubjectState(String state) {
        this.action = state;
    }
}
