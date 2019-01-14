package demo2;

public class SqlServerFactory implements IFactory{
    @Override
    public IUser createUser() {
        return new SqlserverUser();
    }
}
