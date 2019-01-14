package demo6;

public class Test {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {

        User user = new User();
        IUser iu = DataAccess.createUser();
        iu.insert(user);
        iu.getUser(1);

        Department dept = new Department();
        IDepartment id = DataAccess.createDepartment();
        id.insert(dept);
        id.getDepartment(1);
    }
}
