package demo4;

public class Test6 {
    public static void main(String[] args) {
        Drink cola = new Cola();
        cola = new AddIce(cola);
        cola = new AddWater(cola);

        System.out.println("name : " + cola.getName() +
                ",price : " + cola.price());

    }
}
