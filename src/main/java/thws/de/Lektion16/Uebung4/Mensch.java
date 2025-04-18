package thws.de.Lektion16.Uebung4;

import java.util.Random;

public class Mensch implements Autofahrer {
    private Random random = new Random();

    @Override
    public Entscheidung entscheide(Gefahr g) {
        if (random.nextDouble() < 0.25) {
            return Entscheidung.UNENTSCHIEDEN;
        }

        return switch (g) {
            case GEFAHR_LINKS -> Entscheidung.RECHTS;
            case GEFAHR_RECHTS -> Entscheidung.LINKS;
            case GEFAHR_VORNE -> Entscheidung.BREMSEN;
        };
    }
}

