package pl.Projekt;

public class GSM implements  Magazyn{
    private String ID;
    private String marka;
    private String model;
    private double diagonal;
    private SOGSM system;

    public GSM(String ID, String marka, String model, double diagonal, SOGSM system) {
        this.ID = "GSM_"+ID;
        this.marka = marka;
        this.model = model;
        this.diagonal = diagonal;
        this.system = system;
    }

    @Override
    public String toString() {
        return
                "ID=" +"GSM_"+ ID +
                ", Marka='" + marka + '\'' +
                ", Model='" + model + '\'' +
                ", Przekątna=" + diagonal +
                ", System=" + system;
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

    public SOGSM getSystem() {
        return system;
    }

    public void setSystem(SOGSM system) {
        this.system = system;
    }
}
