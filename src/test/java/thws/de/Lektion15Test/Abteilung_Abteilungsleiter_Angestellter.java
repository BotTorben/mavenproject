package thws.de.Lektion15Test;

import thws.de.Lektion15.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Abteilung_Abteilungsleiter_Angestellter {
    
    Angestellter neu = new Angestellter("Max", "Muster", 1, 2000.0, 0, 1, "01.01.2000");
    Angestellter[] ar = {neu};
    Abteilungsleiter ab = new Abteilungsleiter("Felix", "Muster", 2, 3000.0, 0, 2, "02.02.1999");
    Abteilung abt = new Abteilung(ar, ab);

    @Test
    public void abteilungsleiterTest(){
        assertTrue(2 == ab.getGehaltsfaktor());
        assertTrue(ab.getGrundgehalt()*2 == ab.getGehalt());
    }

    @Test
    public void angestellterTest(){
        assertTrue(neu.getGrundgehalt() == neu.getGehalt());
        ab.befoerdern(neu);
        assertTrue(neu.getGrundgehalt()*1.1 == neu.getGehalt());
    }
}
