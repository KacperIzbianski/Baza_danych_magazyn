package pl.Projekt;


public class CE implements Magazyn{
    private  String ID;
    private String manufacturer;
    private String model;
    private pl.Projekt.Matrix matrix;
    private int diagonal;




    public CE(String id, String manufacture, String model, pl.Projekt.Matrix matrix, int diagonal) {
        this.ID = "TV_"+id;
        this.manufacturer = manufacture;
        this.model = model;
        this.matrix = matrix;
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return
                "ID="+  ID +
                ", Marka='" + manufacturer + '\'' +
                ", Model='" + model + '\'' +
                ", Matryca=" + matrix +
                ", Przekątna(cale)=" + diagonal;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Matrix getMatrix() {
        return matrix;
    }

    public void setMatrix(Matrix matrix) {
        this.matrix = matrix;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }


}