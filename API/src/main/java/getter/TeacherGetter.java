package getter;

import components.Teacher;
import connection.SQLiteConnection;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TeacherGetter {
    public static Teacher get(int id) {
        ResultSet rs = SQLiteConnection.query("SELECT * FROM Teacher WHERE Id=" + id);
        Teacher teacher = null;

        try {
            while (rs.next()) {
                teacher =  new Teacher(rs.getInt("Id"), rs.getString("name"), rs.getString("lastname"), rs.getInt("age"), rs.getString("telephone"), rs.getString("address"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return teacher;
    }
}
