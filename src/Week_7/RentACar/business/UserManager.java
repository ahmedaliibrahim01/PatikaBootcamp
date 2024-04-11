package Week_7.RentACar.business;

import Week_7.RentACar.dao.UserDao;
import Week_7.RentACar.entity.User;

public class UserManager {
    private UserDao userDao;

    public UserManager() {
        this.userDao = new UserDao();
    }

    public User findUser(String userName, String password){
        return this.userDao.findUSer(userName,password);
    }
}
