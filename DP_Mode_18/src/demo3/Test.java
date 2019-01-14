package demo3;

public class Test {
    public static void main(String[] args){
        Originator o = new Originator();
        State state1 = new State();
        o.setState(state1);


        Caretaker c = new Caretaker();
        c.setMemento(o.createMemento());

        State state2 = new State();
        o.setState(state2);

        o.setMemento(c.getMemento());
    }
}
