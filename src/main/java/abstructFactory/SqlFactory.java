package abstructFactory;

public interface SqlFactory {

    SqlDriver createDriver();

    SqlConnect createConnect();
}
