//package model;
//
//import entity.JenisSepatu;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class MethodDataSepatu {
//    String Bahan,Id,Sneakers,Sport;
//    int Ukuran;
//    ArrayList <JenisSepatu> data1 = new ArrayList<>();
//    Scanner in = new Scanner(System.in);
//
//    public void input(){
//        System.out.println("====================================================");
//        System.out.println("Id      :(masukkan misal Data 1, untuk setiap input)");
//        System.out.println("SNEAKERS:(ISI BERAPA YANG MAU DI AMBIL)             ");
//        System.out.println("SPORT   :(ISI BERAPA YANG MAU DI AMBIL)             ");
//        System.out.println("BAHAN   :KULIT SAPI & BABI                          ");
//        System.out.println("UKURAN  :30 - 45                                    ");
//        System.out.println("====================================================");
//        System.out.print("Id      : ");
//        Id = in.nextLine();
//        System.out.print("Sneakers: ");
//        Sneakers = in.nextLine();
//        System.out.print("Sport: ");
//        Sport = in.nextLine();
//        System.out.print("Bahan   : ");
//        Bahan = in.nextLine();
//        System.out.print("ukuran  : ");
//        Ukuran = in.nextInt();
//        in.nextLine();
//        JenisSepatu data = new JenisSepatu(Sneakers,Sport,Bahan,Id,Ukuran);
//        data1.add(data);
//    }
//
//    public void Searchdata (){
//        if(data1.isEmpty()){
//            System.out.println("Data Is Empty");
//        }
//        else{
//            for(JenisSepatu viewdata : data1){
//                System.out.println("============================");
//                System.out.println("Data sepatu");
//                System.out.println("============================");
//                System.out.println("Id      : " + viewdata.getId());
//                System.out.println("Sneakers: " + viewdata.getSneakers());
//                System.out.println("Sport   : " + viewdata.getSport());
//                System.out.println("Bahan   : " + viewdata.getBahan());
//                System.out.println("Ukuran  : " + viewdata.getUkuran());
//                System.out.println("============================");
//            }
//        }
//    }
//
//    public JenisSepatu SearchJenisSepatu (String Id){
//        for (JenisSepatu dataid : data1){
//            if(dataid.getId().equals(Id)){
//                return dataid;
//            }
//        }
//        return null;
//    }
//
//    public void Searchdata(JenisSepatu DataSearch) {
//        int index = indexData(DataSearch);
//        data1.get(index).setId(DataSearch.getId());
//        data1.get(index).setSneakers(DataSearch.getSneakers());
//        data1.get(index).setSport(DataSearch.getSport());
//        data1.get(index).setBahan(DataSearch.getBahan());
//        data1.get(index).setUkuran(DataSearch.getUkuran());
//    }
//
//    public void editJenisSepatu() {
//        String Choice;
//        Searchdata();
//        System.out.println("====================================================");
//        System.out.println("Id      :(masukkan misal Data 1, untuk setiap input)");
//        System.out.println("SNEAKERS:(ISI BERAPA YANG MAU DI AMBIL)             ");
//        System.out.println("SPORT   :(ISI BERAPA YANG MAU DI AMBIL)             ");
//        System.out.println("BAHAN   :KULIT SAPI & BABI                          ");
//        System.out.println("UKURAN  :30 - 45                                    ");
//        System.out.println("====================================================");
//        System.out.print("Search Id for edit : ");
//        Choice = in.nextLine();
//        JenisSepatu DataSearch = SearchJenisSepatu(Choice);
//        if(DataSearch!=null){
//            System.out.println("==============================");
//            System.out.print("Sneakers Baru : ");
//            Sneakers = in.nextLine();
//            System.out.print("Sport Baru    : ");
//            Sport = in.nextLine();
//            System.out.print("Bahan Baru    : ");
//            Bahan = in.nextLine();
//            System.out.print("Ukuran Baru   : ");
//            Ukuran = in.nextInt();
//            in.nextLine();
//            System.out.println("==============================");
//            DataSearch.setSneakers(Sneakers);
//            DataSearch.setSport(Sport);
//            DataSearch.setBahan(Bahan);
//            DataSearch.setUkuran(Ukuran);
//            Searchdata(DataSearch);
//        }
//        else{
//            System.out.println("Data Is Empty");
//        }
//    }
//
//    public void MenuDelete() {
//        String Choice;
//        System.out.println("====================================================");
//        System.out.println("Id      :(masukkan misal Data 1, untuk setiap input)");
//        System.out.println("SNEAKERS:(ISI BERAPA YANG MAU DI AMBIL)             ");
//        System.out.println("SPORT   :(ISI BERAPA YANG MAU DI AMBIL)             ");
//        System.out.println("BAHAN   :KULIT SAPI & BABI                          ");
//        System.out.println("UKURAN  :30 - 45                                    ");
//        System.out.println("====================================================");
//        System.out.print("Search Id For Delete : ");
//        Choice = in.nextLine();
//        System.out.println("==============================");
//        JenisSepatu DataSearch = SearchJenisSepatu(Choice);
//        if(DataSearch!=null){
//            Clear(DataSearch);
//            System.out.println("data " +DataSearch.getId()+ " Clear Done");
//        }
//        else{
//            System.out.println("Data Is Empty");
//        }
//    }
//
//    public void Clear(JenisSepatu DataSearch){
//        data1.remove(DataSearch);
//    }
//
//    public int indexData(JenisSepatu DataSearch){
//        return data1.indexOf(DataSearch);
//    }
//}
