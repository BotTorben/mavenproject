package thws.de.Lektion14Test;

import thws.de.Lektion14.Strecke;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StreckeTest {
    @Test
    public void testKonstruktorRichtigeReihenfolge() {
        Strecke strecke1 = new Strecke(5, 3);
        assertEquals(3, strecke1.getA());
        assertEquals(5, strecke1.getB());
        
        Strecke strecke2 = new Strecke(2, 8);
        assertEquals(2, strecke2.getA());
        assertEquals(8, strecke2.getB());
    }
    
    @Test
    public void testUeberscheidung() {
        Strecke s1 = new Strecke(2, 6);
        Strecke s2 = new Strecke(2, 6);
        assertTrue(s1.ueberpruefeUeberschneidung(s1, s2));
        
        Strecke s3 = new Strecke(1, 3);
        Strecke s4 = new Strecke(5, 7);
        assertFalse(s3.ueberpruefeUeberschneidung(s3, s4));
        
        Strecke s5 = new Strecke(3, 5);
        Strecke s6 = new Strecke(5, 7);
        assertFalse(s5.ueberpruefeUeberschneidung(s5, s6));
    }
    
    @Test
    public void testToString() {
        Strecke strecke1 = new Strecke(3, 5);
        assertEquals("3--5", strecke1.toString());
        
        Strecke strecke2 = new Strecke(2, 8);
        assertEquals("2------8", strecke2.toString());
        
        Strecke strecke3 = new Strecke(4, 4);
        assertEquals("4", strecke3.toString());
    }
}
