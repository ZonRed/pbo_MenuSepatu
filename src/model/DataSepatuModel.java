package model;

import entity.JenisSepatu;
import java.util.ArrayList;

public class DataSepatuModel {
    static ArrayList<JenisSepatu> arraySepatu = new ArrayList<>();

    public static void insert(String Sneakers,String Sport, String Bahan, String Id, int Ukuran){
        arraySepatu.add(new JenisSepatu(Sneakers,Sport,Bahan,Id,Ukuran));
    }

    public static ArrayList<JenisSepatu> all(){
        return arraySepatu;
    }

    public static JenisSepatu cari(String id){
        for(JenisSepatu objek : arraySepatu){
            if (objek.getId().equals(id)){
                return objek;
            }
        }
        return null;
    }

    public static void hapus(String id){
        int index = cariIndex(id);

        if(index!=-1){
            arraySepatu.remove(index);
        }
    }

    public static int cariIndex(String id){
        JenisSepatu jenis = cari(id);
        return arraySepatu.indexOf(jenis);
    }
}
