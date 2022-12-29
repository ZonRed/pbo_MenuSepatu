package view;

import entity.DataSepatu;
import entity.JenisSepatu;
import controller.DataSepatuController;
import model.DataSepatuModel;

import java.util.Scanner;

public class DataSepatuView {
    DataSepatuController data = new DataSepatuController();
    Scanner input = new Scanner(System.in);
        public void menu() {
        String choice;
        do {
            System.out.println("==============================");
            System.out.println("         TOKO SEPATU          ");
            System.out.println("            KYONI             ");
            System.out.println("==============================");
            System.out.println("            MENU              ");
            System.out.println("==============================");
            System.out.println("""
                    1. Add data
                    2. Show data
                    3. Edit data
                    4. Delete data
                    5. Back to Login
                    ==============================""");
            System.out.print("Choice Input : ");
            choice = input.nextLine();
            switch (choice) {
                case "1" -> input();
                case "2" -> Searchdata();
                case "3" -> editJenisSepatu();
                case "4" -> MenuDelete();
                case "5" -> System.out.println("Back...");
                default -> System.err.print("Wrong input!!!!");
            }
        } while (!choice.equals("5"));
    }
    private void input(){
        System.out.println("====================================================");
        System.out.println("Id      :(masukkan misal Data 1, untuk setiap input)");
        System.out.println("SNEAKERS:(ISI BERAPA YANG MAU DI AMBIL)             ");
        System.out.println("SPORT   :(ISI BERAPA YANG MAU DI AMBIL)             ");
        System.out.println("BAHAN   :KULIT SAPI & BABI                          ");
        System.out.println("UKURAN  :30 - 45                                    ");
        System.out.println("====================================================");
        System.out.print("Id      : ");
        String Id = input.nextLine();
        System.out.print("Sneakers: ");
        String Sneakers = input.nextLine();
        System.out.print("Sport: ");
        String Sport = input.nextLine();
        System.out.print("Bahan   : ");
        String Bahan = input.nextLine();
        System.out.print("ukuran  : ");
        int Ukuran = input.nextInt();
        input.nextLine();
        data.tambah(Sneakers,Sport,Bahan,Id,Ukuran);
    }

        public void Searchdata (){
        if(DataSepatuModel.all().isEmpty()){
            System.out.println("Data Is Empty");
        }
        else{
            for(JenisSepatu viewdata : DataSepatuModel.all()){
                System.out.println("============================");
                System.out.println("Data sepatu");
                System.out.println("============================");
                System.out.println("Id      : " + viewdata.getId());
                System.out.println("Sneakers: " + viewdata.getSneakers());
                System.out.println("Sport   : " + viewdata.getSport());
                System.out.println("Bahan   : " + viewdata.getBahan());
                System.out.println("Ukuran  : " + viewdata.getUkuran());
                System.out.println("============================");
            }
        }
    }

    public void editJenisSepatu() {
        String Choice;
        Searchdata();
        System.out.println("====================================================");
        System.out.println("Id      :(masukkan misal Data 1, untuk setiap input)");
        System.out.println("SNEAKERS:(ISI BERAPA YANG MAU DI AMBIL)             ");
        System.out.println("SPORT   :(ISI BERAPA YANG MAU DI AMBIL)             ");
        System.out.println("BAHAN   :KULIT SAPI & BABI                          ");
        System.out.println("UKURAN  :30 - 45                                    ");
        System.out.println("====================================================");
        System.out.print("Search Id for edit : ");
        Choice = input.nextLine();
        JenisSepatu jenis = DataSepatuModel.cari(Choice);
        if(jenis!=null){
            System.out.println("==============================");
            System.out.print("Sneakers Baru : ");
            String Sneakers = input.nextLine();
            System.out.print("Sport Baru    : ");
            String Sport = input.nextLine();
            System.out.print("Bahan Baru    : ");
            String Bahan = input.nextLine();
            System.out.print("Ukuran Baru   : ");
            int Ukuran = input.nextInt();
            input.nextLine();
            System.out.println("==============================");

            jenis.setSneakers(Sneakers);
            jenis.setSport(Sport);
            jenis.setBahan(Bahan);
            jenis.setUkuran(Ukuran);
        }
        else{
            System.out.println("Data Is Empty");
        }
    }

    public void MenuDelete() {
        String Choice;
        System.out.println("====================================================");
        System.out.println("Id      :(masukkan misal Data 1, untuk setiap input)");
        System.out.println("SNEAKERS:(ISI BERAPA YANG MAU DI AMBIL)             ");
        System.out.println("SPORT   :(ISI BERAPA YANG MAU DI AMBIL)             ");
        System.out.println("BAHAN   :KULIT SAPI & BABI                          ");
        System.out.println("UKURAN  :30 - 45                                    ");
        System.out.println("====================================================");
        System.out.print("Search Id For Delete : ");
        Choice = input.nextLine();
        System.out.println("==============================");
        boolean data1 = data.cariId(Choice);
        JenisSepatu jenis = new JenisSepatu();
        if(data1){
            data.hapus(Choice);
            System.out.println("data " + jenis.getId() + " Clear Done");
        }
        else{
            System.out.println("Data Is Empty");
        }
    }
}
