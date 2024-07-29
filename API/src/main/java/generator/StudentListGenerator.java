package generator;

import components.Course;
import components.Student;
import connection.SQLiteConnection;

import java.util.ArrayList;

/**
 * <h1>StudentListGenerator class</h1>
 * @author MarkAnthonyO
 * @version v1.0.0
 */
public class StudentListGenerator {

    /**
     * <h1>Generate StudentList</h1>
     * <h3>Example of use</h3>
     * <pre>{@code
     * StudentListGenerator.generate(course, students);
     * }</pre>
     * @param course course to generate
     * @param students students to generate
     */
    public static void generate(Course course, ArrayList<Student> students) {
        for (var student : students) {
            SQLiteConnection.query("INSERT INTO StudentCourse(IdStudent, IdCourse) values (" + student.getId() + ", " + course.getId() + ")");
        }
    }
}
