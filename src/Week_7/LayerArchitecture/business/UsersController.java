package Week_7.LayerArchitecture.business;

import Week_7.LayerArchitecture.dao.UsersDao;

public class UsersController  {
    private UsersDao usersDao;

    public UsersController() {
        this.usersDao = new UsersDao();
    }
}
