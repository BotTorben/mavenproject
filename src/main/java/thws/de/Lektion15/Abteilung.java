package thws.de.Lektion15;

public class Abteilung {
    
    Angestellter[] angestellt;
    Abteilungsleiter abteilungsleit;

    public Abteilung(Angestellter[] angestellt, Abteilungsleiter abteilungsleit){
        this.angestellt = angestellt;
        this.abteilungsleit = abteilungsleit;
    }

    public Abteilungsleiter getAbteilungsleit() {
        return abteilungsleit;
    }
}
