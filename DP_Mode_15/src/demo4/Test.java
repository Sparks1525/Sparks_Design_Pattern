package demo4;

public class Test {
    public static void main(String[] args){

        IFactory factory = new AccessFactory();

        User user = new User();
        IUser iu = factory.createUser();
        iu.insert(user);
        iu.getUser(1);

        Department dept = new Department();
        IDepartment id = factory.createDepartment();
        id.insert(dept);
        id.getDepartment(1);



    }
}
