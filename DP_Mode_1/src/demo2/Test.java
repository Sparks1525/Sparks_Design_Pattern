package demo2;

public class Test {
    public static void main(String[] args){


        Person st1 = PersonFactory.createStudent();
        st1.setName("st1");
        st1.setAge(19);

        System.out.println(st1.getName() + ":");
        st1.say();
    }
}
