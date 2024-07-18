package generator;

import components.Teacher;
import connection.SQLiteConnection;

public class TeacherGenerator {
    public static void generate(Teacher teacher) {
        SQLiteConnection.query("INSERT INTO Teacher(name, lastname, age, telephone, address) values('" +
                teacher.getName() + "', '" +
                teacher.getLastname() + "',"+
                teacher.getAge() + ", '" +
                teacher.getTelephone() + "', '" +
                teacher.getAddress() + "')");
    }
}
