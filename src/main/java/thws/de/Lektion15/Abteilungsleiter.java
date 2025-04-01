package thws.de.Lektion15;

public class Abteilungsleiter extends Angestellter {
    
    public Abteilungsleiter(String nachname, String vorname,int id,double grundgehalt, double gehalt, double gehaltsfaktor, String gb ){
        super(nachname, vorname, id, grundgehalt, gehalt, 2, gb);
    }

    public void befoerdern(Angestellter in){
        in.setGehaltsfaktor(1.1);
        in.setGehalt(in.getGrundgehalt()*1.1);
    }
}
