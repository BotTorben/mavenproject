package thws.de.Lektion16.Uebung3.inheritance;

import java.util.ArrayList;

public class StackMitInterface implements StackInterface {
    private ArrayList<Object> elements = new ArrayList<>();

    @Override
    public void push(Object o) {
        elements.add(o);
    }

    @Override
    public Object pop() {
        if (elements.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return elements.remove(elements.size() - 1);
    }
}
