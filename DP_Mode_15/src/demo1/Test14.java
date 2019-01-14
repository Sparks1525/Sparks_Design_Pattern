package demo1;

public class Test14 {
    public static void main(String[] args){
        User user = new User();

        IFactory factory = new SqlServerFactory();
        IUser iu = factory.createUser();

        iu.inser(user);
        iu.getUser(1);
    }
}
