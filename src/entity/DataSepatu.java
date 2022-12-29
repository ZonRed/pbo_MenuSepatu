package entity;

public abstract class DataSepatu {
    private String Id,Bahan;
    private int Ukuran;
    public DataSepatu(String Bahan,String Id, int Ukuran) {
        this.Bahan = Bahan;
        this.Ukuran = Ukuran;
        this.Id = Id;
    }
    public DataSepatu() {
    }
    public String getId() {
        return Id;
    }
    public void setId(String Id) {
        this.Id = Id;
    }
    public String getBahan() {
        return Bahan;
    }
    public void setBahan(String Bahan) {
        this.Bahan = Bahan;
    }
    public int getUkuran() {
        return Ukuran;
    }
    public void setUkuran(int Ukuran) {
        this.Ukuran = Ukuran;
    }

    //class abstract
    public abstract String getSneakers();

    public abstract void setSneakers(String Sneakers);

    public abstract String getSport();

    public abstract void setSport(String Sport);
}
