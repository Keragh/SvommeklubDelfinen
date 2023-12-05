public class Medlem {
    String navn;
    int alder;
    boolean hold; // note til selv - true = konkurrencehold, false = motionshold - temp !
    protected static int næsteID = 0;
    protected int medlemsID;
    boolean aktivitetsStatus;
    double kontingent;

    //Constructor
    public Medlem (String navn, int alder, boolean hold, boolean erAktiv){
        this.navn = navn;
        this.alder = alder;
        this.hold = hold;
        næsteID++;
        medlemsID = næsteID;
        this.aktiv= erAktiv;
    }
    public Integer getMedlemID () {
        return medlemsID;
    }
    public String getMedlemNavn () {
        return navn;
    }
    public Boolean getHold () {
        return hold;
    }
    public String holdNavn () {
        if (hold) {return "Konkurrencehold";}
        else return "Motionshold";
    }
    public void Konkurrencesvømmer(boolean aktivitetsStatus) {
        if (!aktivitetsStatus) {
            this.kontingent = 500;
        }
    }
    public void kategoriserSvømmer(int alder) {
        if (alder <= 17) {
            this.kontingent = 1000;
        } else if (alder <= 65) {
            this.kontingent=1600;
        } else {
            this.kontingent=1100;
        }
    }

    // Metode til at ændre aktivitetsstatus
    public void sætAktiv(boolean erAktiv) {
        this.aktiv = erAktiv;
    }
    // toString-metode for at konvert objekter til en string
    @Override
    public String toString() {
        return "Navn: " + navn + "\n" + "Alder: " + alder + "\n" +"MedlemID: " + medlemsID + "\nHold: "+holdNavn();
    }

    // Laver en midlertidig main-metode, opretter 2 eksmepler på nyt medlem for at teste det virker
    public static void main(String[] args) {
        Medlem medlem1 = new Medlem("John Olsen", 60, true);
        Medlem medlem2 = new Medlem("Mariah Carey", 18, false);

        System.out.println(medlem1);
        System.out.println(medlem2);

    }
}
