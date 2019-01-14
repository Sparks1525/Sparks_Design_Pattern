package demo3;

public class Test {
    public static void main(String[] args){


        Animal dog = AnimalFactory.createCat();
        dog.eat();
        dog.feature();

        Animal cow = AnimalFactory.createCow();
        cow.eat();
        cow.feature();

    }
}
