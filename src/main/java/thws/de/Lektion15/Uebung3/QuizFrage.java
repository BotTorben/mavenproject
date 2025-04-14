package thws.de.Lektion15.Uebung3;

public abstract class QuizFrage {

    QuizFrage next;
    
    String fragentext;

    public QuizFrage(String fragentext){
        this.fragentext = fragentext;
    }

    public abstract String erstelleFrage();

}
