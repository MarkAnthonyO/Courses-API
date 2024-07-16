package generator;

import components.Classroom;
import connection.SQLiteConnection;

import java.io.*;

public class ClassroomGenerator {
    public static void generate(Classroom classroom) {
        SQLiteConnection.openConnection();
        SQLiteConnection.query("INSERT INTO Classroom(name, capacity) values('" + classroom.getName() + "'," + classroom.getCapacity() + ")");
        SQLiteConnection.closeConnection();
    }
}
