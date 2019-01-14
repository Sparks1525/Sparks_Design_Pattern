package demo2;

public class ConcreteObserver extends Observer{
    private String name;
    private String observerState;
    private ConcreteSubject subject;

    public ConcreteObserver(ConcreteSubject subject, String name){
        this.subject = subject;
        this.name = name;
    }

    @Override
    public void update() {
        observerState = subject.getSubjectState();
    }

    public ConcreteSubject getSubject() {
        return subject;
    }

    public void setSubject(ConcreteSubject subject) {
        this.subject = subject;
    }
}
