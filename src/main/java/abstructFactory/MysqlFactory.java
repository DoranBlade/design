package abstructFactory;

public class MysqlFactory implements SqlFactory {

    @Override
    public SqlDriver createDriver() {
        return new MysqlDriver();
    }

    @Override
    public SqlConnect createConnect() {
        return new MysqlConnect();
    }
}
