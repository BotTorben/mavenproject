package thws.de.Lektion16.Uebung3. inheritance;

import java.util.ArrayList;

//Klasse zum Upload ins e-learning
@SuppressWarnings("all")
public class StackVererbung extends ArrayList<Object>{
    public void push(Object o) {
        this.add(o);
    }

    public Object pop() {
        if (this.size() == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        return this.remove(this.size() - 1);
    }
}

