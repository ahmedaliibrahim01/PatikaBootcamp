package Week_7.LayerArchitecture.core;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
    public static Connection connection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(
              "jdbc:postgresql://localhost:5432/Swing",
                    "postgres",
                    "ahmed0615592573"
            );
            System.out.println("Connection is successful");
        } catch (Exception e){
            System.out.println("Connection is not successful");
            System.out.println(e.getMessage());
        }

        return connection;
    }
}
