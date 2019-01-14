package demo1;

public class Test {
    public static void main(String[] args){
        SchoolGirl jiaojiao = new SchoolGirl();
        jiaojiao.setName("jiaojiao");

        Proxy daili = new Proxy(jiaojiao);
        daili.giveChocolate();
        daili.giveDolls();
        daili.giveFlowers();
    }
}
