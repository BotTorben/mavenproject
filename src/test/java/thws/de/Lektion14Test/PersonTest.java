package thws.de.Lektion14Test;

import thws.de.Lektion14.Person;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PersonTest {
    
    @Test
    public void testGueltigePerson(){
        Person p = new Person("Max", "Mustermann", "Musterstrasse", "1a", 11111, "Musterstadt");
        assertNotNull(p);
    }

    @Test
    public void testFehlerStrasse(){
        assertThrows(RuntimeException.class,()-> new Person("Max", "Mustermann", "musterstrasse", "1a", 11111, "Musterstadt"));
    }

    @Test
    public void testFehlerOrt(){
        assertThrows(RuntimeException.class,()-> new Person("Max", "Mustermann", "Musterstrasse", "1a", 11111, "musterstadt"));
    }

    @Test
    public void testFehlerHausnummer(){
        assertThrows(RuntimeException.class,()-> new Person("Max", "Mustermann", "musterstrasse", "a1", 11111, "Musterstadt"));
    }
}
