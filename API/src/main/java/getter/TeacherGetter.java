package getter;

import components.Student;
import components.Teacher;
import connection.SQLiteConnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * <h1>TeacherGetter class</h1>
 * @author MarkAnthonyO
 * @version v1.0.0
 */
public class TeacherGetter {

    /**
     * <h1>Get teacher</h1>
     * <h3>Example of use</h3>
     * <pre>{@code
     * Teacher teacher = TeacherGetter.get(1);
     * }</pre>
     * @param id id teacher
     * @return teacher
     */
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

    /**
     * <h1>Get teachers</h1>
     * <h3>Example of use</h3>
     * <pre>{@code
     * ArrayList<Teacher> teachers = TeacherGetter.getAll();
     * }</pre>
     * @return All teachers
     */
    public static ArrayList<Teacher> getAll() {
        ResultSet rs = SQLiteConnection.query("SELECT * FROM Teacher");
        ArrayList<Teacher> teachers = new ArrayList<>();

        try {
            while (rs.next()) {
                teachers.add(new Teacher(rs.getInt("Id"), rs.getString("name"), rs.getString("lastname"), rs.getInt("age"), rs.getString("telephone"), rs.getString("address")));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return teachers;
    }
}
