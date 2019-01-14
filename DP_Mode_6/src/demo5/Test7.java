package demo5;

public class Test7 {
    public static void main(String[] args){
        Clothes shoes = new Shoes();

        shoes = new Printing(shoes);
        shoes = new Leather(shoes);

        System.out.println("name:" + shoes.getName() +
                ",price:" + shoes.price());
    }
}
