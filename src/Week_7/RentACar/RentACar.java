package Week_7.RentACar;


import Week_7.RentACar.business.UserManager;
import Week_7.RentACar.core.Helper;
import Week_7.RentACar.view.AdminView;
import Week_7.RentACar.view.LoginView;

import java.sql.Connection;

public class RentACar {
    public static void main(String[] args) {
        Helper.setTheme();
        LoginView loginView = new LoginView();
        //UserManager userManager = new UserManager();
        //AdminView adminView = new AdminView(userManager.findUser("ahmed","1234"));
    }
}
