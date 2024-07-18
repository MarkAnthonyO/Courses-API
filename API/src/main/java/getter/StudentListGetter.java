package getter;

import components.Student;
import connection.SQLiteConnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentListGetter {
    public static ArrayList<Student> get(int courseId) {
        ArrayList<Student> students = new ArrayList<>();
        ResultSet rs = SQLiteConnection.query("SELECT * FROM StudentCourse WHERE IdCourse = " + courseId);


        try {
            while (rs.next()) {
                students.add(StudentGetter.get(rs.getInt("IdStudent")));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return students;
    }
}
