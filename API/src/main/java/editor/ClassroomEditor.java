package editor;

import components.Classroom;
import connection.SQLiteConnection;

public class ClassroomEditor {
    public static void edit(Classroom classroom) {
        SQLiteConnection.openConnection();
        SQLiteConnection.query("UPDATE Classroom SET name = '" + classroom.getName() + "', capacity= " + classroom.getCapacity() + " WHERE Id = " + classroom.getId());
        SQLiteConnection.closeConnection();
    }
}
