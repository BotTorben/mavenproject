package thws.de.Lektion15.Uebung2;

public class Professor extends Person {
    
    public Professor(String fach){
        super(fach);
    }

    @Override
    public void gibtTaetigkeitAus(){
        System.out.println("Der Professor unterrichtet " + fach + ".");
    }
}
