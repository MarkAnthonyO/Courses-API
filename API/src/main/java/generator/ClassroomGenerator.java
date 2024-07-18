package generator;

import components.Classroom;
import connection.SQLiteConnection;

import java.io.*;
import java.sql.ResultSet;

public class ClassroomGenerator {
    public static void generate(Classroom classroom) {
        SQLiteConnection.query("INSERT INTO Classroom(name, capacity) values('" + classroom.getName() + "'," + classroom.getCapacity() + ")");
    }
}
