package generator;

import components.Classroom;
import connection.SQLiteConnection;

/**
 * <h1>ClassroomGenerator class</h1>
 * @author MarkAnthonyO
 * @version v1.0.0
 */
public class ClassroomGenerator {

    /**
     * <h1>Generate classroom</h1>
     * <h3>Example of use</h3>
     * <pre>{@code
     * ClassroomGenerator.generate(classroom);
     * }</pre>
     * @param classroom classroom to generate
     */
    public static void generate(Classroom classroom) {
        SQLiteConnection.query("INSERT INTO Classroom(name, capacity) values('" + classroom.getName() + "'," + classroom.getCapacity() + ")");
    }
}
