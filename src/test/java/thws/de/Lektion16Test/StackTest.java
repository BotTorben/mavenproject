package thws.de.Lektion16Test;

import thws.de.Lektion16.Uebung3.inheritance.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    @Test
    public void testPushAndPop() {
        StackMitInterface stack = new StackMitInterface();
        stack.push("Test");
        stack.push(123);

        assertEquals(123, stack.pop());
        assertEquals("Test", stack.pop());
    }

    @Test
    public void testPopEmptyStack() {
        StackMitInterface stack = new StackMitInterface();
        assertThrows(IllegalStateException.class, stack::pop);
    }
}
