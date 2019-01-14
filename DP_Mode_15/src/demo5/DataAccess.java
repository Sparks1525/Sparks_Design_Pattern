package demo5;

public class DataAccess {
    private static String db = "Sqlserver";

    public static IUser createUser() {
        IUser result = null;
        switch (db) {
            case "Sqlserver":
                result = new SqlserverUser();
                break;
            case "Access":
                result = new AccessUser();
                break;
            default:
                break;
        }
        return result;
    }

    public static IDepartment createDepartment() {
        IDepartment result = null;
        switch (db) {
            case "Sqlserver":
                result = new SqlserverDepartment();
                break;
            case "Access":
                result = new AccessDepartment();
                break;
            default:
                break;
        }
        return result;
    }
}
