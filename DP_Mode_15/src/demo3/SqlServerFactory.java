package demo3;

public class SqlServerFactory implements IFactory{
    @Override
    public IUser createUser() {
        return new SqlServerUser();
    }
}
