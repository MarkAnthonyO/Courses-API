package editor;

import components.Course;
import connection.SQLiteConnection;
import generator.StudentListGenerator;

public class CourseEditor {
    public static void edit(Course course) {
        SQLiteConnection.openConnection();
        SQLiteConnection.query("UPDATE Course SET name = '" + course.getName() + "', IdTeacher= " + course.getTeacher().getId() + ", IdClassroom= " + course.getClassroom().getId() + " WHERE Id = " + course.getId());
        SQLiteConnection.query("DELETE FROM StudentCourse WHERE IdCourse=" + course.getId());
        SQLiteConnection.closeConnection();
        StudentListGenerator.generate(course, course.getStudents());
    }
}
