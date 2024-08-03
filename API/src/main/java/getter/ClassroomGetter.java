package getter;

import components.Classroom;
import connection.SQLiteConnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * <h1>ClassroomGetter class</h1>
 * @author MarkAnthonyO
 * @version v1.0.0
 */
public class ClassroomGetter {

    /**
     * <h1>Get classroom</h1>
     * <h3>Example of use</h3>
     * <pre>{@code
     * Classroom classroom = ClassroomGetter.get(1);
     * }</pre>
     * @param id id student
     * @return classroom
     */
    public static Classroom get(int id) {
        SQLiteConnection.openConnection();
        ResultSet rs = SQLiteConnection.query("SELECT * FROM Classroom WHERE Id=" + id);
        Classroom classroom = null;

        try {
            while (rs.next()) {
                classroom = new Classroom(rs.getInt("Id"), rs.getString("name"), rs.getInt("capacity"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        SQLiteConnection.closeConnection();
        return classroom;
    }

    /**
     * <h1>Get all classroom</h1>
     * <h3>Example of use</h3>
     * <pre>{@code
     * ArrayList<Classroom> classrooms = ClassroomGetter.getAll();
     * }</pre>
     * @return All classrooms
     */
    public static ArrayList<Classroom> getAll() {
        SQLiteConnection.openConnection();
        ResultSet rs = SQLiteConnection.query("SELECT * FROM Classroom");
        ArrayList<Classroom> students = new ArrayList<>();

        try {
            while (rs.next()) {
                students.add(new Classroom(rs.getInt("Id"), rs.getString("name"), rs.getInt("capacity")));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        SQLiteConnection.closeConnection();
        return students;
    }
}
