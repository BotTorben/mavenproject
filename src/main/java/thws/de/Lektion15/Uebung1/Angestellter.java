package thws.de.Lektion15.Uebung1;

public class Angestellter {

    String nachname;
    String vorname;
    int id;
    double grundgehalt;
    double gehalt;
    double gehaltsfaktor;
    String gb;

    public Angestellter(String nachname, String vorname, int id, double grundgehalt,double gehalt, double gehaltsfaktor, String gb){
        this.nachname = nachname;
        this.vorname = vorname;
        this.id = id;
        this.grundgehalt = grundgehalt;
        this.gehalt = grundgehalt * gehaltsfaktor;
        this.gehaltsfaktor = gehaltsfaktor;
        this.gb = gb;
    }

    public double getGehaltsfaktor() {
        return gehaltsfaktor;
    }

    public double getGehalt() {
        return gehalt;
    }

    public double getGrundgehalt() {
        return grundgehalt;
    }

    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }

    public void setGehaltsfaktor(double gehaltsfaktor) {
        this.gehaltsfaktor = gehaltsfaktor;
    }


    
}
