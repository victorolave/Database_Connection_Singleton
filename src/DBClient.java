import DBPackage.Connection;
import DBPackage.DBConnection;

public class DBClient {
    
    public static void main(String[] args) {
        
        DBConnection conn = DBConnection.getDBConnection();
        conn.Connect("Employes");
        conn.Disconnect();

        DBConnection conn2 = DBConnection.getDBConnection();
        conn2.Connect("Roster");
        conn2.Disconnect();
    }
}