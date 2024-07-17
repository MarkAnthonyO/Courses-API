import components.Classroom;
import components.Course;
import components.Student;
import components.Teacher;
import getter.ClassroomGetter;
import getter.StudentGetter;
import getter.TeacherGetter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class GetterTest {

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
    public void TestClassroomGetter() {
        Classroom c = ClassroomGetter.get(1);
        classroom.setId(1);

        Assertions.assertEquals(classroom.getId(), c.getId());
        Assertions.assertEquals(classroom.getName(), c.getName());
        Assertions.assertEquals(classroom.getCapacity(), c.getCapacity());
    }

    @Test
    public void TestStudentGetter() {
        Student s = StudentGetter.get(1);

        Assertions.assertEquals(student.getId(), s.getId());
        Assertions.assertEquals(student.getName(), s.getName());
        Assertions.assertEquals(student.getLastname(), s.getLastname());
        Assertions.assertEquals(student.getAge(), s.getAge());
        Assertions.assertEquals(student.getTelephone(), s.getTelephone());
        Assertions.assertEquals(student.getAddress(), s.getAddress());
    }

    @Test
    public void TestTeacherGetter() {
        Teacher t = TeacherGetter.get(1);

        Assertions.assertEquals(teacher.getId(), t.getId());
        Assertions.assertEquals(teacher.getName(), t.getName());
        Assertions.assertEquals(teacher.getLastname(), t.getLastname());
        Assertions.assertEquals(teacher.getAge(), t.getAge());
        Assertions.assertEquals(teacher.getTelephone(), t.getTelephone());
        Assertions.assertEquals(teacher.getAddress(), t.getAddress());
    }

}
