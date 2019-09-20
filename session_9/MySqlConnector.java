package Session_9;

public class MySqlConnector extends Connector {
    @Override
    public void openConnection() {
        System.out.println("Connection open .....in MySqlConnector");

    }

    @Override
    public void closeConnection() {
        System.out.println("Connection close .....in MySqlConnector");

    }

    @Override
    public void fireQuery() {
        System.out.println("query fired .....in MySqlConnector");

    }
}
