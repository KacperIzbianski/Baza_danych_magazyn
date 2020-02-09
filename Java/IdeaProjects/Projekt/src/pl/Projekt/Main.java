package pl.Projekt;



import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

import java.lang.*;

public class Main {

    private static int counter = 1;



    CopyOnWriteArrayList<CE> tvList = new CopyOnWriteArrayList<CE>();
    CopyOnWriteArrayList<GSM> gsmList = new CopyOnWriteArrayList<GSM>();
    CopyOnWriteArrayList<IT> itList = new CopyOnWriteArrayList<IT>();
    CopyOnWriteArrayList<Laptopy> lapList = new CopyOnWriteArrayList<Laptopy>();
    CopyOnWriteArrayList<Komp> kompList = new CopyOnWriteArrayList<Komp>();
    CopyOnWriteArrayList<NAVI> naviList = new CopyOnWriteArrayList<NAVI>();
    CopyOnWriteArrayList<mAGD> magdList = new CopyOnWriteArrayList<mAGD>();
    CopyOnWriteArrayList<dAGD> dagdList = new CopyOnWriteArrayList<dAGD>();
    CopyOnWriteArrayList<AGD> agdList = new CopyOnWriteArrayList<AGD>();
    CopyOnWriteArrayList<Magazyn> magazyn = new CopyOnWriteArrayList<Magazyn>();
    ArrayList<Magazyn> temp = new ArrayList<Magazyn>();


    public static void main(String[] args) {

        Main main=new Main();
        main.dodajElementy();
        main.menu();


        //CE ce1 = new CE("Samsung", "UE55",CE.Matrix.QLED);
        // CE ce2 = new CE("LG", "C9",CE.Matrix.OLED);
        // CE ce3 = new CE("Toshiba", "FSW15PO", CE.Matrix.LED);
        // ce1.show();
        // ce2.show();
        // ce3.show();

        // ce1 = null;
        // ce2 = null;
        // ce3 = null;




    }

    private void dodajElementy() {
        CE o1 = new CE("258", "Samsung", "Q70", Matrix.QLED, 65);
        CE o2 = new CE("259", "LG", "OLED C9", Matrix.OLED, 65);
        mAGD o3 = new mAGD("856", "Zelmer", "5069", maleAGD.blender);
        mAGD o4 = new mAGD("857", "Krup", "EPA5089", maleAGD.ekspres_ciśnieniowy);
        dAGD o5 = new dAGD("525", "Samsung", "RB58495R58", duzeAGD.Lodówka , false);
        dAGD o6 = new dAGD("526", "Siemens", "S85RT8", duzeAGD.Z_Zmywarka, true);
        Komp o7 = new Komp("1058", "Msi", "Infinity 589", "Intel Core i9", 16, "1000 SSD", "Windows10", "Tower");
        Komp o8 = new Komp("1059", "Dell", "Optidesktop", "Intel Core i3", 4, "1000 HDD", "Windows10", "miniTower");
        Laptopy o9 = new Laptopy("1258", "Hp", "PavilionGaming", laptopMatrix.błyszcząca, "Intel Core i7", 8, "256 SSD + 1000 HDD", "Windows10");
        GSM o10 = new GSM("9514", "Samsung","A51", 6.57, SOGSM.Android);
        GSM o11 = new GSM("9558", "iPhone","6s", 5.85, SOGSM.iOS);
        NAVI o12 = new NAVI("8547", "TOMTOM", "Essensial 9", 6.5, map.EU, true);
        tvList.add(o1);
        tvList.add(o2);
        magdList.add(o3);
        magdList.add(o4);
        dagdList.add(o5);
        dagdList.add(o6);
        agdList.add(o3);
        agdList.add(o4);
        agdList.add(o5);
        agdList.add(o6);
        kompList.add(o7);
        kompList.add(o8);
        lapList.add(o9);
        itList.add(o7);
        itList.add(o8);
        itList.add(o9);
        gsmList.add(o10);
        gsmList.add(o11);
        naviList.add(o12);
        magazyn.add(o1);
        magazyn.add(o2);
        magazyn.add(o3);
        magazyn.add(o4);
        magazyn.add(o5);
        magazyn.add(o6);
        magazyn.add(o7);
        magazyn.add(o8);
        magazyn.add(o9);
        magazyn.add(o10);
        magazyn.add(o11);
        magazyn.add(o12);

    }

    public void pokazMenu(){
        System.out.println("Wybierz opcję:\n1. Dodaj nowy indeks\n2. Usuń indeks\n3. Wyświetl wszystkie indeksy\n4. Wyświetl indeksy danego podtypu\n5. Wyświetl indeks z ciągiem znaków\n6. Operacje\n7. Koniec ");




    }
    public void pokazMenuObiekt(){
        System.out.println("Wybierz dział do którego dodasz indeks:\n1. Telewizory\n2. AGD\n3. IT\n4. GSM\n5. NAVI\n6. Powrót");

    }
    public void pokazMenuWyswtietlObiekt(){
        System.out.println("Wybierz dział który chcesz zobaczyć:\n1. Telewizory\n2. AGD\n3. IT\n4. GSM\n5. NAVI\n6. Powrót");

    }
    private void pokazMenuUsun() {
        System.out.println("Wybierz dział z którego chcesz usunąć indeks:\n1. Telewizory\n2. AGD\n3. IT\n4. GSM\n5. NAVI\n6. Powrót");
    }


