import components.Classroom;
import components.Course;
import components.Student;
import components.Teacher;
import generator.ClassroomGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import settings.Settings;

import java.io.File;
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

    Course Test = new Course (
            0,
            "test-course",
            teacher,
            students,
            classroom
    );

    @Test
    public void TestClassroomGenerator() {
        ClassroomGenerator.generate(classroom);
        File classroomFile = new File(Settings.getClassroomPath() + "/" +classroom.getName());

        Assertions.assertTrue(classroomFile.exists());
    }
}
