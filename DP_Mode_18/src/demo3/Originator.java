package demo3;

public class Originator {

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Memento createMemento(){

        Memento memento = new Memento();
        memento.setState(state);
        return memento;
    }

    public void setMemento(Memento memento){
        this.state = memento.getState();
    }

}