    public void dodajCE(){

        System.out.println("Podaj ID produktu:\n");
        Scanner id = new Scanner(System.in);
        String id1 = id.nextLine();
        try{
            Integer.parseInt(id1);
        }
        catch (NumberFormatException e){
            System.out.println("Wprowadz liczbę");
            dodajCE();
        }
        catch (NullPointerException e){
            System.out.println("Nie wprowadzono żadnego znaku");
            dodajCE();
        }
        for (CE i :tvList){
            String y = i.getID();
            String x = "TV_"+ id1;
            if(y.equals(x)){
                System.out.println("Wprowadzony identyfikator jest zajęty wprowadz inny");
                dodajCE();
            }
        }
        System.out.println("Podaj Producenta\n");
        Scanner option = new Scanner( System.in );
        String manufacture = option.nextLine();
        System.out.println("Podaj Model\n");
        Scanner option1 = new Scanner( System.in );
        String model = option1.nextLine();
        System.out.println("Podaj przekątną ekranu(w calach):\n");
        Scanner diagonal = new Scanner(System.in);
        int diagonal1 = 0;
        try {
            diagonal1 = diagonal.nextInt();
        }
        catch(Exception e){
            System.out.println("Nie wprowadzono liczby - Przekątną podajemy w calach (liczba) - Wracasz na początek");
            dodajCE();
        }
        System.out.println("Wybierz matryce z poniższych (numer):\n1. QLED\n2. OLED\n3. NANOCELL\n4. LED\n");
        Scanner option2 = new Scanner( System.in );
        int matrix = option2.nextInt();
        System.out.println(matrix);

        do {

            switch (matrix) {
                case 1:
                    CE o1 = new CE(id1,manufacture, model, Matrix.QLED, diagonal1);
                    tvList.add(o1);
                    magazyn.add(o1);
                    System.out.println("Done");
                    menu();
                case 2:
                    CE o2 = new CE(id1,manufacture, model, Matrix.OLED, diagonal1);
                    tvList.add(o2);
                    magazyn.add(o2);
                    System.out.println("Done");
                    menu();
                case 3:
                    CE o3 = new CE(id1,manufacture, model, Matrix.NANOCELL, diagonal1);
                    tvList.add(o3);
                    magazyn.add(o3);
                    System.out.println("Done");
                    menu();
                case 4:
                    CE o4 = new CE(id1, manufacture, model, Matrix.LED, diagonal1);
                    tvList.add(o4);
                    magazyn.add(o4);
                    System.out.println("Done");
                    menu();
            }
        }
        while(matrix <5);
        menu();

    }
    public void dodajAGD(){
        System.out.println("Wybierz gdzie dodasz produkt: \n1. Małe AGD.\n2. Duże AGD\n3. Powrót \n");
        Scanner option = new Scanner(System.in);
        int number_option = 0;
        try {
           number_option =  option.nextInt();
        }
        catch(Exception e){
            System.out.println("Wprowadz liczbę odzwierciedlającą wybór gdzie dodajesz produkt");
            dodajAGD();
        }
        do{
            switch (number_option){

                case 1 : dodajmAGD();
                case 2 : dodajdAGD();
                case 3 : dodajObiekt();
            }
        }
        while(number_option <4);
        menu();
    }
    public void dodajmAGD(){
        System.out.println("Podaj ID produktu:\n");
        Scanner id = new Scanner(System.in);
        String id1 = id.nextLine();
        try{
            Integer.parseInt(id1);
        }
        catch (NumberFormatException e){
            System.out.println("Wprowadz liczbę");
            dodajmAGD();
        }
        catch (NullPointerException e){
            System.out.println("Nie wprowadzono żadnego znaku");
            dodajmAGD();
        }
        for (mAGD i :magdList){
            String y = i.getID();
            String x = "mAGD_"+ id1;
            if(y.equals(x)){
                System.out.println("Wprowadzony identyfikator jest zajęty wprowadz inny");
                dodajmAGD();
            }
        }
        System.out.println("Podaj Producenta\n");
        Scanner option = new Scanner( System.in );
        String manufacture = option.nextLine();
        System.out.println("Podaj Model\n");
        Scanner option1 = new Scanner( System.in );
        String model = option1.nextLine();
        System.out.println("Wybierz rodzaj produktu z poniższych (numer):\n1. Lokówka\n2. Suszarka do włosów\n3. Czajnik\n4. Ekspres ciśnieniowy\n5. Blender\n6. Mikser\n7. Robot planetarny\n8. Golarka\n9. Odkurzacz\n10. Żelazko\n");
        Scanner option2 = new Scanner( System.in );
        int matrix = option2.nextInt();
        System.out.println(matrix);

        do {

            switch (matrix) {
                case 1:
                    mAGD o1 = new mAGD(id1,manufacture, model, maleAGD.lokówka);
                    magdList.add(o1);
                    agdList.add(o1);
                    magazyn.add(o1);
                    System.out.println("Done");
                    menu();
                case 2:
                    mAGD o2 = new mAGD(id1,manufacture, model, maleAGD.suszarka_do_włosów);
                    magdList.add(o2);
                    agdList.add(o2);
                    magazyn.add(o2);
                    System.out.println("Done");
                    menu();
                case 3:
                    mAGD o3 = new mAGD(id1,manufacture, model, maleAGD.czajnik);
                    magdList.add(o3);
                    agdList.add(o3);
                    magazyn.add(o3);
                    System.out.println("Done");
                    menu();
                case 4:
                    mAGD o4 = new mAGD(id1,manufacture, model, maleAGD.ekspres_ciśnieniowy);
                    magdList.add(o4);
                    agdList.add(o4);
                    magazyn.add(o4);
                    System.out.println("Done");
                    menu();
                case 5:
                    mAGD o5 = new mAGD(id1,manufacture, model, maleAGD.blender);
                    magdList.add(o5);
                    agdList.add(o5);
                    magazyn.add(o5);
                    System.out.println("Done");
                    menu();
                case 6:
                    mAGD o6 = new mAGD(id1,manufacture, model, maleAGD.mikser);
                    magdList.add(o6);
                    agdList.add(o6);
                    magazyn.add(o6);
                    System.out.println("Done");
                    menu();
                case 7:
                    mAGD o7 = new mAGD(id1,manufacture, model, maleAGD.robot_planetarny);
                    magdList.add(o7);
                    agdList.add(o7);
                    magazyn.add(o7);
                    System.out.println("Done");
                    menu();
                case 8:
                    mAGD o8 = new mAGD(id1,manufacture, model, maleAGD.golarka);
                    magdList.add(o8);
                    agdList.add(o8);
                    magazyn.add(o8);
                    System.out.println("Done");
                    menu();
                case 9:
                    mAGD o9 = new mAGD(id1,manufacture, model, maleAGD.odkurzacz);
                    magdList.add(o9);
                    agdList.add(o9);
                    magazyn.add(o9);
                    System.out.println("Done");
                    menu();
                case 10:
                    mAGD o10 = new mAGD(id1,manufacture, model, maleAGD.żelazko);
                    magdList.add(o10);
                    agdList.add(o10);
                    magazyn.add(o10);
                    System.out.println("Done");
                    menu();
            }
        }
        while(matrix <11);
        menu();

    }
    public void dodajdAGD(){
        System.out.println("Podaj ID produktu:\n");
        Scanner id = new Scanner(System.in);
        String id1 = id.nextLine();
        try{
            Integer.parseInt(id1);
        }
        catch (NumberFormatException e){
            System.out.println("Wprowadz liczbę");
            dodajdAGD();
        }
        catch (NullPointerException e){
            System.out.println("Nie wprowadzono żadnego znaku");
            dodajdAGD();
        }
        for (dAGD i :dagdList){
            String y = i.getID();
            String x = "dAGD_"+ id1;
            if(y.equals(x)){
                System.out.println("Wprowadzony identyfikator jest zajęty wprowadz inny");
                dodajdAGD();
            }
        }
        System.out.println("Podaj Producenta\n");
        Scanner option = new Scanner( System.in );
        String manufacture = option.nextLine();
        System.out.println("Podaj Model\n");
        Scanner option1 = new Scanner( System.in );
        String model = option1.nextLine();
        System.out.println("Wybierz rodzaj produktu z poniższych (numer):\n1. Pralka\n2. Lodówka\n3. Kuchnia\n4. Płyta gazowa\n5. Płyta indukcyjna\n6. Piekarnik\n7. Suszarka\n8. Zmywarka\n9. Okap\n10. Zmywarka do zabudowy\n11. Lodówka do zabudowy\n");
        Scanner option2 = new Scanner( System.in );
        int matrix = option2.nextInt();
        System.out.println(matrix);

        do {

            switch (matrix) {
                case 1:
                    dAGD o1 = new dAGD(id1,manufacture, model, duzeAGD.Pralka , false);
                    dagdList.add(o1);
                    agdList.add(o1);
                    magazyn.add(o1);
                    System.out.println("Done");
                    menu();
                case 2:
                    dAGD o2 = new dAGD(id1,manufacture, model, duzeAGD.Lodówka, false);
                    dagdList.add(o2);
                    agdList.add(o2);
                    magazyn.add(o2);
                    System.out.println("Done");
                    menu();
                case 3:
                    dAGD o3 = new dAGD(id1,manufacture, model, duzeAGD.Kuchnia, false);
                    dagdList.add(o3);
                    agdList.add(o3);
                    magazyn.add(o3);
                    System.out.println("Done");
                    menu();
                case 4:
                    dAGD o4 = new dAGD(id1,manufacture, model, duzeAGD.Płyta_gazowa , true);
                    dagdList.add(o4);
                    agdList.add(o4);
                    magazyn.add(o4);
                    System.out.println("Done");
                    menu();
                case 5:
                    dAGD o5 = new dAGD(id1,manufacture, model, duzeAGD.Płyta_Indukcyjna, true);
                    dagdList.add(o5);
                    agdList.add(o5);
                    magazyn.add(o5);
                    System.out.println("Done");
                    menu();
                case 6:
                    dAGD o6 = new dAGD(id1,manufacture, model, duzeAGD.Piekarnik, true);
                    dagdList.add(o6);
                    agdList.add(o6);
                    magazyn.add(o6);
                    System.out.println("Done");
                    menu();
                case 7:
                    dAGD o7 = new dAGD(id1,manufacture, model, duzeAGD.Suszarka , false);
                    dagdList.add(o7);
                    agdList.add(o7);
                    magazyn.add(o7);
                    System.out.println("Done");
                    menu();
                case 8:
                    dAGD o8 = new dAGD(id1,manufacture, model, duzeAGD.Zmywarka, false);
                    dagdList.add(o8);
                    magazyn.add(o8);
                    agdList.add(o8);
                    System.out.println("Done");
                    menu();
                case 9:
                    dAGD o9 = new dAGD(id1,manufacture, model, duzeAGD.Okap, false);
                    dagdList.add(o9);
                    agdList.add(o9);
                    magazyn.add(o9);
                    System.out.println("Done");
                    menu();
                case 10:
                    dAGD o10 = new dAGD(id1,manufacture, model, duzeAGD.Z_Zmywarka, true);
                    dagdList.add(o10);
                    agdList.add(o10);
                    magazyn.add(o10);
                    System.out.println("Done");
                    menu();
                case 11:
                    dAGD o11 = new dAGD(id1,manufacture, model, duzeAGD.Z_Lodówka, true);
                    dagdList.add(o11);
                    agdList.add(o11);
                    magazyn.add(o11);
                    System.out.println("Done");
                    menu();
            }
        }
        while(matrix <12);
        menu();

    }
    public void dodajIT(){
        System.out.println("Wybierz jaki dodasz produkt: \n1. Laptop .\n2. Komputer stacjonarny\n3. Powrót \n");
        Scanner option = new Scanner(System.in);
        int number_option = 0;
        try {
            number_option =  option.nextInt();
        }
        catch(Exception e){
            System.out.println("Wprowadz liczbę odzwierciedlającą wybór gdzie dodajesz produkt");
            dodajIT();
        }
        do{
            switch (number_option){

                case 1 : dodajLAPT();
                case 2 : dodajKOMP();
                case 3 : dodajObiekt();
            }
        }
        while(number_option <4);
        menu();


    }
    public void dodajLAPT(){
        System.out.println("Podaj ID produktu:\n");
        Scanner id = new Scanner(System.in);
        String id1 = id.nextLine();
        try{
            Integer.parseInt(id1);
        }
        catch (NumberFormatException e){
            System.out.println("Wprowadz liczbę");
            dodajLAPT();
        }
        catch (NullPointerException e){
            System.out.println("Nie wprowadzono żadnego znaku");
            dodajLAPT();
        }
        for (Laptopy i :lapList){
            String y = i.getID();
            String x = "LAPT_"+ id1;
            if(y.equals(x)){
                System.out.println("Wprowadzony identyfikator jest zajęty wprowadz inny");
                dodajLAPT();
            }
        }
        System.out.println("Podaj Producenta\n");
        Scanner option = new Scanner( System.in );
        String manufacture = option.nextLine();
        System.out.println("Podaj Model\n");
        Scanner option1 = new Scanner( System.in );
        String model = option1.nextLine();
        System.out.println("Podaj Procesor\n");
        Scanner option2 = new Scanner( System.in );
        String procesor = option1.nextLine();
        System.out.println("Podaj rodzaj dysku\n");
        Scanner option3 = new Scanner( System.in );
        String disc = option1.nextLine();
        System.out.println("Podaj nazwe systemu operacyjnego\n");
        Scanner option4 = new Scanner( System.in );
        String system = option1.nextLine();
        System.out.println("Podaj przekątną ekranu(w calach):\n");
        Scanner ram = new Scanner(System.in);
        int ram1 = 0;
        try {
            ram1 = ram.nextInt();
        }
        catch(Exception e){
            System.out.println("Nie wprowadzono liczby - Przekątną podajemy w calach (liczba) - Wracasz na początek");
            dodajLAPT();
        }
        System.out.println("Wybierz matryce z poniższych (numer):\n1. Matowa\n2. Błyszcząca\n");
        Scanner option5 = new Scanner( System.in );
        int matrix = option5.nextInt();
        System.out.println(matrix);

        do {

            switch (matrix) {
                case 1:
                    Laptopy o1 = new Laptopy(id1,manufacture, model, laptopMatrix.matowa, procesor, ram1, disc, system);
                    lapList.add(o1);
                    itList.add(o1);
                    magazyn.add(o1);
                    System.out.println("Done");
                    menu();
                case 2:
                    Laptopy o2 = new Laptopy(id1,manufacture, model, laptopMatrix.błyszcząca, procesor, ram1, disc, system);
                    lapList.add(o2);
                    itList.add(o2);
                    magazyn.add(o2);
                    System.out.println("Done");
                    menu();

            }
        }
        while(matrix <3);
        menu();
    }
    public void dodajKOMP(){
        System.out.println("Podaj ID produktu:\n");
        Scanner id = new Scanner(System.in);
        String id1 = id.nextLine();
        try{
            Integer.parseInt(id1);
        }
        catch (NumberFormatException e){
            System.out.println("Wprowadz liczbę");
            dodajKOMP();
        }
        catch (NullPointerException e){
            System.out.println("Nie wprowadzono żadnego znaku");
            dodajKOMP();
        }
        for (Komp i :kompList){
            String y = i.getID();
            String x = "KOMP_"+ id1;
            if(y.equals(x)){
                System.out.println("Wprowadzony identyfikator jest zajęty wprowadz inny");
                dodajKOMP();
            }
        }
        System.out.println("Podaj Producenta\n");
        Scanner option = new Scanner( System.in );
        String manufacture = option.nextLine();
        System.out.println("Podaj Model\n");
        Scanner option1 = new Scanner( System.in );
        String model = option1.nextLine();
        System.out.println("Podaj Procesor\n");
        Scanner option2 = new Scanner( System.in );
        String procesor = option1.nextLine();
        System.out.println("Podaj rodzaj dysku\n");
        Scanner option3 = new Scanner( System.in );
        String disc = option1.nextLine();
        System.out.println("Podaj nazwe systemu operacyjnego\n");
        Scanner option4 = new Scanner( System.in );
        String system = option1.nextLine();
        System.out.println("Podaj rodzaj obudowy\n");
        Scanner option5 = new Scanner( System.in );
        String casing = option1.nextLine();
        System.out.println("Podaj ilość pamięci ram(w GB):\n");
        Scanner ram = new Scanner(System.in);
        int ram1 = 0;
        try {
            ram1 = ram.nextInt();
        }
        catch(Exception e){
            System.out.println("Nie wprowadzono liczby - Ilość pamięci ram podajesz w GB (liczba) - Wracasz na początek");
            dodajKOMP();
        }
        Komp o2 = new Komp(id1, manufacture, model, procesor, ram1, disc, system, casing);
        kompList.add(o2);
        itList.add(o2);
        magazyn.add(o2);
        System.out.println("Done");
        menu();




    }
    public void dodajGSM(){
        System.out.println("Podaj ID produktu:\n");
        Scanner id = new Scanner(System.in);
        String id1 = id.nextLine();
        try{
            Integer.parseInt(id1);
        }
        catch (NumberFormatException e){
            System.out.println("Wprowadz liczbę");
            dodajGSM();
        }
        catch (NullPointerException e){
            System.out.println("Nie wprowadzono żadnego znaku");
            dodajGSM();
        }
        for (GSM i :gsmList){
            String y = i.getID();
            String x = "GSM_"+ id1;
            if(y.equals(x)){
                System.out.println("Wprowadzony identyfikator jest zajęty wprowadz inny");
                dodajGSM();
            }
        }
        System.out.println("Podaj Producenta\n");
        Scanner option = new Scanner( System.in );
        String manufacture = option.nextLine();
        System.out.println("Podaj Model\n");
        Scanner option1 = new Scanner( System.in );
        String model = option1.nextLine();

        System.out.println("Podaj przekątną ekranu(w calach):\n");
        Scanner diagonal = new Scanner(System.in);
        float diagonal1 = 0;
        try {
            diagonal1 = diagonal.nextInt();
        }
        catch(Exception e){
            System.out.println("Nie wprowadzono liczby - Przekątną podajemy w calach (liczba) - Wracasz na początek");
            dodajGSM();
        }
        System.out.println("Wybierz system z poniższych (numer):\n1. Android\n2. IOS\n");
        Scanner option5 = new Scanner( System.in );
        int matrix = option5.nextInt();
        System.out.println(matrix);

        do {

            switch (matrix) {
                case 1:
                    GSM o1 = new GSM(id1,manufacture, model, diagonal1, SOGSM.Android);
                    gsmList.add(o1);
                    magazyn.add(o1);
                    System.out.println("Done");
                    menu();
                case 2:
                    GSM o2 = new GSM(id1,manufacture, model, diagonal1, SOGSM.iOS);
                    gsmList.add(o2);
                    magazyn.add(o2);
                    System.out.println("Done");
                    menu();

            }
        }
        while(matrix <3);
        menu();

    }
    public void dodajNAVI(){
        System.out.println("Podaj ID produktu:\n");
        Scanner id = new Scanner(System.in);
        String id1 = id.nextLine();
        try{
            Integer.parseInt(id1);
        }
        catch (NumberFormatException e){
            System.out.println("Wprowadz liczbę");
            dodajNAVI();
        }
        catch (NullPointerException e){
            System.out.println("Nie wprowadzono żadnego znaku");
            dodajNAVI();
        }
        for (NAVI i :naviList){
            String y = i.getID();
            String x = "NAVI_"+ id1;
            if(y.equals(x)){
                System.out.println("Wprowadzony identyfikator jest zajęty wprowadz inny");
                dodajNAVI();
            }
        }
        System.out.println("Podaj Producenta\n");
        Scanner option = new Scanner( System.in );
        String manufacture = option.nextLine();
        System.out.println("Podaj Model\n");
        Scanner option1 = new Scanner( System.in );
        String model = option1.nextLine();

        System.out.println("Podaj przekątną ekranu(w calach):\n");
        Scanner diagonal = new Scanner(System.in);
        float diagonal1 = 0;
        try {
            diagonal1 = diagonal.nextInt();
        }
        catch(Exception e){
            System.out.println("Nie wprowadzono liczby - Przekątną podajemy w calach (liczba) - Wracasz na początek");
            dodajNAVI();
        }
        System.out.println("Wybierz mapy z poniższych (numer):\n1. Polska\n2. Europa\n");
        Scanner option5 = new Scanner( System.in );
        int matrix = option5.nextInt();
        System.out.println("Czy nawigacja posiada baze fotoradarów(t or n): \n");
        Scanner oprion6 = new Scanner(System.in);
        String foto = option5.nextLine();
        boolean foto1 = false;
        if (foto.equals("t") && foto.equals("T")){ foto1 = true;}
        if (foto.equals("n") && foto.equals("N")){foto1 = false;}

        do {

            switch (matrix) {
                case 1:
                    NAVI o1 = new NAVI(id1,manufacture, model, diagonal1, map.PL, foto1);
                    naviList.add(o1);
                    magazyn.add(o1);
                    System.out.println("Done");
                    menu();
                case 2:
                    NAVI o2 = new NAVI(id1,manufacture, model, diagonal1, map.EU, foto1);
                    naviList.add(o2);
                    magazyn.add(o2);
                    System.out.println("Done");
                    menu();

            }
        }
        while(matrix <3);
        menu();


    }

