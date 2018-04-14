package abstructFactory;

public class MysqlDriver implements SqlDriver {

    @Override
    public String getDriver() {
        return "org.mysql.driver";
    }
}
