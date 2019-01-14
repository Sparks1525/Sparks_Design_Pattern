package demo2;

public class Test {
    public static void main(String[] args){
        Player b= new Forwards("");
        b.attack();

        Player ym = new Translator("ym");
        ym.attack();
        ym.defense();
    }
}
