package demo2;

public class Facade {

    SubSystemOne one;
    SubSysstemTwo two;
    SubSysstemThree three;
    SubSysstemFour four;

    public Facade(){
        one = new SubSystemOne();
        two = new SubSysstemTwo();
        three = new SubSysstemThree();
        four = new SubSysstemFour();
    }

    public void methodA(){
        one.methodOne();
        two.methodTwo();
        four.methodFour();
    }

    public void methodB(){
        two.methodTwo();
        three.methodThree();
    }

}
