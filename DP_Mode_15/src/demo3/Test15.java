package demo3;

public class Test15 {
    public static void main(String[] args){
        User user = new User();
        IFactory factory = new SqlServerFactory();
        IUser iu = factory.createUser();
        iu.insert(user);
        iu.update(user);
    }
}
