package demo2;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany extends Company{

    private List<Company> children = new ArrayList<>();


    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {
        children.add(c);
    }

    @Override
    public void remove(Company c) {
        children.remove(c);
    }

    @Override
    public void display(Company c) {
        for(Company company : children){

        }
    }

    @Override
    public void lineOfDuty() {
        for(Company company : children){
            company.lineOfDuty();
        }
    }
}
