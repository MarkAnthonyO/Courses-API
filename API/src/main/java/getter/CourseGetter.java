package getter;

import components.Classroom;
import components.Course;
import components.Student;
import components.Teacher;
import connection.SQLiteConnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CourseGetter {
    public static Course get(int id) {
        Course course = null;
        ResultSet rs = SQLiteConnection.query("SELECT * FROM Course WHERE Id=" + id);

        try {
            while (rs.next()) {
                String name = rs.getString("name");
                int idTeacher = rs.getInt("IdTeacher");
                int idClassroom = rs.getInt("IdClassroom");
                course = new Course(id, name, TeacherGetter.get(idTeacher), StudentListGetter.get(id), ClassroomGetter.get(idClassroom));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return course;
    }
}
