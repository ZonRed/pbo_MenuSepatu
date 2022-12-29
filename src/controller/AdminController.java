package controller;

import model.AdminModel;
import entity.Login;
import view.AdminView;
public class AdminController {

    public void toMain(){
        AdminView adminView = new AdminView();
        adminView.menu();
    }
    public boolean login1(String username,String password){
        Login admin = AdminModel.cari(username, password);
        if(admin!=null){
            return true;
        }
        else {
            return false;
        }
    }
}