    public void dodajObiekt(){
        Scanner option = new Scanner( System.in );
        int numberOption;
        do {
            pokazMenuObiekt();
            numberOption = option.nextInt();
            switch(numberOption){

                case 1 : dodajCE();
                case 2 : dodajAGD();
                case 3 : dodajIT();
                case 4 : dodajGSM();
                case 5 : dodajNAVI();
                case 6 : menu();
            }
        }
        while(numberOption <7 );

    }
    private void usunObjekt() {
        Scanner option = new Scanner(System.in);
        int numberOption;
        do{
            pokazMenuUsun();
            numberOption = option.nextInt();
            switch(numberOption){
                case 1 : usunCE();
                case 2 : usunAGD();
                case 3 : usunIT();
                case 4 : usunGSM();
                case 5 : usunNAVI();
                case 6 : menu();
            }


        }
        while(numberOption <7);

    }
    public void usunCE(){
        for(CE i: tvList){
            System.out.println(i);
        }
        System.out.println("Wpisz identyfikator produktu do usunięcia(same cyfry) lub wpisz 'back' zeby wrócić do menu");
        Scanner id = new Scanner(System.in);
        String id1 = id.nextLine();
        if(id1.equals("back")){usunObjekt();}
        try{
            Integer.parseInt(id1);
        }
        catch (NumberFormatException e){
            System.out.println("Wprowadz liczbę");
            usunCE();
        }
        catch (NullPointerException e){
            System.out.println("Nie wprowadzono żadnego znaku");
            usunCE();
        }

        for(CE i: tvList){
            String x = i.getID();
            String y = "TV_"+id1;

            if (x.equals(y)) {
             tvList.remove(i);
                magazyn.add(i);
            System.out.println("OK");
            menu();
            }

    }
        System.out.println("Nie ma produktu o podanym identyfikatorze w bazie");
        usunCE();
    }
    public void usunAGD(){
        System.out.println("Z którego podtypu chcesz usunąc produkt:\n1. Małe AGD\n2. Duże AGD\n3. Powrót");
        Scanner option = new Scanner(System.in);
        int number = option.nextInt();
        do{
            switch (number){
                case 1 : usunmAGD();
                case 2 : usundAGD();
                case 3 : usunObjekt();
            }

        }
        while(number<4);
    }
    public void usunmAGD(){
        for(mAGD i: magdList){
            System.out.println(i);
        }
        System.out.println("Wpisz identyfikator produktu do usunięcia(same cyfry) lub wpisz 'back' zeby wrócić do menu");
        Scanner id = new Scanner(System.in);
        String id1 = id.nextLine();
        if(id1.equals("back")){usunObjekt();}
        try{
            Integer.parseInt(id1);
        }
        catch (NumberFormatException e){
            System.out.println("Wprowadz liczbę");
            usunmAGD();
        }
        catch (NullPointerException e){
            System.out.println("Nie wprowadzono żadnego znaku");
            usunmAGD();
        }

        for(mAGD i: magdList){
            String x = i.getID();
            String y = "mAGD_"+id1;

            if (x.equals(y)) {
                magdList.remove(i);
                agdList.remove(i);
                magazyn.add(i);
                System.out.println("OK");
                menu();
            }
        }
        System.out.println("Nie ma produktu o podanym identyfikatorze w bazie");
        usunAGD();

    }
    public void usundAGD(){
        for(dAGD i: dagdList){
            System.out.println(i);
        }
        System.out.println("Wpisz identyfikator produktu do usunięcia(same cyfry) lub wpisz 'back' zeby wrócić do menu");
        Scanner id = new Scanner(System.in);
        String id1 = id.nextLine();
        if(id1.equals("back")){usunObjekt();}
        try{
            Integer.parseInt(id1);
        }
        catch (NumberFormatException e){
            System.out.println("Wprowadz liczbę");
            usundAGD();
        }
        catch (NullPointerException e){
            System.out.println("Nie wprowadzono żadnego znaku");
            usundAGD();
        }

        for(dAGD i: dagdList){
            String x = i.getID();
            String y = "dAGD_"+id1;

            if (x.equals(y)) {
                dagdList.remove(i);
                agdList.remove(i);
                magazyn.add(i);
                System.out.println("OK");
                menu();
            }
        }
        System.out.println("Nie ma produktu o podanym identyfikatorze w bazie");
        usunAGD();

    }
    public void usunIT(){
        System.out.println("Z którego podtypu chcesz usunąc produkt:\n1. Laptopy\n2. Komputery stacjonarne\n3. Powrót");
        Scanner option = new Scanner(System.in);
        int number = option.nextInt();
        do{
            switch (number){
                case 1 : usunLapt();
                case 2 : usunKomp();
                case 3 : usunObjekt();
            }

        }
        while(number<4);

    }
    public void usunLapt(){
        for(Laptopy i: lapList){
            System.out.println(i);
        }
        System.out.println("Wpisz identyfikator produktu do usunięcia(same cyfry) lub wpisz 'back' zeby wrócić do menu");
        Scanner id = new Scanner(System.in);
        String id1 = id.nextLine();
        if(id1.equals("back")){usunObjekt();}
        try{
            Integer.parseInt(id1);
        }
        catch (NumberFormatException e){
            System.out.println("Wprowadz liczbę");
            usunLapt();
        }
        catch (NullPointerException e){
            System.out.println("Nie wprowadzono żadnego znaku");
            usunLapt();
        }

        for(Laptopy i: lapList){
            String x = i.getID();
            String y = "LAPT_"+id1;

            if (x.equals(y)) {
                lapList.remove(i);
                magazyn.add(i);
                itList.remove(i);
                System.out.println("OK");
                menu();
            }
        }
        System.out.println("Nie ma produktu o podanym identyfikatorze w bazie");
        usunIT();
    }
    public void usunKomp(){
        for(Komp i: kompList){
            System.out.println(i);
        }
        System.out.println("Wpisz identyfikator produktu do usunięcia(same cyfry) lub wpisz 'back' zeby wrócić do menu");
        Scanner id = new Scanner(System.in);
        String id1 = id.nextLine();
        if(id1.equals("back")){usunObjekt();}
        try{
            Integer.parseInt(id1);
        }
        catch (NumberFormatException e){
            System.out.println("Wprowadz liczbę");
            usunKomp();
        }
        catch (NullPointerException e){
            System.out.println("Nie wprowadzono żadnego znaku");
            usunKomp();
        }

        for(Komp i: kompList){
            String x = i.getID();
            String y = "KOMP_"+id1;

            if (x.equals(y)) {
                kompList.remove(i);
                itList.remove(i);
                magazyn.add(i);
                System.out.println("OK");
                menu();
            }
        }
        System.out.println("Nie ma produktu o podanym identyfikatorze w bazie");
        usunIT();

    }
    public void usunGSM(){
        for(GSM i: gsmList){
            System.out.println(i);
        }
        System.out.println("Wpisz identyfikator produktu do usunięcia(same cyfry) lub wpisz 'back' zeby wrócić do menu");
        Scanner id = new Scanner(System.in);
        String id1 = id.nextLine();
        if(id1.equals("back")){usunObjekt();}
        try{
            Integer.parseInt(id1);
        }
        catch (NumberFormatException e){
            System.out.println("Wprowadz liczbę");
            usunGSM();
        }
        catch (NullPointerException e){
            System.out.println("Nie wprowadzono żadnego znaku");
            usunGSM();
        }

        for(GSM i: gsmList){
            String x = i.getID();
            String y = "GSM_"+id1;

            if (x.equals(y)) {
                gsmList.remove(i);
                magazyn.add(i);
                System.out.println("OK");
                menu();
            }

        }
        System.out.println("Nie ma produktu o podanym identyfikatorze w bazie");
        usunGSM();
    }
    public void usunNAVI(){
        for(NAVI i: naviList){
            System.out.println(i);
        }
        System.out.println("Wpisz identyfikator produktu do usunięcia(same cyfry) lub wpisz 'back' zeby wrócić do menu");
        Scanner id = new Scanner(System.in);
        String id1 = id.nextLine();
        if(id1.equals("back")){usunObjekt();}
        try{
            Integer.parseInt(id1);
        }
        catch (NumberFormatException e){
            System.out.println("Wprowadz liczbę");
            usunNAVI();
        }
        catch (NullPointerException e){
            System.out.println("Nie wprowadzono żadnego znaku");
            usunNAVI();
        }

        for(NAVI i: naviList){
            String x = i.getID();
            String y = "NAVI_"+id1;

            if (x.equals(y)) {
                naviList.remove(i);
                magazyn.add(i);
                System.out.println("OK");
                menu();
            }

        }
        System.out.println("Nie ma produktu o podanym identyfikatorze w bazie");
        usunNAVI();
    }



