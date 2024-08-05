package deleter;

import connection.SQLiteConnection;

public class TeacherDeleter {
    public static void delete(int id) {
        SQLiteConnection.openConnection();
        SQLiteConnection.query("DELETE FROM Teacher WHERE Id=" + id);
        SQLiteConnection.closeConnection();
    }
}
