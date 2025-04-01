package thws.de.Lektion15.Uebung3;

public class Multiplechoicefrage extends QuizFragen {
    
    String[] antworten;

    public Multiplechoicefrage(String fragentext, String[] antworten){
        super(fragentext);
        this.antworten = antworten;
    }

    @Override
    public String erstelleFrage(){
        String out = fragentext + "\n";
        char a = 'A';
        for (int i = 0; i < antworten.length; i++){
            out += a + ": " + antworten[i].toString() + "\n";
            a++;
        }
        return out;
    }
}
