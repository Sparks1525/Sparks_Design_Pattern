package demo1;

import java.util.ArrayList;
import java.util.List;

public class Boss implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private String action;

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void myNotify() {
        for(Observer observer : observers){
            observer.update();
        }
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
