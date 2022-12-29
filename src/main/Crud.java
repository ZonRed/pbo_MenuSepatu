//package main;
//
//import entity.Login;
//import model.MethodDataSepatu;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//public class Crud  {
//    String username, password;
//    Scanner input = new Scanner(System.in);
//    Login data = new Login();
//    MethodDataSepatu data1 = new MethodDataSepatu();
//    ArrayList<Login> data2 = new ArrayList<>();
//
//    public void inputLogin() {
//        if (data2.isEmpty()) {
//            System.err.println("== DATA LOGIN EMPTY ==");
//        } else {
//            System.out.print("Enter Username : ");
//            username = input.nextLine();
//            System.out.print("Enter Password : ");
//            password = input.nextLine();
//            if (data.getUsername().equals(username) && data.getPassword().equals(password)) {
//                menu();
//            } else {
//                System.out.println("Invalid Username & Password!");
//            }
//        }
//    }
//
//    public void inputUser() {
//        System.out.print("Enter Username : ");
//        username = input.nextLine();
//        System.out.print("Enter Password : ");
//        password = input.nextLine();
//        data = new Login(username, password);
//        data2.add(data);
//    }
//
//    public void login() {
//        String choice;
//        do {
//            System.out.println("==============================");
//            System.out.println("         TOKO SEPATU          ");
//            System.out.println("            KYONI             ");
//            System.out.println("==============================");
//            System.out.println("            LOGIN             ");
//            System.out.println("==============================");
//            System.out.println("""
//                    1. Add user
//                    2. Login
//                    3. Exit
//                    ==============================""");
//            System.out.print("Choice Input : ");
//            choice = input.nextLine();
//            switch (choice) {
//                case "1" -> inputUser();
//                case "2" -> inputLogin();
//                case "3" -> System.out.println("Leave...");
//                default -> System.err.print("Wrong input!!!!");
//            }
//        } while (!choice.equals("3"));
//    }
//
//    public void menu() {
//        String choice;
//        do {
//            System.out.println("==============================");
//            System.out.println("         TOKO SEPATU          ");
//            System.out.println("            KYONI             ");
//            System.out.println("==============================");
//            System.out.println("            MENU              ");
//            System.out.println("==============================");
//            System.out.println("""
//                    1. Add data
//                    2. Show data
//                    3. Edit data
//                    4. Delete data
//                    5. Back to Login
//                    ==============================""");
//            System.out.print("Choice Input : ");
//            choice = input.nextLine();
//            switch (choice) {
//                case "1" -> data1.input();
//                case "2" -> data1.Searchdata();
//                case "3" -> data1.editJenisSepatu();
//                case "4" -> data1.MenuDelete();
//                case "5" -> System.out.println("Back...");
//                default -> System.err.print("Wrong input!!!!");
//            }
//        } while (!choice.equals("5"));
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
////public class Crud {
////    String Ussername,Passwordword;
////    Scanner input = new Scanner(System.in);
////    Login data1 = new Login();
////    MethodDataSepatu sepatu = new MethodDataSepatu();
////    public void menulogin() {
////        String choicean;
////        do {
////            System.out.println("==============================");
////            System.out.println("         TOKO SEPATU          ");
////            System.out.println("            KYONI             ");
////            System.out.println("==============================");
////            System.out.println("            LOGIN             ");
////            System.out.println("==============================");
////            System.out.println("1. Login");
////            System.out.println("2. Leave");
////            System.out.println("==============================");
////            System.out.print("Choice Input = ");
////            choicean = input.nextLine();
////            switch (choicean) {
////                case "1" -> input();
////                case "2"-> System.out.println("Leave...");
////                default -> System.err.print("Wrong input!!!!");
////
////            }
////        }while (!choicean .equals("2"));
////    }
////
////    public void menu() {
////        String choice;
////        do {
////            System.out.println("==============================");
////            System.out.println("         TOKO SEPATU          ");
////            System.out.println("            KYONI             ");
////            System.out.println("==============================");
////            System.out.println("            MENU              ");
////            System.out.println("==============================");
////            System.out.println("""
////                    1. Add data
////                    2. Show data
////                    3. Edit data
////                    4. Delete data
////                    5. Exit
////                    ==============================
////                    choice :""");
////            System.out.print("Choice Input = ");
////            choice = input.nextLine();
////            switch (choice) {
////                case "1" -> sepatu.input();
////                case "2" -> sepatu.Searchdata();
////                case "3" -> sepatu.editDataSepatu();
////                case "4" -> sepatu.MenuDelete();
////                case "5" -> System.out.println("Leave..");
////                default -> System.err.print("Wrong input!!!!");
////            }
////        }while (!choice.equals("5"));
////    }
////
////    public void input(){
////        System.out.println();
////        System.out.print("Enter Username : ");
////        Ussername = input.nextLine();
////        System.out.print("Enter Password : ");
////        Passwordword = input.nextLine();
////        login(Ussername, Passwordword);
////    }
////
////    public void login(String Ussername, String Password){
////        if (data1.getUsername().equals(Ussername)&&data1.getPassword().equals(Password)){
////            menu();
////        } else {
////            System.out.println("Invalid Username & Password!");
////        }
////    }
////
////    public void insert() {
////        String Ussername = "yu";
////        String Password = "123";
////
////        data1 = new Login(Ussername, Password);
////    }
////}
