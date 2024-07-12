import connection.SQLiteConnection;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SQLiteConnectionTest {
    @Test
    public void TestQuery() {
        SQLiteConnection.startDatabase();

        SQLiteConnection.query("INSERT INTO User(name) VALUES ('Martin')");
        ResultSet rs = SQLiteConnection.query("SELECT * FROM User");

        try {
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("Id"));
                System.out.println("Nombre: " + rs.getString("name"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
