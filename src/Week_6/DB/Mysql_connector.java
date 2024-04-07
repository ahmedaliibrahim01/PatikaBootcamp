package Week_6.DB;

import java.sql.*;

public class Mysql_connector {
    public static void main(String[] args) {
        String DB_URL = "jdbc:mysql://localhost/university";
        String DB_USER = "root";
        String DB_PASSWORD = "mysql";


        // Connections
        Connection connection = null;
        PreparedStatement Pstatement = null;
        Statement statement = null;
        ResultSet data = null;
        try {
            connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            System.out.println("Connection is successful");

        } catch (SQLException e) {
            System.out.println("Connection is not successful");
            System.out.println(e.getMessage());
        }

        // Query
        String query = "SELECT * FROM student ";


        // Statements
        try {
            statement = connection.createStatement();
            data = statement.executeQuery(query);

            while (data.next()){
                int studentId = data.getInt("student_id");
                System.out.println("Student ID : " + studentId);
            }

            System.out.println("Select query is successful");
        } catch (SQLException e) {
            System.out.println("Select query is not successful");
            System.out.println(e.getMessage());
        }



        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
