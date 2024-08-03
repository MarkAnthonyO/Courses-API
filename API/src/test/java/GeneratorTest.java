import components.Classroom;
import components.Course;
import components.Student;
import components.Teacher;
import connection.SQLiteConnection;
import generator.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GeneratorTest {

    Student student = new Student (
            1,
            "test-student",
            "test-student-lastname",
            0,
            "0000000000",
            "test-student-address"
    );

    Teacher teacher = new Teacher (
            1,
            "test-teacher",
            "test-teacher-lastname",
            0,
            "0000000000",
            "test-teacher-address"
    );

    Classroom classroom = new Classroom(
            1,
            "test-classroom",
            10
    );

    ArrayList<Student> students = new ArrayList<>();

    Course course = new Course (
            1,
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
        classroom.setId(1);
        CourseGenerator.generate(course);

        SQLiteConnection.openConnection();
        ResultSet rs = SQLiteConnection.query("SELECT * FROM Course WHERE name LIKE '%" + course.getName()+"%'");

        try {
            if (rs.next()) {
                Assertions.assertTrue(true);
            } else
                Assertions.fail();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        SQLiteConnection.closeConnection();
    }

    @Test
    public void TestStudentListGenerator() {
        course.getStudents().add(student);
        StudentListGenerator.generate(course, course.getStudents());

        SQLiteConnection.openConnection();
        ResultSet rs = SQLiteConnection.query("SELECT * FROM StudentCourse WHERE IdCourse=" + course.getId());

        try {
            if (rs.next()) {
                Assertions.assertTrue(true);
            } else
                Assertions.fail();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        SQLiteConnection.closeConnection();
    }

    @Test
    public void TestStudentGenerator() {
        StudentGenerator.generate(student);

        SQLiteConnection.openConnection();
        ResultSet rs = SQLiteConnection.query("SELECT * FROM Student WHERE name LIKE '%" + student.getName()+"%'");

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
    public void TestTeacherGenerator() {
        TeacherGenerator.generate(teacher);

        SQLiteConnection.openConnection();
        ResultSet rs = SQLiteConnection.query("SELECT * FROM Teacher WHERE name LIKE '%" + teacher.getName()+"%'");

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
