package thws.de.Lektion14Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import thws.de.Lektion14.Punkt;

public class PunktTest {
    Punkt p = new Punkt();
    
    @Test
    public void testPunktKleinerNull(){
        assertThrows(RuntimeException.class, ()-> p.verschiebePunkt(-1, 1));
        assertThrows(RuntimeException.class, ()-> p.verschiebePunkt(1, -1));
    }

    @Test
    public void testPunktYzuGross(){
        assertThrows(RuntimeException.class, ()-> p.verschiebePunkt(2, 1081));
    }

    @Test
    public void testPunktXzuGross(){
        assertThrows(RuntimeException.class, ()-> p.verschiebePunkt(1921, 2));
    }

    @Test
    public void testPunktXpasst(){
        p.verschiebePunkt(200, 300);
        assertTrue(200 == p.getX());
        assertTrue(300 == p.getY());
    }
}
