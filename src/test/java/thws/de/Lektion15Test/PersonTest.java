package thws.de.Lektion15Test;

import thws.de.Lektion15.Uebung2.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PersonTest {
    
    @Test
    public void studentTest(){
        Person st = new Student("Programmieren");
        assertEquals("Programmieren" , st.getFach());
    }
    
    @Test
    public void professorTest(){
        Person pf = new Professor("Programmieren");
        assertEquals("Programmieren" , pf.getFach());
    }
}
