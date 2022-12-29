package main;

import model.AdminModel;
import controller.AdminController;
public class Main {
    public static void main(String[] args){
        AdminModel.initialData();
        AdminController admin = new AdminController();
        admin.toMain();
    }
}
