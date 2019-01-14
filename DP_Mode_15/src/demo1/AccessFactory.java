package demo1;

public class AccessFactory implements IFactory{
    @Override
    public IUser createUser() {
        return new AccessUser();
    }
}
