package editor;

import components.Student;
import connection.SQLiteConnection;

public class StudentEditor {
    public static void edit(Student student) {
        SQLiteConnection.openConnection();
        SQLiteConnection.query("UPDATE Student SET name = '" + student.getName() + "', lastname= '" + student.getLastname() + "', age= " + student.getAge() + ", telephone='" + student.getTelephone() + "', address='" + student.getAddress() + "' WHERE Id = " + student.getId());
        SQLiteConnection.closeConnection();
    }
}
