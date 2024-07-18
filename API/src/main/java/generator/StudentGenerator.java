package generator;

import components.Student;
import connection.SQLiteConnection;

import java.sql.ResultSet;

public class StudentGenerator {
    public static void generate(Student student) {
        SQLiteConnection.query("INSERT INTO Student(name, lastname, age, telephone, address) values('" +
                student.getName() + "', '" +
                student.getLastname() + "',"+
                student.getAge() + ", '" +
                student.getTelephone() + "', '" +
                student.getAddress() + "')");
    }
}
