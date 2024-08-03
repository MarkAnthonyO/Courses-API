package getter;

import components.Student;
import connection.SQLiteConnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * <h1>CourseGetter class</h1>
 * @author MarkAnthonyO
 * @version v1.0.0
 */
public class StudentGetter {

    /**
     * <h1>Get student</h1>
     * <h3>Example of use</h3>
     * <pre>{@code
     * Student student = StudentGetter.get(1);
     * }</pre>
     * @param id id student
     * @return student
     */
    public static Student get(int id) {
        SQLiteConnection.openConnection();
        ResultSet rs = SQLiteConnection.query("SELECT * FROM Student WHERE Id=" + id);
        Student student = null;

        try {
            while (rs.next()) {
                student =  new Student(rs.getInt("Id"), rs.getString("name"), rs.getString("lastname"), rs.getInt("age"), rs.getString("telephone"), rs.getString("address"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        SQLiteConnection.closeConnection();
        return student;
    }

    /**
     * <h1>Get students</h1>
     * <h3>Example of use</h3>
     * <pre>{@code
     * ArrayList<Student> students = StudentGetter.getAll();
     * }</pre>
     * @return All students
     */
    public static ArrayList<Student> getAll() {
        SQLiteConnection.openConnection();
        ResultSet rs = SQLiteConnection.query("SELECT * FROM Student");
        ArrayList<Student> students = new ArrayList<>();

        try {
            while (rs.next()) {
                students.add(new Student(rs.getInt("Id"), rs.getString("name"), rs.getString("lastname"), rs.getInt("age"), rs.getString("telephone"), rs.getString("address")));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        SQLiteConnection.closeConnection();
        return students;
    }
}
