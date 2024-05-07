import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String DB_URL = "jdbc:postgresql://localhost:5432/db";
        String DB_PASS = "postgres";
        String DB_USERNAME = "postgres";
        try {
            Connection connection = DriverManager.getConnection(DB_URL,DB_PASS,DB_USERNAME);

            String selectQuery = "SELECT name FROM students WHERE id = ?";
            String deleteQuery = "DELETE FROM students WHERE id = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);

            Scanner input = new Scanner(System.in);
            System.out.print("Enter Student ID : ");
            int studentId = input.nextInt();

            // Bir sonraki satıra geç
            input.nextLine();

            preparedStatement.setInt(1,studentId);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()){
                String name = resultSet.getString("name");
                System.out.println("Student Name : " + name);

                System.out.print("Do you want delete name  Yes/No : " );
                String choice = input.nextLine();


                if (choice.equalsIgnoreCase("Yes")){
                    PreparedStatement preparedStatement1 = connection.prepareStatement(deleteQuery);
                    preparedStatement1.setInt(1,studentId);
                    preparedStatement1.executeUpdate();
                    preparedStatement1.close();
                    System.out.println("Student deleted");
                }

            }else {
                System.out.println("Student not found");
            }

            // Kaynakları serbest bırak
            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
