package generator;

import components.Course;
import components.Student;
import connection.SQLiteConnection;

import java.util.ArrayList;

public class StudentListGenerator {
    public static void generate(Course course, ArrayList<Student> students) {
        for (var student : students) {
            SQLiteConnection.query("INSERT INTO StudentCourse(IdStudent, IdCourse) values (" + student.getId() + ", " + course.getId() + ")");
        }
    }
}
