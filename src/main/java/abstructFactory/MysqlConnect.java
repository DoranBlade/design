package abstructFactory;

public class MysqlConnect implements SqlConnect {

    @Override
    public void connect() {
        System.out.println("mysql connect...");
    }
}
