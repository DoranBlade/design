package share;

public class Site {

    protected String type;

    public Site(String type) {
        this.type = type;
    }

    public void User(User user) {
        System.out.println(String.format("site type %s, name %s", this.type, user.getName()));
    }
}
