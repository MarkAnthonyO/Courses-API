package deleter;

import connection.SQLiteConnection;

public class StudentDeleter {
    public static void delete(int id) {
        SQLiteConnection.openConnection();
        SQLiteConnection.query("DELETE FROM Student WHERE Id=" + id);
        SQLiteConnection.query("DELETE FROM StudentCourse WHERE IdStudent=" + id);
        SQLiteConnection.closeConnection();
    }
}
