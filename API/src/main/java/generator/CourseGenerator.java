package generator;

import components.Course;
import connection.SQLiteConnection;

/**
 * <h1>CourseGenerator class</h1>
 * @author MarkAnthonyO
 * @version v1.0.0
 */
public class CourseGenerator {
    /**
     * <h1>Generate course</h1>
     * <h3>Example of use</h3>
     * <pre>{@code
     * CourseGenerator.generate(course);
     * }</pre>
     * @param course course to generate
     */
    public static void generate(Course course) {
        SQLiteConnection.openConnection();
        SQLiteConnection.query("INSERT INTO Course(name, idTeacher, idClassroom) values('" +
                course.getName() + "', " +
                course.getTeacher().getId() + ", "+
                course.getClassroom().getId() + ")");
        SQLiteConnection.closeConnection();
    }
}
