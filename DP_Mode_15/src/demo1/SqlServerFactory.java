package demo1;

public class SqlServerFactory implements IFactory{
    @Override
    public IUser createUser() {
        return new SqlserverUser();
    }
}
