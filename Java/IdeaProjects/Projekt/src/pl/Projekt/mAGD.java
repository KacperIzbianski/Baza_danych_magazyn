package pl.Projekt;

public class mAGD implements AGD, Magazyn{
    private String ID;
    private String marka;
    private String model;
    private maleAGD rodzaj;


    @Override
    public boolean czyZabudowa() {
        return false;
    }

    public mAGD(String ID, String marka, String model, maleAGD rodzaj) {
        this.ID = "mAGD_"+ID;
        this.marka = marka;
        this.model = model;
        this.rodzaj = rodzaj;
    }

    @Override
    public String toString() {
        return
                "ID=" + ID  +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", rodzaj=" + rodzaj;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public maleAGD getRodzaj() {
        return rodzaj;
    }

    public void setRodzaj(maleAGD rodzaj) {
        this.rodzaj = rodzaj;
    }
}
