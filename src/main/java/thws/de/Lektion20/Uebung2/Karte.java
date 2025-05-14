package thws.de.Lektion20.Uebung2;

import java.util.Objects;

public class Karte implements Comparable<Karte> {
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

    @Override
    public int compareTo(Karte other) {
        // 1. Buben zuerst, in Buben-Reihenfolge
        if (this.wert == Wert.BUBE && other.wert != Wert.BUBE) return -1;
        if (this.wert != Wert.BUBE && other.wert == Wert.BUBE) return 1;
        if (this.wert == Wert.BUBE && other.wert == Wert.BUBE) {
            return Integer.compare(this.farbe.ordinal(), other.farbe.ordinal());
        }

        // 2. Farben vergleichen (KREUZ < PIK < HERZ < KARO)
        int farbenVergleich = Integer.compare(this.farbe.ordinal(), other.farbe.ordinal());
        if (farbenVergleich != 0) return farbenVergleich;

        // 3. Werte innerhalb der Farbe vergleichen (nach Skat-Reihenfolge)
        int thisWertIndex = skatWertIndex(this.wert);
        int otherWertIndex = skatWertIndex(other.wert);
        return Integer.compare(thisWertIndex, otherWertIndex);
    }

    private int skatWertIndex(Wert w) {
        return switch (w) {
            case ASS -> 0;
            case ZEHN -> 1;
            case KOENIG -> 2;
            case DAME -> 3;
            case NEUN -> 4;
            case ACHT -> 5;
            case SIEBEN -> 6;
            default -> 99; // Sollte nie passieren
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Karte)) return false;
        Karte karte = (Karte) o;
        return farbe == karte.farbe && wert == karte.wert;
    }

    @Override
    public int hashCode() {
        return Objects.hash(farbe, wert);
    }
}
