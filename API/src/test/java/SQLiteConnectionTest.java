import components.Classroom;
import connection.SQLiteConnection;
import generator.ClassroomGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SQLiteConnectionTest {
    @Test
    public void TestQuery() {

        Classroom classroom = new Classroom(
                "test-classroom",
                10
        );

        SQLiteConnection.openConnection();
        ResultSet rs = SQLiteConnection.query("SELECT * FROM Classroom WHERE name LIKE '%" + classroom.getName()+"%'");

        try {
            if (rs.next())
                Assertions.assertTrue(true);
            else
                Assertions.fail();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        SQLiteConnection.closeConnection();
    }
}
