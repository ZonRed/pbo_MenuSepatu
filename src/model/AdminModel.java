package model;

import entity.Login;
import java.util.ArrayList;

public class AdminModel{
    static ArrayList<Login> arrayLogin = new ArrayList<>();

    public static void initialData(){
        arrayLogin.add(new Login("ucup","123"));
        arrayLogin.add(new Login("lore","3535"));
    }

    public static Login cari(String username,String password){
        for(Login objek : arrayLogin){
            if(objek.getUsername().equals(username)&&objek.getPassword().equals(password)){
                return objek;
            }
        }
        return null;
    }

    public static ArrayList<Login> all(){
        return arrayLogin;
    }
}