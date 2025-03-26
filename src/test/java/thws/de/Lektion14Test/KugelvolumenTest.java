package thws.de.Lektion14Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import thws.de.Lektion14.Kugelvolumen;

public class KugelvolumenTest {
    
    @Test
    public void testKugelvolumenNull() {
        assertEquals(0.0, Kugelvolumen.berecheneKugelvolumen(0.0), 0.0001);
    }

    @Test
    public void testKugelvolumenPositiv() {
        assertEquals((4.0 / 3.0) * Math.PI * 5.0 * 5.0 * 5.0, Kugelvolumen.berecheneKugelvolumen(5.0), 0.0001);
    }

    @Test
    public void testKugelvolumenNegativ() {
        assertThrows(RuntimeException.class, () -> Kugelvolumen.berecheneKugelvolumen(-1));
    }
}
