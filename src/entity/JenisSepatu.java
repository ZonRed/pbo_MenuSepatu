package entity;

public class JenisSepatu extends DataSepatu {
    String Sneakers,Sport;

    public JenisSepatu(String Sneakers,String Sport, String Bahan, String Id, int Ukuran) {
        super(Bahan, Id, Ukuran);
        this.Sneakers = Sneakers;
        this.Sport = Sport;
    }
    public String getSneakers() {
        return Sneakers;
    }
    public void setSneakers(String Sneakers) {
        this.Sneakers = Sneakers;
    }
    public String getSport() {
        return Sport;
    }
    public void setSport(String Sport) {
        this.Sport = Sport;
    }
}