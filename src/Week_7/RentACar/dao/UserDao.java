package Week_7.RentACar.dao;

import Week_7.RentACar.core.Database;
import Week_7.RentACar.entity.User;
import com.mysql.cj.protocol.Resultset;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
    private final Connection connection;

    public UserDao() {
        this.connection = Database.connection();
    }

    public User findUSer(String userName, String password) {
        User obj = null;
        String query = "SELECT * FROM public.user WHERE user_name = ? AND user_pass = ?";
        try {
            PreparedStatement preparedStatement = this.connection.prepareStatement(query);
            preparedStatement.setString(1, userName);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                obj = this.match(resultSet);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return obj;
    }
    public User match (ResultSet rs) throws SQLException {
        User obj = new User();
        obj.setId(rs.getInt("user_id"));
        obj.setName(rs.getString( "user_name"));
        obj.setPassword(rs.getString( "user_pass"));
        obj.setRole(rs.getString( "user_role"));
        return obj;
    }
}
