package Week_6.DB;

import java.sql.*;

public class JDBC_Assignment {
    public static void main(String[] args) {
        String DB_URL = "jdbc:mysql://localhost/university";
        String DB_USER = "root";
        String DB_PASSWORD = "mysql";

        // Connections
        Connection connection = null;
        PreparedStatement prstatement = null;
        Statement statement = null;
        ResultSet data = null;
        try {
            connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);

        } catch (SQLException e) {
            System.out.println("Connection is not successful");
            System.out.println(e.getMessage());
        }

        // Queries
        String studentInfo = "SELECT * FROM student ";
        String createEmployeesTable = "CREATE TABLE employees (" +
                "id INT AUTO_INCREMENT PRIMARY KEY," +
                "name VARCHAR(255)," +
                "position VARCHAR(255)," +
                "salary DECIMAL(10, 2)" +
                ")";
        String insetEmployee = "INSERT INTO employees (name, position, salary) VALUES (?,?,?)";
        String employeeInfo = "SELECT * FROM employees ";

        // View student information
        try {
            statement = connection.createStatement();
            data = statement.executeQuery(studentInfo);
            System.out.println("\n------------------Student information------------------\n");

            while (data.next()){
                int studentId = data.getInt("student_id");
                String firstName = data.getString("first_name");
                String lastName = data.getString("last_name");
                String studentNumber = data.getString("student_number");
                String birthDate = data.getString("birth_date");

                System.out.print("Student ID: " + studentId);
                System.out.print(", First Name: " + firstName);
                System.out.print(", Last Name: " + lastName);
                System.out.print(", Student Number: " + studentNumber);
                System.out.print(" Birth Date: " + birthDate);
                System.out.println();
            }
        } catch (SQLException e) {
            System.out.println("Failed to view student information");
            System.out.println(e.getMessage());
        }


        // Create Employees Table

        try {
            statement.executeUpdate(createEmployeesTable);
            System.out.println("\nEmployees Table created successfully");
        } catch (SQLException e) {
            System.out.println("Failed to create new table");
            System.out.println(e.getMessage());
        }


        // Adding a new employee to the database
        try {
            prstatement = connection.prepareStatement(insetEmployee);

            prstatement.setString(1, "Alice Smith"); // İsim
            prstatement.setString(2, "Analyst"); // Pozisyon
            prstatement.setInt(3, 4500); // Maaş
            prstatement.executeUpdate();

            prstatement.setString(1, "Michael Johnson"); // İsim
            prstatement.setString(2, "Developer"); // Pozisyon
            prstatement.setInt(3, 4000); // Maaş
            prstatement.executeUpdate();

            prstatement.setString(1, "Emily Brown"); // İsim
            prstatement.setString(2, "Designer"); // Pozisyon
            prstatement.setInt(3, 3800); // Maaş
            prstatement.executeUpdate();

            prstatement.setString(1, "David Lee"); // İsim
            prstatement.setString(2, "Intern"); // Pozisyon
            prstatement.setInt(3, 2000); // Maaş
            prstatement.executeUpdate();

            prstatement.setString(1, "Jessica Clark"); // İsim
            prstatement.setString(2, "Manager"); // Pozisyon
            prstatement.setInt(3, 5000); // Maaş
            prstatement.executeUpdate();



            System.out.println("new employee added");
        } catch (SQLException e) {
            System.out.println("An error occurred while adding a new employee");
            System.out.println(e.getMessage());
        }

        // View employee information
        try {
            statement = connection.createStatement();
            data = statement.executeQuery(employeeInfo);
            System.out.println("\n------------------Employee information------------------\n");

            while (data.next()){
                int id = data.getInt("id");
                String name = data.getString("name");
                String postion = data.getString("position");
                int salary = data.getInt("salary");

                System.out.print("Employee ID: " + id);
                System.out.print(", Name: " + name);
                System.out.print(", Position: " + postion);
                System.out.print(" Salary: " + salary);
                System.out.println();
            }
        } catch (SQLException e) {
            System.out.println("Failed to view student information");
            System.out.println(e.getMessage());
        }

        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
