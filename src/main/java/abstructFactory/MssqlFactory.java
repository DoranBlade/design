package abstructFactory;

public class MssqlFactory implements SqlFactory {

    @Override
    public SqlDriver createDriver() {
        return new MssqlDriver();
    }

    @Override
    public SqlConnect createConnect() {
        return new MysqlConnect();
    }
}
