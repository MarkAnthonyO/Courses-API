package editor;

import components.Teacher;
import connection.SQLiteConnection;

public class TeacherEditor {
    public static void edit(Teacher teacher) {
        SQLiteConnection.openConnection();
        SQLiteConnection.query("UPDATE Teacher SET name = '" + teacher.getName() + "', lastname= '" + teacher.getLastname() + "', age= " + teacher.getAge() + ", telephone='" + teacher.getTelephone() + "', address='" + teacher.getAddress() + "' WHERE Id = " + teacher.getId());
        SQLiteConnection.closeConnection();
    }
}
