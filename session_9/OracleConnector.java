package Session_9;

public class OracleConnector extends Connector {
    @Override
    public void openConnection() {
        System.out.println("Connection open .....in OracleConnector");
    }

    @Override
    public void closeConnection() {
        System.out.println("Connection close .....in OracleConnector");

    }

    @Override
    public void fireQuery() {
        System.out.println("query fired .....in OracleConnector");

    }
}
