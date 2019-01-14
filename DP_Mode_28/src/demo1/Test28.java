package demo1;

import java.util.ArrayList;
import java.util.List;

public class Test28 {
    public static void main(String[] args){
        List<Person> persons = new ArrayList<>();

        Person man1 = new Man();
        man1.setAction("成功");
        persons.add(man1);


        for(Person item : persons){
            item.getConclusion();
        }
    }
}
