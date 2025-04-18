package thws.de.Lektion16.Uebung3.inheritance;

import java.util.ArrayList;

public class StackKomposition {
    private ArrayList<Object> elements = new ArrayList<>();

    public void push(Object o) {
        elements.add(o);
    }

    public Object pop() {
        if (elements.size() == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        return elements.remove(elements.size() - 1);
    }
}
