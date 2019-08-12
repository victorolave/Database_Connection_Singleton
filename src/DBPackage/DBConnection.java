package DBPackage;

public class DBConnection implements Connection {

    private static DBConnection conn;

    //Private Constructor
    private DBConnection() {

    }

    public static DBConnection getDBConnection() {
        if ( conn == null ) {
            conn = new DBConnection();
            System.out.println("Connection created");
        }

        return conn;
    }

    public synchronized void Connect(String dbName) {
        System.out.println("Connected in: " + dbName);
    }

    public synchronized void Disconnect() {
        System.out.println("Disconnected!");
    }
}