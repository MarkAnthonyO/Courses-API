package getter;

import components.Classroom;
import connection.SQLiteConnection;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ClassroomGetter {
    public static Classroom get(int id) {
        SQLiteConnection.openConnection();
        ResultSet rs = SQLiteConnection.query("SELECT * FROM Classroom WHERE Id=" + id);
        Classroom classroom = null;

        try {
            while (rs.next()) {
                classroom = new Classroom(rs.getString("name"), rs.getInt("capacity"));
                classroom.setId(rs.getInt("Id"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return classroom;
    }
}
