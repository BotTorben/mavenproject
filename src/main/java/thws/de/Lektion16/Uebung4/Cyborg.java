package thws.de.Lektion16.Uebung4;

import java.util.Random;

public class Cyborg implements Autofahrer {
    private Mensch mensch = new Mensch();
    private Roboter roboter = new Roboter();
    private Random random = new Random();

    @Override
    public Entscheidung entscheide(Gefahr g) {
        Entscheidung menschE = mensch.entscheide(g);
        Entscheidung roboterE = roboter.entscheide(g);

        if (menschE == roboterE) {
            return menschE;
        }

        // Wenn eine Entscheidung UNENTSCHIEDEN ist, nimm die andere
        if (menschE == Entscheidung.UNENTSCHIEDEN) return roboterE;
        if (roboterE == Entscheidung.UNENTSCHIEDEN) return menschE;

        // Zufällige Entscheidung zwischen menschlicher und robotischer
        return random.nextBoolean() ? menschE : roboterE;
    }
}