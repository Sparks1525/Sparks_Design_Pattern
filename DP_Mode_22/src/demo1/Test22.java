package demo1;

public class Test22 {
    public static void main(String[] args){
        HandsetBrand ab;

        ab = new HandsetBrandN();
        ab.setHandsetSoft(new HandsetGame());
        ab.run();

        ab.setHandsetSoft(new HandsetAddressList());
        ab.run();

        ab = new HandsetBrandM();
        ab.setHandsetSoft(new HandsetGame());
        ab.run();

        ab.setHandsetSoft(new HandsetAddressList());
        ab.run();

    }
}
