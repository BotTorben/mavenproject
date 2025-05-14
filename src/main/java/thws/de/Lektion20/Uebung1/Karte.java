package thws.de.Lektion20.Uebung1;


public class Karte {
    private final Farbe farbe;
    private final Wert wert;

    public Karte(Farbe farbe, Wert wert) {
        this.farbe = farbe;
        this.wert = wert;
    }

    public Farbe getFarbe() {
        return farbe;
    }

    public Wert getWert() {
        return wert;
    }

    @Override
    public String toString() {
        return farbe + " " + wert;
    }
}

