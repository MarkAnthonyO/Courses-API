package getter;

import components.Classroom;
import components.Student;
import connection.SQLiteConnection;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentGetter {
    public static Student get(int id) {
        ResultSet rs = SQLiteConnection.query("SELECT * FROM Student WHERE Id=" + id);
        Student student = null;

        try {
            while (rs.next()) {
                student =  new Student(rs.getInt("Id"), rs.getString("name"), rs.getString("lastname"), rs.getInt("age"), rs.getString("telephone"), rs.getString("address"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return student;
    }
}
