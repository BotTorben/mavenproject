package thws.de.Lektion15.Uebung2;

public class Perso_Main {
    
    public static void main(String[] args){
        Person[] person = new Person[100];
        for(int i = 0; i < person.length; i++){
            if (i % 2 == 0){
                person[i] = new Student("Programmieren");
            } else {
                person[i] = new Professor("Programmieren");
            }
        }

        for(int i = 0; i < person.length; i++){
            person[i].gibtTaetigkeitAus();
        }
    }
}
