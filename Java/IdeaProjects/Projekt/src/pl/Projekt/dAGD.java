package pl.Projekt;

public class dAGD implements AGD, Magazyn {
    private String ID;
    private String marka;
    private String model;
    private duzeAGD rodzaj;
    private boolean zabudowa;

    public dAGD(String ID, String marka, String model, duzeAGD rodzaj, boolean zabudowa) {
        this.ID = "dAGD_"+ID;
        this.marka = marka;
        this.model = model;
        this.rodzaj = rodzaj;
        this.zabudowa = zabudowa;
    }

    @Override
    public String toString() {
        return
                "ID=" + ID +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", rodzaj=" + rodzaj;
    }

    @Override
    public boolean czyZabudowa() {
        boolean x = isZabudowa();

        if (x == true){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isZabudowa() {
        return zabudowa;
    }

    public void setZabudowa(boolean zabudowa) {
        this.zabudowa = zabudowa;
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

    public duzeAGD getRodzaj() {
        return rodzaj;
    }

    public void setRodzaj(duzeAGD rodzaj) {
        this.rodzaj = rodzaj;
    }
}
