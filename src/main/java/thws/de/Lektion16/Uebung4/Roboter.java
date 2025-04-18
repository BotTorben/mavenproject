package thws.de.Lektion16.Uebung4;

public class Roboter implements Autofahrer {
    @Override
    public Entscheidung entscheide(Gefahr g) {
        return switch (g) {
            case GEFAHR_LINKS -> Entscheidung.RECHTS;
            case GEFAHR_RECHTS -> Entscheidung.LINKS;
            case GEFAHR_VORNE -> Entscheidung.BREMSEN;
        };
    }
}
