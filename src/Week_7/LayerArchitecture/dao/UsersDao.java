package Week_7.LayerArchitecture.dao;

import Week_7.LayerArchitecture.core.Database;

import java.sql.Connection;

public class UsersDao {
    private Connection connection;

    public UsersDao() {
        this.connection = Database.connection();

        // CRUD işlemleri burada tanımlanır
    }
}
