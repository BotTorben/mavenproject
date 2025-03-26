package thws.de;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import thws.de.example.Example;

public class ExampleTest {
    @Test
    public void executeTest(){
        Example example = new Example();
        int returnValue = example.execute();
        assertEquals(1, returnValue, "Der Rückgabewert entspricht nicht");
    }
}
