package demo2;



public class Test25 {
    public static void main(String[] args){
        UnitedNationsSecurityCouncil UNSC = new UnitedNationsSecurityCouncil();

        USA c1 = new USA(UNSC);
        Iraq c2 = new Iraq(UNSC);

        UNSC.setColleague1(c1);
        UNSC.setColleague2(c2);

        c1.declare("");
        c2.declare("");

    }
}
