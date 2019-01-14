package demo1;

public class Test {
    public static void main(String[] args){
        Pen p = new Pen();
        Graphics g = new Graphics();
        PersonBuilder ptb = new PersonThinBuilder(g, p);
        PersonDirector pdThin = new PersonDirector(ptb);
        pdThin.createPerson();
    }
}
