package demo2;

public class Test26 {
    public static void main(String[] args){
        WebSiteFactory f = new WebSiteFactory();

        WebSite fx = f.getWebSiteCategory("xxx");
        fx.user();

        WebSite fy = f.getWebSiteCategory("xxx");
        fy.user();

        WebSite fz = f.getWebSiteCategory("xxx");
        fz.user();

    }
}
