package abstructFactory;

public class MssqlDriver implements SqlDriver {

    @Override
    public String getDriver() {
        return "mssql driver";
    }
}
