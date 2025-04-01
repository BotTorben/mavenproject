package thws.de.Lektion15.Uebung2;

public class Student extends Person{
    
    public Student(String fach) {
        super(fach);
    }

    @Override
    public void gibtTaetigkeitAus(){
        System.out.println("Der Student besucht das Fach " + fach + ".");
    }

}
