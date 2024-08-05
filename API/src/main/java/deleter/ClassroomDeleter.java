package deleter;

import connection.SQLiteConnection;

public class ClassroomDeleter {
    public static void delete(int id) {
        SQLiteConnection.openConnection();
        SQLiteConnection.query("DELETE FROM Classroom WHERE Id=" + id);
        SQLiteConnection.closeConnection();
    }
}
