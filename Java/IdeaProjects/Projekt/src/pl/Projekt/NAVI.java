package pl.Projekt;

public class NAVI implements Magazyn{
    private String ID;
    private String marka;
    private  String model;
    private double diagonal;
    private map map;
    private boolean fotoradar;

    public NAVI(String ID, String marka, String model, double diagonal, pl.Projekt.map map, boolean fotoradar) {
        this.ID = "NAVI_"+ID;
        this.marka = marka;
        this.model = model;
        this.diagonal = diagonal;
        this.map = map;
        this.fotoradar = fotoradar;
    }

    @Override
    public String toString() {
        return
                "ID=" + ID +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", diagonal=" + diagonal +
                ", map=" + map +
                ", fotoradar=" + fotoradar;
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

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(float diagonal) {
        this.diagonal = diagonal;
    }

    public pl.Projekt.map getMap() {
        return map;
    }

    public void setMap(pl.Projekt.map map) {
        this.map = map;
    }

    public boolean isFotoradar() {
        return fotoradar;
    }

    public void setFotoradar(boolean fotoradar) {
        this.fotoradar = fotoradar;
    }
}
