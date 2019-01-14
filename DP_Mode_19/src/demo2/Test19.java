package demo2;

public class Test19 {
    public static void main(String[] args){
        ConcreteCompany root = new ConcreteCompany("zonggingsi");

        root.add(new HRDepartment("zonggongsiHR"));
        root.add(new FinanceDepartment("zonggongsiFD"));

        ConcreteCompany comp = new ConcreteCompany("fenggongsi");
        comp.add(new HRDepartment("fenggongsiHR"));
        comp.add(new FinanceDepartment("fenggongsiFD"));
        root.add(comp);

        ConcreteCompany comp1 = new ConcreteCompany("fenggongsi");
        comp1.add(new HRDepartment("fenggongsiHR"));
        comp1.add(new FinanceDepartment("fenggongsiFD"));
        comp.add(comp1);
    }
}
