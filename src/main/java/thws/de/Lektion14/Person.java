package thws.de.Lektion14;

public class Person {
    
    String vorname;
    String nachname;
    String strasse;
    String hausnummer;
    int postleitzahl;
    String ort;

    public Person(String vorname, String nachname, String strasse, String hausnummer, int postleitzahl, String ort){
        this.vorname = vorname;
        this.nachname = nachname;
        //exeption bei ungültiger Adresse
        if(!(strasse.charAt(0) >= 'A' && strasse.charAt(0) <= 'Z') || 
           !(ort.charAt(0) >= 'A' && ort.charAt(0) <= 'Z') || 
           !(hausnummer.charAt(0) >= '0' && hausnummer.charAt(0) <= '9')){
            throw new RuntimeException("Falscher Wert bei der Adresse");
        } else {
            this.strasse = strasse;
            this.hausnummer = hausnummer;
            this.ort = ort;
        }
        this.postleitzahl = postleitzahl;
    }
}
