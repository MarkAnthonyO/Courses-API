package generator;

import components.Student;
import connection.SQLiteConnection;

/**
 * <h1>StudentGenerator class</h1>
 * @author MarkAnthonyO
 * @version v1.0.0
 */
public class StudentGenerator {

    /**
     * <h1>Generate Student</h1>
     * <h3>Example of use</h3>
     * <pre>{@code
     * StudentGenerator.generate(student);
     * }</pre>
     * @param student student to generate
     */
    public static void generate(Student student) {
        SQLiteConnection.query("INSERT INTO Student(name, lastname, age, telephone, address) values('" +
                student.getName() + "', '" +
                student.getLastname() + "',"+
                student.getAge() + ", '" +
                student.getTelephone() + "', '" +
                student.getAddress() + "')");
    }
}
