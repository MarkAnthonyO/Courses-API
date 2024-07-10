import components.Classroom;
import components.Course;
import components.Student;
import components.Teacher;
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

    @Test
    public void TestStudent() {
        students.add(student);

        Assertions.assertEquals(0, students.getFirst().getId());
        Assertions.assertEquals("test-student", students.getFirst().getName());
        Assertions.assertEquals("test-student-lastname", students.getFirst().getLastname());
        Assertions.assertEquals(0, students.getFirst().getAge());
        Assertions.assertEquals("0000000000", students.getFirst().getTelephone());
        Assertions.assertEquals("test-student-address", students.getFirst().getAddress());
    }

    @Test
    public void TestTeacher() {
        Assertions.assertEquals(0, teacher.getId());
        Assertions.assertEquals("test-teacher", teacher.getName());
        Assertions.assertEquals("test-teacher-lastname", teacher.getLastname());
        Assertions.assertEquals(0, teacher.getAge());
        Assertions.assertEquals("0000000000", teacher.getTelephone());
        Assertions.assertEquals("test-teacher-address", teacher.getAddress());
    }

    @Test
    public void TestClassroom() {
        Assertions.assertEquals("test-classroom", classroom.getName());
        Assertions.assertEquals(10, classroom.getCapacity());
    }
}