    public void wyswietlObiekt(){



        for(CE i: tvList){
            //String x = i.getID();
            //System.out.println(x);
            System.out.println(i);
            //if (x == 345) {
               // tvList.remove(i);
                //System.out.println("OK");
            }
        for(AGD i: agdList){
            System.out.println(i);
        }
        for(IT i: itList){
            System.out.println(i);
        }
        for(GSM i: gsmList){
            System.out.println(i);
        }
        for(NAVI i: naviList){
            System.out.println(i);
        }
        System.out.println("Wciśnij enter");
        Scanner id = new Scanner(System.in);
        String id1 = id.nextLine();
        try{
            Integer.parseInt(id1);
        }
        catch (NumberFormatException e){

            menu();
        }
        catch (NullPointerException e){

            menu();
        }
        if(id1 != null){menu();}
    }
        //System.out.println(tvList.size());
    public void wyswietlPodtypObiekt(){
        Scanner option = new Scanner(System.in);
        int number_option = 0;
        do{
            pokazMenuWyswtietlObiekt();
            number_option = option.nextInt();
            switch(number_option){

                case 1 : pokażCE();
                case 2 : pokażAGD();
                case 3 : pokażIT();
                case 4 : pokażGSM();
                case 5 : pokażNAVI();
                case 6 : menu();
            }
        }
        while(number_option <7 );
        }
    public void pokażCE(){
        for(CE i: tvList){
            System.out.println(i);
        }
        System.out.println("Wciśnij enter");
        Scanner id = new Scanner(System.in);
        String id1 = id.nextLine();
        try{
            Integer.parseInt(id1);
        }
        catch (NumberFormatException e){

            menu();
        }
        catch (NullPointerException e){

            menu();
        }
        if(id1 != null){menu();}
    }
    public void pokażAGD(){
        System.out.println("Wybierz poddział:\n1. Małe AGD\n2. Duże AGD\n3. Powrót");
        Scanner option = new Scanner(System.in);
        int number;
        number = option.nextInt();
        do{
            switch (number){
                case 1 : for(mAGD i: magdList){
                                System.out.println(i);
                    System.out.println("Wciśnij enter");
                    Scanner id = new Scanner(System.in);
                    String id1 = id.nextLine();
                    try{
                        Integer.parseInt(id1);
                    }
                    catch (NumberFormatException e){

                        menu();
                    }
                    catch (NullPointerException e){

                        menu();
                    }
                    if(id1 != null){menu();}
                                }
                case 2 : for(dAGD i: dagdList){
                                System.out.println(i);
                                System.out.println("Wciśnij enter");
                    System.out.println("Wciśnij enter");
                    Scanner id = new Scanner(System.in);
                    String id1 = id.nextLine();
                    try{
                        Integer.parseInt(id1);
                    }
                    catch (NumberFormatException e){

                        menu();
                    }
                    catch (NullPointerException e){

                        menu();
                    }
                    if(id1 != null){menu();}
                                }
                case 3 : wyswietlPodtypObiekt();
            }
        }
        while (number<4);

    }
    public void pokażIT(){
        System.out.println("Wybierz poddział:\n1. Laptopy\n2. Komputery stacjonarne\n3. Powrót");
        Scanner option = new Scanner(System.in);
        int number;
        number = option.nextInt();
        do{
            switch (number){
                case 1 : for(Laptopy i: lapList){
                                System.out.println(i);
                    System.out.println("Wciśnij enter");
                    Scanner id = new Scanner(System.in);
                    String id1 = id.nextLine();
                    try{
                        Integer.parseInt(id1);
                    }
                    catch (NumberFormatException e){

                        menu();
                    }
                    catch (NullPointerException e){

                        menu();
                    }
                    if(id1 != null){menu();}
                                }
                case 2 : for(Komp i: kompList){
                                System.out.println(i);
                    System.out.println("Wciśnij enter");
                    Scanner id = new Scanner(System.in);
                    String id1 = id.nextLine();
                    try{
                        Integer.parseInt(id1);
                    }
                    catch (NumberFormatException e){

                        menu();
                    }
                    catch (NullPointerException e){

                        menu();
                    }
                    if(id1 != null){menu();}
                                }
                case 3 : wyswietlPodtypObiekt();
            }
        }
        while(number<4);

    }
    public void pokażGSM(){
        for(GSM i: gsmList){
            System.out.println(i);
        }
        System.out.println("Wciśnij enter");
        Scanner id = new Scanner(System.in);
        String id1 = id.nextLine();
        try{
            Integer.parseInt(id1);
        }
        catch (NumberFormatException e){

            menu();
        }
        catch (NullPointerException e){

            menu();
        }
        if(id1 != null){menu();}
    }
    public void pokażNAVI(){
        for(NAVI i: naviList){
            System.out.println(i);
        }
        System.out.println("Wciśnij enter");
        Scanner id = new Scanner(System.in);
        String id1 = id.nextLine();
        try{
            Integer.parseInt(id1);
        }
        catch (NumberFormatException e){

            menu();
        }
        catch (NullPointerException e){

            menu();
        }
        if(id1 != null){menu();}
    }

