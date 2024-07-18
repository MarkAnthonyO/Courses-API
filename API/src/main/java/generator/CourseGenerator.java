package generator;

import components.Course;
import connection.SQLiteConnection;

import java.sql.ResultSet;

public class CourseGenerator {
    public static void generate(Course course) {
        SQLiteConnection.query("INSERT INTO Course(name, idTeacher, idClassroom) values('" +
                course.getName() + "', " +
                course.getTeacher().getId() + ", "+
                course.getClassroom().getId() + ")");
    }
}
