import components.Classroom;
import components.Course;
import components.Student;
import components.Teacher;
import connection.SQLiteConnection;
import generator.ClassroomGenerator;
import generator.CourseGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GeneratorTest {

    Student student = new Student (
            0,
            "test-student",
            "test-student-lastname",
            0,
            "0000000000",
            "test-student-address"
    );

    Teacher teacher = new Teacher (
            0,
            "test-teacher",
            "test-teacher-lastname",
            0,
            "0000000000",
            "test-teacher-address"
    );

    Classroom classroom = new Classroom(
            "test-classroom",
            10
    );

    ArrayList<Student> students = new ArrayList<>();

    Course course = new Course (
            0,
            "test-course",
            teacher,
            students,
            classroom
    );

    @Test
    public void TestClassroomGenerator() {
        ClassroomGenerator.generate(classroom);

        SQLiteConnection.openConnection();
        ResultSet rs = SQLiteConnection.query("SELECT * FROM Classroom WHERE name LIKE '%" + classroom.getName()+"%'");

        try {
            if (rs.next())
                Assertions.assertTrue(true);
            else
                Assertions.fail();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        SQLiteConnection.closeConnection();
    }

    @Test
    public void TestCourseGenerator() {
        CourseGenerator.generate(course);

        SQLiteConnection.openConnection();
        ResultSet rs = SQLiteConnection.query("SELECT * FROM Course WHERE name LIKE '%" + course.getName()+"%'");

        try {
            if (rs.next())
                Assertions.assertTrue(true);
            else
                Assertions.fail();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        SQLiteConnection.closeConnection();
    }
}
