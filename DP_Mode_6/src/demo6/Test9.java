package demo6;

public class Test9 {
    public static void main(String[] args){
        Drink cola = new Cola();
        cola = new AdjIce(cola);
        cola = new AdjWater(cola);

        System.out.println("name:" +cola.getName() +
                ",price:" + cola.price());
    }
}
