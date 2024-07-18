package getter;

import components.Classroom;
import connection.SQLiteConnection;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ClassroomGetter {
    public static Classroom get(int id) {
        ResultSet rs = SQLiteConnection.query("SELECT * FROM Classroom WHERE Id=" + id);
        Classroom classroom = null;

        try {
            while (rs.next()) {
                classroom = new Classroom(rs.getInt("Id"), rs.getString("name"), rs.getInt("capacity"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return classroom;
    }
}
