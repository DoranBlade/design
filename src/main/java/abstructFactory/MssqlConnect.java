package abstructFactory;

public class MssqlConnect implements SqlConnect {

    @Override
    public void connect() {
        System.out.println("mssql connect...");
    }
}
