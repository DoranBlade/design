package share;

public class App {

    public static void main(String[] args) {
        Site site1 = SiteFactory.get("博客");
        Site site2 = SiteFactory.get("网站");
        site1.User(new User("d"));
        site2.User(new User("e"));
    }
}
