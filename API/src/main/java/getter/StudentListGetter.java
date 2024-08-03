package getter;

import components.Student;
import connection.SQLiteConnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * <h1>StudentListGetter class</h1>
 * @author MarkAnthonyO
 * @version v1.0.0
 */
public class StudentListGetter {

    /**
     * <h1>Get students from course</h1>
     * <h3>Example of use</h3>
     * <pre>{@code
     * ArrayList<Student> students = StudentListGetter.get(1);
     * }</pre>
     * @param courseId id course
     * @return All students from course
     */
    public static ArrayList<Student> get(int courseId) {
        SQLiteConnection.openConnection();
        ArrayList<Student> students = new ArrayList<>();
        ResultSet rs = SQLiteConnection.query("SELECT * FROM StudentCourse WHERE IdCourse = " + courseId);

        try {
            while (rs.next()) {
                students.add(StudentGetter.get(rs.getInt("IdStudent")));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        SQLiteConnection.closeConnection();
        return students;
    }
}
