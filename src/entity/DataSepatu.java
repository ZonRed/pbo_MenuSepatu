package entity;

public class DataSepatu {
    private String Sepatu,Id,Bahan,Jenis;
    private int Ukuran;
    public DataSepatu(String Sepatu, String Bahan, String Id, String id, int Ukuran) {
        this.Sepatu = Sepatu;
        this.Bahan  = Bahan;
        this.Ukuran = Ukuran;
        this.Id = Id;
    }

    public DataSepatu(String jenis) {
    }
    public String getJenis() {
        return Jenis;
    }
    public void setJenis(String Jenis) {
        this.Jenis = Jenis;
    }
    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getSepatu() {
        return Sepatu;
    }

    public void setSepatu(String Sepatu) {
        this.Sepatu = Sepatu;
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

}
