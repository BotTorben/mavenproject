package thws.de.Lektion16Test;

import thws.de.Lektion16.Uebung1.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BrettTest {
    
    @Test
    public void kombiniereTest(){
        Brett brett1 = new Brett();
        brett1.markiereFeld(1, 1);
        brett1.markiereFeld(2, 2);

        Brett brett2 = new Brett();
        brett2.markiereFeld(2, 2);
        brett2.markiereFeld(3, 3);

        Brett kombiniert = brett1.kombiniere(brett2);

        assertTrue(kombiniert.gibFeld(1, 1), "(1,1) sollte markiert sein");
        assertTrue(kombiniert.gibFeld(2, 2), "(2,2) sollte markiert sein");
        assertTrue(kombiniert.gibFeld(3, 3), "(3,3) sollte markiert sein");

    }
}
