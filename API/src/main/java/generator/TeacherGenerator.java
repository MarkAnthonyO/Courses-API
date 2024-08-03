package generator;

import components.Teacher;
import connection.SQLiteConnection;

/**
 * <h1>TeacherGenerator class</h1>
 * @author MarkAnthonyO
 * @version v1.0.0
 */
public class TeacherGenerator {

    /**
     * <h1>Generate teacher</h1>
     * <h3>Example of use</h3>
     * <pre>{@code
     * TeacherGenerator.generate(teacher);
     * }</pre>
     * @param teacher teacher to generate
     */
    public static void generate(Teacher teacher) {
        SQLiteConnection.openConnection();
        SQLiteConnection.query("INSERT INTO Teacher(name, lastname, age, telephone, address) values('" +
                teacher.getName() + "', '" +
                teacher.getLastname() + "',"+
                teacher.getAge() + ", '" +
                teacher.getTelephone() + "', '" +
                teacher.getAddress() + "')");
        SQLiteConnection.closeConnection();
    }
}
