package thws.de.Lektion16Test;

import thws.de.Lektion16.Uebung4.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CyborgTest {

    @Test
    public void testRoboterEntscheidung() {
        Roboter roboter = new Roboter();
        assertEquals(Entscheidung.RECHTS, roboter.entscheide(Gefahr.GEFAHR_LINKS));
        assertEquals(Entscheidung.LINKS, roboter.entscheide(Gefahr.GEFAHR_RECHTS));
        assertEquals(Entscheidung.BREMSEN, roboter.entscheide(Gefahr.GEFAHR_VORNE));
    }

    @Test
    public void testMenschEntscheidungMitMock() {
        // Für echten Test müsste man Random mocken → z.B. über Dependency Injection oder Mockito
        Mensch mensch = new Mensch();
        Entscheidung e = mensch.entscheide(Gefahr.GEFAHR_VORNE);
        assertNotNull(e); // Kann BREMSEN oder UNENTSCHIEDEN sein
    }

    @Test
    public void testCyborgEntscheidung() {
        Cyborg cyborg = new Cyborg();
        Entscheidung e = cyborg.entscheide(Gefahr.GEFAHR_RECHTS);
        assertNotNull(e); // Muss gültige Entscheidung sein
    }
}
