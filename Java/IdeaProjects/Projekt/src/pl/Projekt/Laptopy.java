package pl.Projekt;



public class Laptopy extends IT implements Magazyn{
    private String ID;
    private String Marka;
    private String model;
    private laptopMatrix matrix;
    private  String processor;
    private int  RAM;
    private String disc;
    private String system;



    public Laptopy(String id, String a , String b, laptopMatrix matrix, String c , int ram, String disc , String system){
        this.ID = "LAPT_"+id;
        this.Marka = a;
        this.model = b;
        this.matrix = matrix;
        this.disc = disc;
        this.processor = c;
        this.RAM = ram;
        this.system = system;

    }

    @Override
    public String toString() {
        return
                "ID=" + ID +
                        ", Marka='" + Marka + '\'' +
                        ", Model='" + model + '\'' +
                        ", Matryca=" + matrix +
                        ", Processor='" + processor + '\'' +
                        ", RAM=" + RAM +
                        ", Disc=" + disc +
                        ", System=" + system ;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public laptopMatrix getMatrix() {
        return matrix;
    }

    public void setMatrix(laptopMatrix matrix) {
        this.matrix = matrix;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public String getDisc() {
        return disc;
    }

    public void setDisc(String disc) {
        this.disc = disc;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getMarka() {
        return Marka;
    }

    public void setMarka(String marka) {
        Marka = marka;
    }

    @Override
    public int ramToMb() {
        int x = getRAM();
        x = x*1024;
        return x;
    }
}
