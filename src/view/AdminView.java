package view;
import controller.AdminController;
import controller.DataSepatuController;
import java.util.Scanner;
public class AdminView implements ViewInterface{
    Scanner input = new Scanner(System.in);
    AdminController adminCon = new AdminController();

    public void menu(){
        String choice;
        do {
            System.out.println("==============================");
            System.out.println("         TOKO SEPATU          ");
            System.out.println("            KYONI             ");
            System.out.println("==============================");
            System.out.println("            LOGIN             ");
            System.out.println("==============================");
            System.out.println("""
                    1. Login
                    2. Exit
                    ==============================""");
            System.out.print("Choice Input : ");
            choice = input.nextLine();
            switch (choice) {
                case "1" -> log();
                case "2" -> System.out.println("Leave...");
                default -> System.err.print("Wrong input!!!!");
            }
        } while (!choice.equals("2"));
    }

    private void log(){
        System.out.print("Enter Username : ");
        String username = input.nextLine();
        System.out.print("Enter Password : ");
        String password = input.nextLine();
        boolean status = adminCon.login1(username,password);
        if(status){
            DataSepatuController data = new DataSepatuController();
            data.toViewAdmin();
        }
        else{
            System.out.println("salah");
        }
    }
}
