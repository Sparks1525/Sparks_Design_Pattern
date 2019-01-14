package demo4;

public class AnimalContext {

    private Animal animal;

    public void createCat(){
        animal = new Cat();
    }

    public void createDog(){
        animal = new Dog();
    }

    public void animalContext(){
        animal.eat();
        animal.feature();
    }


}
