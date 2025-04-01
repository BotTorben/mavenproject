package thws.de.Lektion15.Uebung3;

public abstract class QuizFragen {

    QuizFragen next;
    
    String fragentext;

    public QuizFragen(String fragentext){
        this.fragentext = fragentext;
    }

    public abstract String erstelleFrage();

}
