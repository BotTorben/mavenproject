package thws.de.Lektion15.Uebung2;

public abstract class Person {

    String fach;

    public Person(String fach){
        this.fach = fach;
    }

    public String getFach() {
        return fach;
    }
    
    public abstract void gibtTaetigkeitAus();


}
