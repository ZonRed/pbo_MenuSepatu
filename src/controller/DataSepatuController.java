package controller;

import model.DataSepatuModel;
import entity.JenisSepatu;
import view.DataSepatuView;

public class DataSepatuController {

    public void toViewAdmin(){
        DataSepatuView data = new DataSepatuView();
        data.menu();
    }
    public void tambah(String Sneakers,String Sport, String Bahan, String Id, int Ukuran){
        DataSepatuModel.insert(Sneakers,Sport,Bahan,Id,Ukuran);
    }
    public boolean cariId(String id){
        JenisSepatu jenis = DataSepatuModel.cari(id);
        if(jenis!=null){
          return true;
        }
        else {
            return false;
        }
    }

    public void hapus(String id){
        DataSepatuModel.hapus(id);
    }
}