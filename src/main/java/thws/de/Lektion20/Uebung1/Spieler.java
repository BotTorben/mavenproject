package thws.de.Lektion20.Uebung1;

import java.util.*;

public class Spieler {
    private String name;
    private Set<Karte> hand = new HashSet<>();

    public Spieler(String name, int anzahlKarten) {
        this.name = name;
        generiereZufaelligeHand(anzahlKarten);
    }

    private void generiereZufaelligeHand(int anzahl) {
        List<Karte> deck = new ArrayList<>();
        for (Farbe f : Farbe.values()) {
            for (Wert w : Wert.values()) {
                deck.add(new Karte(f, w));
            }
        }
        Collections.shuffle(deck);
        for (int i = 0; i < anzahl && i < deck.size(); i++) {
            hand.add(deck.get(i));
        }
    }

    public void zeigeHand() {
        System.out.println(name + " hat folgende Karten auf der Hand:");
        for (Karte k : hand) {
            System.out.println(" - " + k);
        }
    }
}
