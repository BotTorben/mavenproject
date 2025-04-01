package thws.de.Lektion15.Uebung3;

public class Textfrage extends QuizFragen {

    public Textfrage(String fragentext){
        super(fragentext);
    }
    
    @Override
    public String erstelleFrage(){
        return fragentext + "\nAntwort:\n\n";
    }
}
