package thws.de.Lektion20.Uebung2;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Karte> deck = new ArrayList<>();
        for (Farbe f : Farbe.values()) {
            for (Wert w : Wert.values()) {
                deck.add(new Karte(f, w));
            }
        }
        Collections.shuffle(deck);
        List<Karte> hand = deck.subList(0, 10);

        System.out.println("Unsortierte Hand:");
        hand.forEach(System.out::println);

        Collections.sort(hand);

        System.out.println("\nSortierte Skat-Hand:");
        hand.forEach(System.out::println);
    }
}