package demo2;

public class AccessFactory implements IFactory{
    @Override
    public IUser createUser() {
        return new AccessUser();
    }
}
