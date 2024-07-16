package connection;

import java.io.File;
import java.sql.*;

public class SQLiteConnection {

    private static Connection connection;
    private static Statement statement;

    public static void openConnection() {
        try {
            if (!new File("client.db").exists()) {
                connection = DriverManager.getConnection("jdbc:sqlite:client.db");
                statement = connection.createStatement();
                
                statement.executeUpdate("CREATE TABLE Course(Id INTEGER PRIMARY KEY AUTOINCREMENT, name VARCHAR(125), idTeacher INTEGER, idClassroom INTEGER)");
                statement.executeUpdate("CREATE TABLE Classroom(Id INTEGER PRIMARY KEY AUTOINCREMENT, name VARCHAR(125), capacity INTEGER)");
            } else {
                connection = DriverManager.getConnection("jdbc:sqlite:client.db");
                statement = connection.createStatement();
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static ResultSet query(String query) {
        ResultSet res = null;

        try {
            statement.setQueryTimeout(30);
            res = statement.executeQuery(query);
        }
        catch(SQLException e) {
            e.printStackTrace(System.err);
        }

        return res;
    }

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