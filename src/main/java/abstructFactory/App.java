package abstructFactory;

public class App {

    public static void main(String[] args) {
        SqlFactory sqlFactory = new MysqlFactory();
        SqlDriver sqlDriver = sqlFactory.createDriver();
        SqlConnect sqlConnect = sqlFactory.createConnect();
        System.out.println(sqlDriver.getDriver());
        sqlConnect.connect();

        SqlFactory sqlFactory1 = new MssqlFactory();
        SqlDriver sqlDriver1 = sqlFactory1.createDriver();
        SqlConnect sqlConnect1 = sqlFactory1.createConnect();
        System.out.println(sqlDriver1.getDriver());
        sqlConnect1.connect();
    }
}
