package deleter;

import connection.SQLiteConnection;

public class CourseDeleter {
    public static void delete(int id) {
        SQLiteConnection.openConnection();
        SQLiteConnection.query("DELETE FROM Course WHERE Id=" + id);
        SQLiteConnection.query("DELETE FROM StudentCourse WHERE IdCourse=" + id);
        SQLiteConnection.closeConnection();
    }
}