    public void wyswietlCiagZnakow(){
        System.out.println("Wprowadz ciąg znaków(pamiętaj o dużych małych znakach): ");
        Scanner test = new Scanner(System.in);
        String str = test.nextLine();
        for (CE i: tvList){
            String x = i.getManufacturer();
            String y = i.getModel();
            boolean t = x.contains(str);
            boolean f = y.contains(str);
            if (t == true || f == true){
                System.out.println(i);
            }
        }
        for (dAGD i: dagdList){
            String x = i.getMarka();
            String y = i.getModel();
            boolean t = x.contains(str);
            boolean f = y.contains(str);
            if (t == true || f == true){
                System.out.println(i);
            }
        }
        for (mAGD i: magdList){
            String x = i.getMarka();
            String y = i.getModel();
            boolean t = x.contains(str);
            boolean f = y.contains(str);
            if (t == true || f == true){
                System.out.println(i);
            }
        }
        for (Laptopy i: lapList){
            String x = i.getMarka();
            String y = i.getModel();
            boolean t = x.contains(str);
            boolean f = y.contains(str);
            if (t == true || f == true){
                System.out.println(i);
            }
        }
        for (Komp i: kompList){
            String x = i.getMarka();
            String y = i.getModel();
            boolean t = x.contains(str);
            boolean f = y.contains(str);
            if (t == true || f == true){
                System.out.println(i);
            }
        }
        for (GSM i: gsmList){
            String x = i.getMarka();
            String y = i.getModel();
            boolean t = x.contains(str);
            boolean f = y.contains(str);
            if (t == true || f == true){
                System.out.println(i);
            }
        }
        for (NAVI i: naviList){
            String x = i.getMarka();
            String y = i.getModel();
            boolean t = x.contains(str);
            boolean f = y.contains(str);
            if (t == true || f == true){
                System.out.println(i);
            }
        }
        System.out.println("Wciśnij enter");
        Scanner id = new Scanner(System.in);
        String id1 = id.nextLine();
        try{
            Integer.parseInt(id1);
        }
        catch (NumberFormatException e){

            menu();
        }
        catch (NullPointerException e){

            menu();
        }
        if(id1 != null){menu();}

    }
    public void konverter(){
        for(Laptopy i: lapList){
            int ram = i.ramToMb();
            System.out.println(i + "Ma: "+ram+" MB");
        }
        for(Komp i: kompList){
            int ram = i.ramToMb();
            System.out.println(i + " Ma: "+ram+" MB pamięci Ram");
        }
        menu();
    }
    public void czyzabudowa(){
        for(AGD i: agdList){
            boolean x = i.czyZabudowa();
            System.out.println(i + " Zabudowa: "+ x);
        }
        menu();
    }
    public void operation(){
        System.out.println("Wybierz operacje: \n1. Konwerter pamięci RAM z GB na MB\n2. Sprawdzenie które produkty AGD są do zabudowy\n3. Powrót\n");
        Scanner option = new Scanner(System.in);
        int number = option.nextInt();
        do{
            switch (number){
                case 1 : konverter();
                case 2 : czyzabudowa();
                case 3 : menu();
            }
        }
        while (number<4);
    }

    public void menu(){
        Scanner option = new Scanner( System.in );
        int numberOption;
        do {
            pokazMenu();
            numberOption = option.nextInt();
            switch(numberOption){

                case 1 : dodajObiekt();
                case 2 : usunObjekt();
                case 3 : wyswietlObiekt();
                case 4 : wyswietlPodtypObiekt();
                case 5 : wyswietlCiagZnakow();
                case 6 : operation();
                case 7 : System.exit(0);
            }
        }
        while(numberOption <8 );

    }



}
