package connection;

import java.io.File;
import java.sql.*;

/**
 * <h1>SQLiteConnection class</h1>
 * @author MarkAnthonyO
 * @version v1.0.0
 */
public class SQLiteConnection {

    private static Connection connection;
    private static Statement statement;

    /**
     * <h1>Start connection to SQLite file</h1>
     * <h3>Example of use</h3>
     * <pre>{@code SQLiteConnection.openConnection();}</pre>
     */
    public static void openConnection() {
        try {
            if (!new File("client.db").exists()) {
                connection = DriverManager.getConnection("jdbc:sqlite:client.db");
                statement = connection.createStatement();

                statement.executeUpdate("CREATE TABLE Student(Id INTEGER PRIMARY KEY AUTOINCREMENT, name VARCHAR(125), lastname VARCHAR(125), age INTEGER, telephone VARCHAR(10), address VARCHAR(255))");
                statement.executeUpdate("CREATE TABLE StudentCourse(IdStudent INTEGER, IdCourse INTEGER)");
                statement.executeUpdate("CREATE TABLE Teacher(Id INTEGER PRIMARY KEY AUTOINCREMENT, name VARCHAR(125), lastname VARCHAR(125), age INTEGER, telephone VARCHAR(10), address VARCHAR(255))");
                statement.executeUpdate("CREATE TABLE Course(Id INTEGER PRIMARY KEY AUTOINCREMENT, name VARCHAR(125), IdTeacher INTEGER, IdClassroom INTEGER)");
                statement.executeUpdate("CREATE TABLE Classroom(Id INTEGER PRIMARY KEY AUTOINCREMENT, name VARCHAR(125), capacity INTEGER)");
            } else {
                connection = DriverManager.getConnection("jdbc:sqlite:client.db");
                statement = connection.createStatement();
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * <h1>Execute query</h1>
     * <h3>Example of use</h3>
     * <pre>{@code SQLiteConnection.query("SELECT * FROM table");}</pre>
     * @return result of query
     */
    public static ResultSet query(String query) {
        ResultSet rs = null;

        try {
            statement.setQueryTimeout(30);
            rs = statement.executeQuery(query);
        }
        catch(SQLException e) {
            e.printStackTrace(System.err);
        }

        return rs;
    }

    /**
     * <h1>Close connection to SQLite file</h1>
     * <h3>Example of use</h3>
     * <pre>{@code SQLiteConnection.closeConnection();}</pre>
     */
    public static void closeConnection() {
        try {
            connection.close();
            statement.close();
        }
        catch(SQLException e) {
            e.printStackTrace(System.err);
        }
    }
}