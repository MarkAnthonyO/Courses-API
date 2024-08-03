package getter;

import components.Course;
import connection.SQLiteConnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * <h1>CourseGetter class</h1>
 * @author MarkAnthonyO
 * @version v1.0.0
 */
public class CourseGetter {

    /**
     * <h1>Get course</h1>
     * <h3>Example of use</h3>
     * <pre>{@code
     * Course course = CourseGetter.get(1);
     * }</pre>
     * @param id id course
     * @return course
     */
    public static Course get(int id) {
        SQLiteConnection.openConnection();
        Course course = null;
        ResultSet rs = SQLiteConnection.query("SELECT * FROM Course WHERE Id=" + id);

        try {
            while (rs.next()) {
                String name = rs.getString("name");
                int idTeacher = rs.getInt("IdTeacher");
                int idClassroom = rs.getInt("IdClassroom");
                course = new Course(id, name, TeacherGetter.get(idTeacher), StudentListGetter.get(id), ClassroomGetter.get(idClassroom));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        SQLiteConnection.closeConnection();
        return course;
    }

    /**
     * <h1>Get courses</h1>
     * <h3>Example of use</h3>
     * <pre>{@code
     * ArrayList<Course> courses = CourseGetter.getAll();
     * }</pre>
     * @return All courses
     */
    public static ArrayList<Course> getAll() {
        SQLiteConnection.openConnection();
        ResultSet rs = SQLiteConnection.query("SELECT * FROM Course");
        ArrayList<Course> courses = new ArrayList<>();

        try {
            while (rs.next()) {
                int id = rs.getInt("Id");
                String name = rs.getString("name");
                int idTeacher = rs.getInt("IdTeacher");
                int idClassroom = rs.getInt("IdClassroom");
                courses.add(new Course(id, name, TeacherGetter.get(idTeacher), StudentListGetter.get(id), ClassroomGetter.get(idClassroom)));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        SQLiteConnection.closeConnection();
        return courses;
    }
}
