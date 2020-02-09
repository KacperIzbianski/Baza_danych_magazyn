package pl.Projekt;

public class Komp extends IT implements Magazyn{
    private String ID;
    private String Marka;
    private String model;
    private  String processor;
    private int  RAM;
    private String disc;
    private String system;
    private String casing;

    public Komp(String ID, String marka, String model, String processor, int RAM, String disc, String system, String casing) {
        this.ID = "KOMP_"+ID;
        this.Marka = marka;
        this.model = model;
        this.processor = processor;
        this.RAM = RAM;
        this.disc = disc;
        this.system = system;
        this.casing = casing;
    }

    @Override
    public String toString() {
        return
                "ID="+  ID +
                ", Marka='" + Marka + '\'' +
                ", Model='" + model + '\'' +
                ", Processor='" + processor + '\'' +
                ", RAM=" + RAM +
                ", Disc=" + disc +
                ", System=" + system +
                ", Obudowa='" + casing + '\'';
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

    public String getCasing() {
        return casing;
    }

    public void setCasing(String casing) {
        this.casing = casing;
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
