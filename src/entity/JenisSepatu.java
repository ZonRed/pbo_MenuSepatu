package entity;

public class JenisSepatu extends DataSepatu {
    String Sneakers,Sport;
    public JenisSepatu(String Sneakers,String Sport, String Bahan, String Id, int Ukuran) {
        super(Bahan, Id, Ukuran);
        this.Sneakers = Sneakers;
        this.Sport = Sport;
    }
    //penerapan override
    @Override
    public String getSneakers() {
        return Sneakers;
    }
    @Override
    public void setSneakers(String Sneakers) {
        this.Sneakers = Sneakers;
    }
    @Override
    public String getSport() {
        return Sport;
    }
    @Override
    public void setSport(String Sport) {
        this.Sport = Sport;
    }
}