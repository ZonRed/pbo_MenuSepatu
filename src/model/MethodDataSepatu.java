package model;

import entity.DataSepatu;

import java.util.ArrayList;
import java.util.Scanner;

public class MethodDataSepatu extends DataSepatu {
    String Sepatu,Bahan,Id;
    int Ukuran;
    ArrayList <DataSepatu> data1 = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    public MethodDataSepatu() {
        super();
    }

    public void input(){
        System.out.println("==================================================");
        System.out.println("Id    : (masukkan misal Data 1, untuk setiap input");
        System.out.println("SEPATU: SNEAKERS DAN SPORT                        ");
        System.out.println("BAHAN : KULIT SAPI & BABI                         ");
        System.out.println("UKURAN: 30 - 45                                   ");
        System.out.println("==================================================");
        System.out.print("Id     : ");
        Id = in.nextLine();
        System.out.print("Sepatu : ");
        Sepatu = in.nextLine();
        System.out.print("Bahan  : ");
        Bahan = in.nextLine();
        System.out.print("ukuran : ");
        Ukuran = in.nextInt();
        System.out.println("==============================");
        in.nextLine();

        DataSepatu data = new DataSepatu(Sepatu,Bahan,Id,Ukuran);
        data1.add(data);
    }

    public void Searchdata (){
        if(data1.isEmpty()){
            System.out.println("Data Is Empty");
        }
        else{
            for(DataSepatu viewdata : data1){
                System.out.println("============================");
                System.out.println("Data sepatu");
                System.out.println("============================");
                System.out.println("Id      : " + viewdata.getId());
                System.out.println("Sepatu  : " + viewdata.getSepatu());
                System.out.println("Bahan   : " + viewdata.getBahan());
                System.out.println("Ukuran  : " + viewdata.getUkuran());
                System.out.println("============================");
            }
        }
    }

    public DataSepatu SearchDataSepatu (String Id){
        for (DataSepatu dataid : data1){
            if(dataid.getId().equals(Id)){
                return dataid;
            }
        }
        return null;
    }

    public void Searchdata(DataSepatu DataSearch) {
        int index = indexData(DataSearch);
        data1.get(index).setId(DataSearch.getId());
        data1.get(index).setSepatu(DataSearch.getSepatu());
        data1.get(index).setBahan(DataSearch.getBahan());
        data1.get(index).setUkuran(DataSearch.getUkuran());
    }

    public void editDataSepatu() {
        String Choice;
        Searchdata();
        System.out.println("==================================================");
        System.out.println("Id    : (masukkan misal Data 1, untuk setiap input");
        System.out.println("SEPATU: SNEAKERS DAN SPORT                        ");
        System.out.println("BAHAN : KULIT SAPI & BABI                         ");
        System.out.println("UKURAN: 30 - 45                                   ");
        System.out.println("==================================================");
        System.out.print("Search Id for edit : ");
        Choice = in.nextLine();
        DataSepatu DataSearch = SearchDataSepatu(Choice);
        if(DataSearch!=null){
            System.out.println("==============================");
            System.out.print("Id          : ");
            Id = in.nextLine();
            System.out.print("Sepatu Baru : ");
            Sepatu = in.nextLine();
            System.out.print("Bahan Baru  : ");
            Bahan = in.nextLine();
            System.out.print("Ukuran Baru : ");
            Ukuran = in.nextInt();
            System.out.println("==============================");
            DataSearch.setSepatu(Id);
            DataSearch.setSepatu(Sepatu);
            DataSearch.setBahan(Bahan);
            DataSearch.setUkuran(Ukuran);
            Searchdata(DataSearch);
        }
        else{
            System.out.println("Data Is Empty");
        }
    }

    public void MenuDelete() {
        String Choice;
        System.out.println("==================================================");
        System.out.println("Id    : (masukkan misal Data 1, untuk setiap input");
        System.out.println("SEPATU: SNEAKERS DAN SPORT                        ");
        System.out.println("BAHAN : KULIT SAPI & BABI                         ");
        System.out.println("UKURAN: 30 - 45                                   ");
        System.out.println("==================================================");
        System.out.print("Search Id For Delete : ");
        Choice = in.nextLine();
        System.out.println("==============================");
        DataSepatu DataSearch = SearchDataSepatu(Choice);
        if(DataSearch!=null){
            Clear(DataSearch);
            System.out.println("data " +DataSearch.getId()+ " Clear Done");
        }
        else{
            System.out.println("Data Is Empty");
        }
    }

    public void Clear(DataSepatu DataSearch){
        data1.remove(DataSearch);
    }

    public int indexData(DataSepatu DataSearch){
        return data1.indexOf(DataSearch);
    }
}
