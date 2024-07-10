import Components.Classroom;
import Components.Course;
import Components.Student;
import Components.Teacher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ComponentsTest {

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


    Course Test = new Course (
            0,
            "test-course",
            teacher,
            students,
            classroom
    );

    @Test
    public void TestCourse () {

        students.add(student);

        Assertions.assertEquals(0, Test.getId());
        Assertions.assertEquals("test-course", Test.getName());
        Assertions.assertEquals("test-teacher", Test.getTeacher().getName());
        Assertions.assertEquals("test-student", Test.getStudents().getFirst().getName());
        Assertions.assertEquals("test-classroom", Test.getClassroom().getName());
    }
}
