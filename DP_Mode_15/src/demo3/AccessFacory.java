package demo3;

public class AccessFacory implements IFactory{
    @Override
    public IUser createUser() {
        return new AccessUser();
    }
}
